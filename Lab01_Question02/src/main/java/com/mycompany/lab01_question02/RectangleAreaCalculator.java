package com.mycompany.lab01_question02;

public class RectangleAreaCalculator 
{
    private float length, width;
    
    public RectangleAreaCalculator(float length, float width) 
    {
        this.length = length;
        this.width = width;
    }
    
    public float Area() 
    {
        return (this.length * this.width);
    }
}
