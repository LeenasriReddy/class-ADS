/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueuedemo;
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        for(int i=0; i<=10;i++){
            q.offer(i);
            
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        
    }
    
}
