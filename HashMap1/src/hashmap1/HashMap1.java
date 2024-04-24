/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap1;
import java.util.HashMap;


public class HashMap1 {

    
    public static void main(String[] args) {
    HashMap<String,Integer> hash = new HashMap<>();
    hash.put("dog",1);
    hash.put("cat",2);
    hash.put("bird",3);
    int result=hash.get("cat");
    System.out.println("Result:"+result);
    

    }
    
}
