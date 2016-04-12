/*
 * Queues First in first out, has to be instantiated as
    LinkedList
 * add()  adds
 * remove() removes
 * element() gets first element 
 */
package javaapplication1;
import java.util.*;
public class QueueApp {
    
    public static void main(String[] args){
        
        Queue<String> queue = new LinkedList<>();
        
        queue.add("Mario");
        queue.add("Peter");
        queue.add("Juan");
        queue.add("Lopez");
        queue.add("Rohit");

        System.out.println("Size: " + queue.size());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println("Size: " +queue.size());
        
        
        /*
        * efficient for the mimimum or maximun item
        *   using logaritm  
        *  add()
        *  peek() 
        *  poll() removes and retrives to the head
        *
        */
        
        System.out.println("*****");
        
        Queue<Person> myQueue = new PriorityQueue<>();
         
        myQueue.add(new Person("Adam", 42));
        myQueue.add(new Person("John", 22));
        myQueue.add(new Person("Kim", 56));
        myQueue.add(new Person("Sam", 12));
        
        System.out.println("My Priority Queue: " + myQueue.peek());
        
        
        for(Person value: myQueue){
            System.out.println(value);
        }
        
        
        System.out.println("***** Here we order the people by Age");
        while(myQueue.peek() != null){
            System.out.println(myQueue.poll());
        }
        
    }
    
}
