package com.mycompany.lab02_question02;

public class Student 
{
    // Atrributes
    private String studentName;
    private int studentAge;
    
    // Setter for the name.
    public void SetName(String name)
    {
        this.studentName = name;
    }
    
    // Getter for the name
    public String GetName() 
    {
        return this.studentName;
    }
    
    // Setter for the age
    public void SetAge(int age)
    {
        this.studentAge = age;
    }
    
    // Getter for the age
    public int GetAge() 
    {
        return this.studentAge;
    }
}
