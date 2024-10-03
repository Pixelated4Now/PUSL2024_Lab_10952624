package com.mycompany.lab04_question02;

public class Lab04_Question02 
{
    // Create an abstract class, Appliance, with the abstract methods TurnOff() and TurnOn(). Create two subclasses, WashingMachine and Refrigerator, that implement these methods to display appropriate messages to turn the appliances on and off. Instantiate objects of both classes and execute their methods.
    
    public static void main(String[] args) 
    {
        // Instantiating an object of the washing machine class.
        WashingMachine wm = new WashingMachine();
        wm.TurnOn();
        wm.TurnOff();
        
        // Instantiating an object of the refrigerator class.
        Refrigerator r = new Refrigerator();
        r.TurnOn();
        r.TurnOff();
        
        
    }
}
