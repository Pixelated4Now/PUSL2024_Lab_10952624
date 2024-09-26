package com.mycompany.lab03_question01;

public class Person 
{
    public String name;
    public int age;
    
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
     public boolean IsAdult() 
    {
        return (age >= 18);
    }
    
}
