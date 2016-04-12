
package javaapplication1;

import java.util.*;

public class Generics<T> {
    
    T item;
    public static void addList(String t1){
   
       List<String> list = new ArrayList<>();
       
       list.add(t1);
       list.toString();
       
    }
    
   public static void main(String[] args){
   
       Generics<Object> g = new Generics<>();
       
       g.addList("String");
//       System.out.print();
       
  
   }
}
