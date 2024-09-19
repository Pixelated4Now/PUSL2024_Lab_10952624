package com.mycompany.lab02_question02;
import java.util.Scanner;

public class Lab02_Question02 {

    public static void main(String[] args) {
        String name;
        int age;
        
        // Instantiating an object of the Student class.
        Student student = new Student();
        
        // Asking for the student's name and age.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the name of the student: ");
        name = scanner.nextLine();
        
        System.out.println("Please provide the age of the student: ");
        age = scanner.nextInt();
        
        // Initializing the name and age.
        student.SetName(name);
        student.SetAge(age);
        
        
        
        // Displaying details
        System.out.println("\n\nDETAILS:\n\tName: " + student.GetName() + "\n\tAge: " + student.GetAge() + "\n");
    }
}
