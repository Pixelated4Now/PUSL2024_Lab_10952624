/*
 Create a class, Car, with the subsequent specifications:
     - Three attributes: make, model, year
     - A constructor that initializes the attributes
     - A method to display the make, model and year
 */

package com.mycompany.lab01_question04;
import java.util.Scanner;

public class Lab01_Question04 {

    public static void main(String[] args) 
    {
        // Testing the Car class.
        String make, model;
        int year;
        
        // Instantiate an object of the Scanner class.
        Scanner scanner = new Scanner(System.in);
        
        //Ask the user for the make, the model, and the year.
        System.out.println("Please enter the model of the car: ");
        model = scanner.nextLine();
        
        System.out.println("Please enter the make of the car: ");
        make = scanner.nextLine();
        
        System.out.println("Please enter the year the car was manufactured: ");
        year = scanner.nextInt();
        
        // Instantiate an object of the Car class.
        Car car = new Car(make, model, year);
        
        // Display details.
        car.DisplayDetails();
        
        scanner.close();
        
        
    }
}
