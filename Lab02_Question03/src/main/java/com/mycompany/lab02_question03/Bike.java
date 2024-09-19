package com.mycompany.lab02_question03;


public class Bike extends Vehicle
{
    public Bike(String brand, int speed)
    {
        super(brand, speed);
    }
    
    public void DisplayType() 
    {
        System.out.println("\tType: Bike\n");
    }
}
