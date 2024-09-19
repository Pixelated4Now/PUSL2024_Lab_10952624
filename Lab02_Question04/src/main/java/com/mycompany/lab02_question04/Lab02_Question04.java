package com.mycompany.lab02_question04;
import java.util.Scanner;

public class Lab02_Question04 
{
    // Create an abstract class, Shape, with the method CalculateArea(). Derive two sub-classes from the main class, Rectangle and Circle. Each sub-class should implement the CalculateArea() method to calculate and return the area of the respective shape. Create instances of the sub-classes, assign values and display the area.

    public static void main(String[] args) 
    {
        double length, width, radius;
        
        Scanner scanner = new Scanner(System.in);
        
        // Rectangle
        System.out.println("Please provide the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.println("Please provide the width of the rectangle: ");
        width = scanner.nextDouble();
        
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.CalculateArea());
        
        System.out.println("\n\n");
        
        //Circle
        System.out.println("Please provide the radius of the circle: ");
        radius = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.CalculateArea());
        
        
        scanner.close();
    }
}
