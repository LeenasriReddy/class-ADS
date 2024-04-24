/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priority1;
import java.util.Collections;
        import java.util.PriorityQueue;

 class Priority1 {

   
    public static void main(String[] args) {
        PriorityQueue <Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        
       
    }
    
}
