public class MyLinkedList{
 private int length;
 private Node start,end;

 // constructor
 public MyLinkedList(){
   length = 0;
   start = null;
   end = null;
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

 // Returns the number of elements in this list.
 public int size(){
   return length;
 }

 // Appends the specified element to the end of this list.
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

 // Returns a string representation of this collection.
 public String toString(){
   if (this.size() == 0){
     return "[]";
   }
   Node current = start;
   String toReturn = "[" + current;
   while (current.next() != null){
     toReturn = toReturn + ", " + current.next();
   }
   toReturn = toReturn + "]";
   return toReturn;
 }

 // Returns the element at the specified position in this list.
 public Integer get(int index) throws IndexOutOfBoundsException{
   if (index > this.size() || index < 0){
     throw new IndexOutOfBoundsException("Your index is greater than the length of the list! Or it's negative!!!");
   }
   Node current = start;
   // we start at the first Node of the MyLinkedList
   while (index - 1 != 0 || current.next() != null){
     // we are going to keep looking at the one in front of us, so we have the index we want minus one
     current = current.next();
     // set the current as the node after
     index = index - 1;
     // subtract the index by one because we are one node closer
   }
   return current.getData();
   // get the "current" data which is list(index - 1 + 1)
 }

 // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
 public int indexOf(Integer value){
   int index = 0;
   // keeps track of index
   Node current = this.start;
   // current node
   while (index < this.size()){
     // while index is in bounds!!!
     if (current.getData() == value){
       // if the current data is the value we want
       return index;
       // we return the index!!!
     }
     current = current.next();
     index = index + 1;
     // incrementation
   }
   return -1;
   // -1 means the value isn't there
 }

 // Returns true if this list contains the specified element.
 public boolean contains(Integer value){
   boolean inside = false;
   int index = 0;
   // keeps track of index
   Node current = this.start;
   while (index < this.size()){
     // while index is in bounds!!!
     if (current.getData() == value){
       inside = true;
       // if value is found inside the data, boolean is true
     }
     current = current.next();
     index = index + 1;
     // incrementation
   }
   return inside;
 }

 // HELPER METHOD
 // gets the NODE at a given index
 // private method because return type is Node
 private Node getNode(int index){
   int currentIndex = 0;
   // start off at the first index
   Node currentNode = this.start;
   // start off at the first Node
   while (currentIndex != index && currentIndex < this.size()){
     // while we are not yet up to the index we need and haven't gone over the length
     currentNode = currentNode.next();
     currentIndex = currentIndex + 1;
     // incrementation
   }
   return currentNode;
   // when the while loop fails, it means we have gotten to our destination!!!
 }

 // Replaces the element at the specified position in this list with the specified element.
 // USES A HELPER METHOD
 public Integer set(int index, Integer value) throws IndexOutOfBoundsException{
   if (index > this.size() || index < 0){
     throw new IndexOutOfBoundsException("Your index is greater than the length of the list! Or it's negative!!!");
   }
   Integer oldValue = this.getNode(index).getData();
   // save the data of the old Node's value!!!
   this.getNode(index).setData(value);
   // set the data of the desired Node to our desired data
   return oldValue;
 }

 // Inserts the specified element at the specified position in this list.
 // USES HELPER METHOD
 public void add(int index, Integer value) throws IndexOutOfBoundsException{
   if (index > this.size() || index < 0){
     throw new IndexOutOfBoundsException("Your index is greater than the length of the list! Or it's negative!!!");
   }
   if (index == 0){
     // if you want to add to the front
     Node toAdd = new Node(value, null, start);
     // the thing we want to add will have a value of value, the previous node as null, and the next node as the current start
     this.start.setPrev(toAdd);
     // make this one the first node
     toAdd.setNext(this.start);
     // set the next of the node we just added the original start
     this.start = toAdd;
     // make the start the one we just added
     this.length = this.length + 1;
     // increment the length
   }
   if (this.size() < 0){
     // if there is nothing
     Node toAdd = new Node(value, null, null);
     start = toAdd;
     this.length = this.length + 1;
     // increment the length
   }
   if (index == this.size()){
     // if you want to add to the last
     add(value);
     // we have a method to do that
   }
   else{
     Node before = this.getNode(index - 1);
     // the one before the wanted index
     Node after = before.next();
     // the one at the wanted index
     Node toAdd = new Node(value, before, after);
     before.setNext(toAdd);
     after.setPrev(toAdd);
     this.length = this.length + 1;
     // increment the length
   }
 }

  /*
 public Integer remove(int index){

 }
 public boolean remove(Integer value){

 } // indexOf() would be useful
 */
}
