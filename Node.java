public class Node{
 private int data;
 private Node next,prev;

 // constructor
 public Node(int data_, Node next_, Node prev_){
   data = data_;
   next = next_;
   prev = prev_;
 }

 // gets the next value
 public Node next(){
   return next;
 }

 // gets the previous value
 public Node prev(){
   return prev;
 }

 // gets the data as a whole
 public Integer getData(){
   return data;
 }

 // changes the value of the next value
 public void setNext(Node other){
   next = other;
 }

 // changes the value of the previous value
 public void setPrev(Node other){
   prev = other;
 }

 // changes the data as a whole
 public Integer setData(Integer i){
   data = i;
   return data;
 }

 // makes into a String
 public String toString(){
   return "" + this.getData();
 }
}
