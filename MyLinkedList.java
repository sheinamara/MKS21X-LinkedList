public class MyLinkedList{
 private int length;
 private Node start,end;

 // constructor
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

 public int size(){
   return length;
 }

 public boolean add(int value){
   if (this.size() == 0){

   }
 }
 public String toString(){
 }

 public Integer get(int index){
   if (index > this.size()){
     return 0;
   }
   int bingo = 0
   while (index != 0){
     bingo = getNext;
     index = index - 1;
   }
   return bingo;
 }
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
 public Integer remove(Integer value){

 } // indexOf() would be useful



}
