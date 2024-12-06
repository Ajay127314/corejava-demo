package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :4:39:55 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class CustomExceptionDemo {
	
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount(500.00); //Initial Balance

        System.out.println("Attempting to deposit $200:");
        account.deposit(200.00);

        System.out.println("\nAttempting to withdraw $800:");
        try {
            account.withdraw(800.00);
        } catch (InsufficientFundsException e) {  //Catch Custom Exceptions
            System.err.println("Exception caught: " + e);
        }

        System.out.println("\nAttempting to withdraw $300:");
        try {
            account.withdraw(300.00);
        } catch (InsufficientFundsException e) {
            System.err.println("Exception caught: " + e);
        }

        System.out.println("\nFinal Balance: " + account.getBalance());
	}

}
