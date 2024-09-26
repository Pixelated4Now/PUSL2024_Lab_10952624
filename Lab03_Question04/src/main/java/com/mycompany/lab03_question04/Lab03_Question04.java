package com.mycompany.lab03_question04;
import java.util.Scanner;

public class Lab03_Question04 
{
    // Create a class, Rectangle, with the public attribues length and width; and the method, CalculatePerimeter(), to return the perimeter of the rectangle.

    public static void main(String[] args) {
        double l, w;
        
        // Ask the user for input.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the width of the rectangle: ");
        w = scanner.nextDouble();
        
        System.out.println("Please provide the length of the rectangle: ");
        l = scanner.nextDouble();
        
        // Instantiate an object of the class.
        Rectangle rectangle = new Rectangle(l, w);
        System.out.println("\nPerimeter of the rectangle: " + rectangle.CalculatePerimeter() + "\n");
        
        scanner.close();
    }
}
