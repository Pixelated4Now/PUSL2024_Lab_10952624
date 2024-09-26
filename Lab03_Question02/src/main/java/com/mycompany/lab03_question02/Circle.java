package com.mycompany.lab03_question02;

public class Circle 
{
    public static final double PI = 3.14159;
    public double radius;
    
    public Circle (double radius) 
    {
        this.radius = radius;
    }
    
    public double CalculateArea() 
    {
        return (PI * radius * radius);
    }
}
