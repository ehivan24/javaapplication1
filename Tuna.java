

package javaapplication1;
import java.util.*;
public class Tuna implements Runnable {
    String name;
    int time;
    Random r = new Random();
    
    public Tuna(String x){
        this.name = x;
        time = r.nextInt(999);
    }
    
    public static void main(String[]  args) {
        
    
    Thread t1 = new Thread(new Tuna("one Tuna"));
    Thread t2 = new Thread(new Orange("two orange Class"));
    Thread t3 = new Thread(new Tuna("three Tuna"));
    Thread t4 = new Thread(new Orange("four Orange Class"));
    
    Thread t5 = new Thread(new Apple("Apple Thread "));
    
   
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    
    t5.start();
    
    
    }

    @Override
    public void run() {
          try{
              System.out.printf("%s speeping for  %d \n", name, time);
              Thread.sleep(time);
              System.out.printf("%s is done \n", name);
          
          }catch(Exception e){
              System.out.println("Catch " + e);
          }

    }
}
