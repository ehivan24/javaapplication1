/*
 * TreeMap is sorted
 * HashTable is synchronized + slow
 * HashMap not synchronized allo null values, not in order
 * HashTable not allow null tables
 * 
 *  Maps allow u to look for values fast <like databases>
 */
package javaapplication1;
import java.util.*;
public class HashMapsTables {
    
    public static void main(String[] args){
        
        Map<String, Integer> maps = new HashMap<>();
        
        maps.put("Adam",34);
        maps.put("Joe", 453);
        maps.put("John", 5);
        maps.put("Juan", 23);
        maps.put("Mario", Integer.MIN_VALUE);
        maps.put("Manuel", 34);
        
        
        System.out.println(" Returns Age " + maps.get("Adam"));
        
        
        for(String name: maps.keySet()){
            System.out.println(name);
        }
        
        for(Integer value: maps.values()){
             System.out.println(value);
        }
        
        
        
        
    }
    
}
