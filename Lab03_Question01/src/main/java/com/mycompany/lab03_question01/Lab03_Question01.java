package com.mycompany.lab03_question01;
import java.util.Scanner;


public class Lab03_Question01 
{
    // Create a class that stores the name and age of a person as public variables. The class should contain a method that returns TRUE if the person is considered to be an adult.

    public static void main(String[] args) 
    {
        int age;
        String name;
        
        // Asking the user for input.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the name of the person: ");
        name = scanner.nextLine();
        
        System.out.println("Please provide the age of the person: ");
        age = scanner.nextInt();
        
        
        // Instantiating an object of the class.
        Person person = new Person(name, age);
        
        // Testing the method.
        if (person.IsAdult())
            System.out.println("\n\n" + person.name + " is an adult.");
        else
            System.out.println(person.name + " is not an adult.");
    }
}
