package com.mycompany.lab03_question03;
import java.util.Scanner;

public class Lab03_Question03 
{
    // Create a class, Student, with name and marks as public variables. The class has a method, hasPassed(), which returns TRUE if the student's marks are greater than 50.
    
    public static void main(String[] args) 
    {
        String name;
        int marks;
        
        // Ask the user for input.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the name of the student: ");
        name = scanner.nextLine();
        
        System.out.println("Please provide the student's marks: ");
        marks = scanner.nextInt();
        
        // Instantiate an object of the class.
        Student student = new Student(name, marks);
        
        if (student.HasPassed())
            System.out.println("\n" + student.name + " passed.\n\n");
        else
            System.out.println("\n" + student.name + " failed.\n\n");
    }
}
