package com.mycompany.lab03_question03;

public class Student 
{
    // Attributes
    public String name;
    public int marks;
    
    // Constructor
    public Student(String name, int marks) 
    {
        this.name = name;
        this.marks = marks;
    }
    
    public boolean HasPassed() 
    {
        return (marks > 50);
    }
        
}
