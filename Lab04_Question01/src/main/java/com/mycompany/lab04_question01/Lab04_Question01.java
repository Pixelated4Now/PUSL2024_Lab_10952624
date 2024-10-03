package com.mycompany.lab04_question01;
import java.util.Scanner;

public class Lab04_Question01 
{
    // Create a class named Person with the attribues age and name. Create a sublcass, Student, that adds an attribute, age, Implement a method in both classes to display their details. Create an instance of the Student class and display the details.

    public static void main(String[] args) 
    {
        // Instantiating an object of the Student class.
        Student student = new Student("Roxanne", 13, 'A');
        student.DisplayDetails();
    }
}
