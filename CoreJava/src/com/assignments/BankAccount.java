package com.assignments;

import java.util.Scanner;
import java.lang.System;
/**
*Author :Kalakoti.Reddy
*Date   :27-Oct-2024
*Time   :7:01:04 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class BankAccount {
	
	private int accountNo;
	private String accountHolderName;
	private double balance;
	
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter the accountno,name and balance : ");
		
		accountNo=sc.nextInt();
		accountHolderName=sc.next();
		balance=sc.nextDouble();
	}
	
	public void deposit(double amt) {
		balance+=amt;
		System.out.println("The balance after the deposit is : "+balance);
	}
	
	public void withDrawn(double amt) {
		if(balance>=amt)
		{
			balance-=amt;
			System.out.println("The balance after the withdrawn is : "+balance);
			
		}
		else
		{
			System.out.println("Insufficient Balance...");
		}
	}
	
	public void displayDetails() {
		System.out.println("**** Bank Details ****");
		System.out.println("Account number      : "+accountNo);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Main Balance        : "+balance);
	
	}
	
}
