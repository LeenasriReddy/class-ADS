package prorityqueuedemo2;
import java.util.*;
import java.util.Comparator;
public class ProrityQueueDemo2 {
 public static void main(String[] args) {
 PriorityQueue q = new PriorityQueue(15, new MyComparator());
 q.offer("A");
 q.offer("Z");
 q.offer("L");
 q.offer("B");
 System.out.println(q);//[Z, B, L, A]
 }
}
class MyComparator implements Comparator {
 @Override
 public int compare(Object obj1, Object obj2) {
 String s1 = (String) obj1;
 String s2 = obj2.toString();
 return s2.compareTo(s1);
 }
}