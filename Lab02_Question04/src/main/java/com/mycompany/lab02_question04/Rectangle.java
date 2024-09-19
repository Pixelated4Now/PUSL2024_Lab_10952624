package com.mycompany.lab02_question04;


public class Rectangle extends Shape
{
    // Attributes
    private double length, width;
    
    // Constructor
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    
    public double CalculateArea() 
    {
        return (this.length * this.width);
    }
    
}
