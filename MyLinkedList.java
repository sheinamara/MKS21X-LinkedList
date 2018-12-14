public class MyLinkedList{
 private int length;
 private Node start,end;

 // constructor
 public MyLinkedList(){
   length = 0;
 }

 // second constructor but don't know if it works
 /*
 public MyLinkedList(int length_, Node start_, Node end_){
   length = length_;
   if (start_ == end_){
     length = 1;
   }
   if (start_ == null && end_ == null){
     length = 0;
   }
   start = start_;
   end = end_;
 }
 */

 // getting the length
 public int size(){
   return length;
 }

 public boolean add(int value){
   Node toAdd;
   if (this.size() == 0){
     toAdd = new Node(value, null, null);
     // it will be both the start and end
     start = toAdd;
     end = toAdd;
     length = length + 1;
   }
   else{
     toAdd = new Node(value, null, end);
     // the thing we need to add will have a null as the next and the orginal end as the previous
     end.setNext(toAdd);
     // first, we set the original end's next things to the thing we are going to add
     end = toAdd;
     // then, we set the end as the thing we want to add
     length = length + 1;
     // increment length
   }
   return true;
   // it can never be false???
 }

 // makes into String
 public String toString(){
   Node current = start;
   String toReturn = "" + current;
   while (current.next() != null){
     toReturn = toReturn + ", " + current.next();
   }
   return toReturn;
 }

 public Integer get(int index){
   if (index > this.size()){
     return 0;
   }
   int bingo = 0;
   while (index != 0){
     bingo = this.getNext();
     index = index - 1;
   }
   return bingo;
 }

 /*
 public Integer set(int index, Integer value){

 }
 public boolean contains(Integer value){

 }
 public int indexOf(Integer value){

 }
 public void add(int index, Integer value){

 }
 public Integer remove(int index){

 }
 public boolean remove(Integer value){

 } // indexOf() would be useful
 */
}
