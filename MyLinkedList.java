public class MyLinkedList{
 private int size;
 private Node start,end;

 // constructor
 public MyLinkedList(int size_, Node start_, Node end_){
   size = size_;
   if (start_ == end_){
     size = 1;
   }
   if (start_ == null && end_ == null){
     size = 0;
   }
   start = start_;
   end = end_;
 }

 public int size(){
   return size;
 }

 public boolean add(int value){

 }
 public String toString();
}
