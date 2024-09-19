package com.mycompany.lab02_question03;

public class Car extends Vehicle 
{
    public Car(String brand, int speed) 
    {
        super(brand, speed);
    }
    
    public void DisplayType() 
    {
        System.out.println("\tType: Car\n");
    }
}
