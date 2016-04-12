package javaapplication1;

/*
*
*  has reference to the next item,
*  it takes longer to search an item
*  because it has to search for the entire list
*  fater for removing.
*
*/

import java.util.*;
public class LinkedListApp {
    
    public static void main(String[] args){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Adam");
        linkedList.add("Kevin");
        linkedList.add("Raul");
        linkedList.add("Rohit");
        
        linkedList.remove(1);
        
        for(String name: linkedList){
            
        }
        
        
        System.out.println("Size: "+linkedList.size());
        
        
    }
}
