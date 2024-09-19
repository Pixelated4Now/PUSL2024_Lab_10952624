package com.mycompany.lab02_question01;

public class Person 
{
    private String name;
    private int age;
    
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public void DisplayDetails() 
    {
        System.out.println("Details:\n\tName: " + this.name + "\n\tAge: " + this.age + "\n");
    }
}
