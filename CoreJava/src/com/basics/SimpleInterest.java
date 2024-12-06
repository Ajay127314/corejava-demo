package com.basics;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String customerName;
		double principle;
		float si;
		int term,rate;
		
		System.out.println("Simple Interest calculation");
		
		System.out.println("Enter the customer name :");
		customerName=sc.nextLine();
		
		System.out.println("Enter the loan amount :");
		principle=sc.nextDouble();
		
		System.out.println("Enter the loan term :");
		term=sc.nextInt();
		
		System.out.println("Enter the rate of interest :");
		rate=sc.nextInt();
		
		
		si=(float)(principle*rate*term)/100;
		
		
		System.out.println("******Loan Details *******");
		System.out.println("Customer name       : "+customerName);
		System.out.println("Principle amount    : "+principle);
		System.out.println("Term                : "+term);
		System.out.println("Rate of interest    : "+ rate);
		System.out.println("Simple Interest is  : "+si);
		sc.close();
		
		
	}

}
