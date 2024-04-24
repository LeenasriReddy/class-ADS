/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable;
import java.util.Hashtable;


public class HashTable {

    
    public static void main(String[] args) {
        Hashtable<String,Integer> hash = new Hashtable<>();
        hash.put("cat",10);
        hash.put("dog",15);
        int value=hash.get("cat");
        System.out.println(value);
        
    }
    
}
