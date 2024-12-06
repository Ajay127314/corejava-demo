package com.controlflow;

import java.util.Scanner;

public class SingleDigit {
	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  number :");
		a=sc.nextInt();
		
		if(a > -10 && a < 10)
		{
			System.out.println(a+" is single digit number");
		}
		else
		{
			System.out.println(a+" is not single digit number");
		}
		
		
		sc.close();
		
		}
}
