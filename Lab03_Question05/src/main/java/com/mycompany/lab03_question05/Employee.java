package com.mycompany.lab03_question05;

public class Employee 
{
    // Attributes.
    public String name;
    public double salary;
    
    // Constructor
    public Employee(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }
    
    public double CalculateBonus() 
    {
        return (this.salary * 0.10);
    }
}
