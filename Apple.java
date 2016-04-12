
package javaapplication1;

import java.util.*;
public class Apple implements Runnable{
    String name;
    int time;
    Random rand = new Random();
    public Apple(String x){
        this.name = x;
    }
    
    @Override
    public void run() {
        try{
            System.out.println("Started run() in Apple");
            runthisMethod();
            //System.out.println("Done with method run in Apple class");
           
        }catch(Exception e){
            System.out.println("Error" + e);
        }
    
    }
    
    public static void runthisMethod(){
        Vector v = new Vector();
        
        for(int i=0; i< 1000; i++ ){
               v.add(i);
        }
        
        System.out.println("done with method in Apple"+ v);
        
    }
    
    
}
