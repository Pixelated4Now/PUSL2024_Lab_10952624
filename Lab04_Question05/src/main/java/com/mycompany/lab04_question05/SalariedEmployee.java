package com.mycompany.lab04_question05;

public class SalariedEmployee extends Employee implements Payable
{
    // Attributes
    private double salary;
    
    // Constructor
    public SalariedEmployee(String name, double salary) 
    {
        super(name);
        this.salary = salary;
    }
    
    // Overriding the CalculatePay() method.
    public double CalculatePay() 
    {
        return this.salary;
    }
            
}
