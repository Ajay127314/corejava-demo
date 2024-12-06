package com.controlflow;

import java.util.Scanner;

public class GreatestTwo {
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		a=sc.nextInt();
		System.out.println("Enter the second number :");
		b=sc.nextInt();
		
		//implementation of control Statements
		if(a>b) 
		{
			System.out.println(a+" is Greatest Number");
		}
		else
		{
			System.out.println(b+" is Greatest Number");
		}
		
		sc.close();
		
		}
}
