package com.mycompany.lab04_question05;

public class HourlyEmployee extends Employee implements Payable 
{
    // Attributes
    private double hourlyRate;
    private int hoursWorked;
    
    // Constuctor 
    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) 
    {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    // Overriding the CalculatePay() method.
    public double CalculatePay() 
    {
        return (this.hoursWorked * this.hourlyRate);
    }
}
