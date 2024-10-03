package com.mycompany.lab04_question05;
import java.util.Scanner;

public class Lab04_Question05 
{
    // Create an interface named Payable, with the method CalculatePay(). Create a superclass Employee, with the name and salary as attributes. Create a subclass named HourlyEmployee that implements the Payable interface and calculates the total pay based on the number of hours worked. Create another class, SalariedEmployee, that calculates the pay as per the salary. Demonstrate the use of both classes.

    public static void main(String[] args) 
    {
        String name1, name2;
        double hourlyRate,salary;
        int  hoursWorked;
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input.
        System.out.println("HOURLY RATE");
        System.out.println("Please provide the name of the employee: ");
        name1 = scanner.nextLine();
        System.out.println("Please provide the hourly rate paid to the employee: ");
        hourlyRate = scanner.nextDouble();
        System.out.println("Please provide the number of hours worked by the employee: ");
        hoursWorked = scanner.nextInt();
        
        // Instantiating an object of the HourlyEmployee class.
        HourlyEmployee emp1 = new HourlyEmployee(name1, hourlyRate, hoursWorked);
        System.out.println("Total pay: " + emp1.CalculatePay());
        
        
        System.out.println("\n");
        
        
        // Prompt the user for input.
        System.out.println("SALARY");
        System.out.println("Please provide the name of the employee: ");
        name2 = scanner.nextLine();
        System.out.println("Please provide the salary paid to the employee: ");
        salary = scanner.nextDouble();
        
        // Instantiating an object of the SalariedEmployee class.
        SalariedEmployee emp2 = new SalariedEmployee(name2, salary);
        System.out.println("Total salary: " + emp2.CalculatePay());
    }
}
