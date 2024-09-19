package com.mycompany.lab02_question03;

public class Vehicle 
{
    public String brand;
    public int speed;
    
    public Vehicle(String brand, int speed) 
    {
        this.brand = brand;
        this.speed = speed;
    }
    
    public void ShowDetails() 
    {
        System.out.println("DETAILS:\n\tBrand: " + brand + "\n\tSpeed: " + speed);
    }
}
