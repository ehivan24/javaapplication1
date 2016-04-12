
package javaapplication1;
public class App {
    
    public static <T> int count(T[] items, T pattern ){
        int counter = 0;
        for(T actualItem : items){
            if(actualItem.equals(pattern)){
                counter++;
            }
        }
        
        return counter;
    }
  
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5,3,3};
        
        Integer num = 3;
        
        System.out.println(count(numbers,num));
        
    }
}
