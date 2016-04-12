
package javaapplication1;
import java.util.*;
public class Orange implements Runnable{
    String nameOrange;
    Random r = new Random();
    int time;
    public Orange(String x){
        this.nameOrange = x;
        time = r.nextInt(999);
    }
    
    public static void main(String[] args){
        
        Thread t1 = new Thread(new Orange("name Orange"));
        
        t1.start();
    }
    
    
    
    
    @Override
    public void run() {
       try{
              System.out.printf("%s speeping for  %d \n", nameOrange, time);
              Thread.sleep(time);
              System.out.printf("%s is done \n", nameOrange);
          
          }catch(Exception e){
              System.out.println("Catch " + e);
          }
    
    }
}
