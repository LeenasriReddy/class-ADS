/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueueusingarray;
import java.util.Arrays;
class PriorityQueue{
    private int[]items = new int[5];
    private int count;
    public void add(int item){
        if (isFull()){
            throw new IllegalStateException();
        }
        var i = shiftItemsToInsert(item);
        items[i]=item;
        count++;
    }
    public boolean isFull(){
        return count ==items.length;
    }
    private int shiftItemsToInsert(int item){
        int i;
        for(i=count-1;i>=0;i--){
            if(items[i]>item){
                items[i+1]=items[i];
            }else{
                break;
            }
        }
    
    return i+1;
}
public String toString(){
    return Arrays.toString(items);
}
    
}

public class PriorityQueueUsingArray {
 public static void main(String[] args) {
      PriorityQueue queue=new PriorityQueue();
      queue.add(5);
      queue.add(3);
      queue.add(6);
      queue.add(1);
      queue.add(4);
      System.out.println(queue);
      
     
 }
       
    
}
