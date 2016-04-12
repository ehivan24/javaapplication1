package javaapplication1;
import java.util.*;


class Node{
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(0,113);
        list.add(0,645);
        list.add(0,13);
        list.add(345);
        list.add(133);
        list.add(576);

        Collections.sort(list);
        Iterator<Integer> listIterator = list.iterator();
        
        long start = System.currentTimeMillis();
        
        while(listIterator.hasNext()){
             System.out.println(listIterator.next());
        }
        
        
        System.out.println("$$$$$$$$$");
        Collections.shuffle(list);
        
        for(Integer item: list){
            System.out.println(item);

        }
        
        
        long end = System.currentTimeMillis();
        
        System.out.println("Element at pos 2" + list.get(2) );
        
        System.out.println("Timing "+ (start-end) );
        
        System.out.println("Size of the list  "+list.size());
        
    }
}
