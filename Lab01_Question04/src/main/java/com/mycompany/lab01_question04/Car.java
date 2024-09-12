package com.mycompany.lab01_question04;


public class Car 
{
    // Artributes
    private String make, model;
    private int year;
    
    public Car(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void DisplayDetails() 
    {
        System.out.println("Details\n\tMake: " + this.make + "\n\tModel: " + this.model + "\n\tYear: " + this.year);
    }
    
}
