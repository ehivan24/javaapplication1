/*
 * Stack removes item from the top
 * pushes, and adds a the top of the top
peek()  returns
pop()   removes
push()  adds
last item first
 */
package javaapplication1;
import java.util.*;
public class StackApp {
    public static void main(String[] args){
        Stack<Integer> stack =  new Stack<>();
        
        stack.push(23);
        stack.push(2390);
        stack.push(5673);
        stack.push(1567);
                
        System.out.println("last item: "+stack.peek());
        
        System.out.println("Removed: "+stack.pop());
        System.out.println("last item: "+stack.peek());
        stack.push(45);
        
        System.out.println("last item: "+stack.peek());
        
        for(Integer value: stack ){
            System.out.println("Items " + value);
        }
      
        stack.add(100);
        
        System.out.println("last item: "+stack.peek());
    }
}
