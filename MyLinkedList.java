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
 public String toString(){
 }

 public Integer get(int index){}
 public Integer set(int index, Integer value){}
 public boolean contains(Integer value){}
 public int indexOf(Integer value){}
 public void add(int index, Integer value){}
 public Integer remove(int index){}
 public Integer remove(Integer value){} // indexOf() would be useful



}
