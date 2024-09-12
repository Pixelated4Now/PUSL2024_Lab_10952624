/* 
Create a class, named RectangleAreaCalculator, that calculates the area of a rectangle. The class should have:
    - private variables Length and Width
    - A constructor to initialize the attributes
    - A method to return the area of the rectangle

In the main method:
    - Create an instance of the class
    - Calculate and display the area of a rectangle
*/


package com.mycompany.lab01_question02;
import java.util.Scanner;

public class Lab01_Question02 {

    public static void main(String[] args) 
    {
        float length, width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        length  = scanner.nextFloat();
        
        System.out.println("Please enter the width of the rectangle: ");
        width  = scanner.nextFloat();
        
        RectangleAreaCalculator rectangle = new RectangleAreaCalculator(length, width);
        System.out.println("The area of the rectangle: " + rectangle.Area());
        
        // Close the scanner
        scanner.close();
    }
}
