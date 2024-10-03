package com.mycompany.lab04_question01;


public class Student extends Person
{
    // Attributes
    public char grade;
    
    // Constructor
    public Student(String name, int age, char grade) 
    {
        super(name, age);
        this.grade = grade;
    }
    
    // Method overriding
    public void DisplayDetails() 
    {
        System.out.println("DETAILS\n\tName: " + this.name + "\n\tAge: " + this.age + "\n\tGrade: " + this.grade);
    }
        
}
