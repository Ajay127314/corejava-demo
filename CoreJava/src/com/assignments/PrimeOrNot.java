package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :9:40:20 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class PrimeOrNot {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		sc.close();
		boolean isPrime=true;
		
		
		if(num<=1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println("The given number "+num +" is a Prime Number");
		}
		else
		{
			System.out.println("The given number "+num +" is not a Prime Number");
		}
		
		}
		
	}


