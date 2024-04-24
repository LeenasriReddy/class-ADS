/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minheapusingpriorityqueue;
import java.util.Collections;
import java.util.PriorityQueue;
public class MinHeapUsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        heap.add(11);
        heap.add(2);
        heap.add(10);
        heap.add(7);
        heap.add(3);
        heap.add(8);
        System.out.println(heap);
        System.out.println("size of heap:"+heap.size());
        System.out.println("max in heap:"+heap.peek());
        System.out.println("Deleted Element:"+heap.poll());
        System.out.println("after deletion");
        System.out.println(heap);
        System.out.println("size of heap:"+heap.size());
        System.out.println("Deleted Element:"+heap.poll());
        System.out.println(heap);
        System.out.println("max in heap:"+heap.peek());
        
    }
    
}
