package com.mycompany.lab04_question04;

public class Lab04_Question04 
{
    // Create an interface, Vehicle, with the methods Start() and Stop(). Create the classes Car and Bike, that implement the Vehicle interface. In the main method, instantiate objects of both and call their respective methods.

    public static void main(String[] args) {
        // Instantiating an object of the Car class.
        Car car = new Car();
        car.Start();
        car.Stop();
        
        System.out.println("\n");
        
        // Instantiating an object of the Bike class.
        Bike bike = new Bike();
        bike.Start();
        bike.Stop();
    }
}
