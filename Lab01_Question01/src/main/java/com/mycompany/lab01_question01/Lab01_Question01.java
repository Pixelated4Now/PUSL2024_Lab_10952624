package com.mycompany.lab01_question01;
import java.util.Scanner;


public class Lab01_Question01 
{
    
    // Create a class that can be used to add two integers together.

    public static void main(String[] args) 
    {
        int num1, num2;
        
        // Create an object of the class Scanner.
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Please enter the first number: ");
       num1 = scanner.nextInt();
       
       System.out.println("Please enter the second number: ");
       num2 = scanner.nextInt();
       
       // Create an instance of the Addition class to add the two numbers.
       Addition add = new Addition();
       
        System.out.println(num1 + " + " + num2 + " = " + add.Add(num1, num2));
    }
}
