package com.mycompany.lab02_question03;
import java.util.Scanner;

public class Lab02_Question03 
{
    
   // Create a class named Vehicle with two attributes - brand and speed. The class has a method, showDetails(), that prints the brand and speed of the vehicle. Create two sub-classes, car and bike. Each sub-class has its own method to display the type of vehicle. Create instances of the two classes and display their details.

    public static void main(String[] args) 
    {
        String carBrand, bikeBrand;
        int carSpeed, bikeSpeed;
        
        // Ask the user for data.
        Scanner scanner = new Scanner(System.in);
        
            
        System.out.println("Please provide the brand of the car: ");
        carBrand = scanner.nextLine();
        
        
        System.out.println("\n");
        
        System.out.println("Please provide the speed of the car: ");
        carSpeed = scanner.nextInt(); 
        System.out.println("Please provide the brand of the bike: ");
        bikeBrand = scanner.nextLine();
        System.out.println("Please provide the speed of the bike: ");
        bikeSpeed = scanner.nextInt();
        
        System.out.println("\n\n\n");
        
        // Instantiate objects of the child class.
        Car car = new Car(carBrand, carSpeed);
        Bike bike = new Bike(bikeBrand, bikeSpeed);
        
        car.ShowDetails();
        car.DisplayType();
        
        System.out.println("\n");
        
        bike.ShowDetails();
        bike.DisplayType();
    }
}
