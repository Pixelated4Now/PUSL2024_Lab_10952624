package com.mycompany.lab01_question03;


public class Test 
{
    public static void main(String[] args)
    {
        // Instantiating an instance of the bank account class.
        BankAccount acc = new BankAccount();
        
        // Assign values to the attributes.
        acc.AccNo = 5550111;
        acc.AccType = "Savings";
        
        // Display the values.
        System.out.println("Account details:\n\tAccount number: " + acc.AccNo + "\n\tAccount type: " + acc.AccType);
    }
}
