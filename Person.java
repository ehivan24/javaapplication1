/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
public class Person implements Comparable<Person>{
    
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){  
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
 
    
    public String toString( ){
        return this.name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        
        return Integer.compare(this.age, otherPerson.getAge());
    }
}
