public class Node{
 private int data;
 private Node next,prev;

 // constructor
 public Node(int data_, Node next_, Node prev_){
   data = data_;
   next = next_;
   prev = prev_;
 }


 public Node next(){
   return next;
 }
 public Node prev(){
   return prev;
 }
 public void setNext(Node other){
   next = other;
 }
 public void setPrev(Node other){
   prev = other;
 }
 public Integer getData(){
   return data;
 }
 public Integer setData(Integer i){
   data = i;
   return data;
 }
 public String toString(){
   
 }


}
