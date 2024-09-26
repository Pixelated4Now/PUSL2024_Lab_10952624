package com.mycompany.lab03_question02;
import java.util.Scanner;

public class Lab03_Question02 
{
    // Create a class, Circle, with the radius as a public variable. A method, calculateArea() returns the area of the circle.

    public static void main(String[] args) 
    {
        double radius;
        
        // Ask the user for the radius.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the radius of the circle: ");
        radius = scanner.nextDouble();
        
        // Instantiate an object of the class.
        Circle circle = new Circle(radius);
        
        System.out.println("\n\nArea of the circle: " + circle.CalculateArea());
        
        scanner.close();
               
    }
}
