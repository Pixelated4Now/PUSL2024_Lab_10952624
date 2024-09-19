package com.mycompany.lab02_question04;

public class Circle extends Shape
{
    // Attributes
    static public final double PI = 3.1419;
    private double radius;
    
    // Constructor
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    
    public double CalculateArea() {
        return (PI * radius * radius);
    }
}
