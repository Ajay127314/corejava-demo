package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :9:12:53 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class EvenOdd {
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The given number "+num +" is even number");
		}
		else
		{
			System.out.println("The given number "+num +" is odd number");
		}
		sc.close();
		
	}

}
