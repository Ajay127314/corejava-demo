package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :9:28:33 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ReversedNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,rev=0,m;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		sc.close();
		
		while(n!=0)
		{
			m=n%10;
			rev=rev*10+m;
			n=n/10;
		}
		
		System.out.println("The reverse of the given number is : "+rev);
		
		
	}
}
