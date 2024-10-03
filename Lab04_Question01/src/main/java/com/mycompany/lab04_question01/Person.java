package com.mycompany.lab04_question01;

public class Person 
{
    // Attributes
    public String name;
    public int age;
    
    // Constructor
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public void DisplayDetails() 
    {
        System.out.println("DETAILS\n\tName: " + this.name + "\n\tAge: " + this.age);
    }
}
