package com.mycompany.lab03_question04;

public class Rectangle 
{
    // Attributes
    public double length;
    public double width;
    
    // Constructor
    public Rectangle(double l, double w) 
    {
        this.length = l;
        this.width = w;
    }
    
    public double CalculatePerimeter() 
    {
        return ((2 * length) + (2 * width));
    }
}
