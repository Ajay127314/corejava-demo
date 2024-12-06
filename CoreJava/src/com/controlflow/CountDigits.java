package com.controlflow;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  number :");
		num=sc.nextInt();
		sc.close();
		
		if(num>-10 && num<10)
		{
			System.out.println("Single digit number ");
		}
		else if(num>-100 && num<100)
		{
			System.out.println("Double digit number");
		}
		else if(num>-1000 && num<1000)
		{
			System.out.println("Triple digit number");
		}
		else {
			System.out.println(num+" is more than Three Digits");
		}	
	}

}
