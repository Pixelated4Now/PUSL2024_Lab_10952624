package com.mycompany.lab03_question05;
import java.util.Scanner;

public class Lab03_Question05 
{
    
    // Create a class, Employee, with two public variables - name and salary. Include a method, CalculateBonus(), that returns the bonus as 10% of their salary.

    public static void main(String[] args) {
        String name;
        double salary;
        
        // Ask the user for the name and salary.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the name of the employee: ");
        name = scanner.nextLine();
        
        System.out.println("Please provide the salary of the employee: ");
        salary = scanner.nextDouble();
        
        
        // Instantiate an object of the class.
        Employee employee =  new Employee(name, salary);
        
        
        // Test the method.
        System.out.println("\n\nDETAILS\nName: " + employee.name + "\nSalary: " + employee.salary + "\nBonus: " + employee.CalculateBonus());
        
        scanner.close();
    }
}
