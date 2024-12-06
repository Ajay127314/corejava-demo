package com.assignment2;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :04-Nov-2024
*Time   :11:11:09 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class CollatzSequence {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number : ");
		n=sc.nextInt();
		sc.close();
		
		if(n>=1 && n<=Math.pow(10, 6))
		{
			while(n!=1)
			{
				if(n%2==0)
				{
					n=n/2;
					System.out.println(n);
				}
				else if(n%2!=0)
				{
					n=(3*n)+1;
					System.out.println(n);
				}
			}
		}
		
		
		
		
		else
		{
			System.out.println("Enter the valid number ");
		}
		//sc.close();
		
		
	}

}
