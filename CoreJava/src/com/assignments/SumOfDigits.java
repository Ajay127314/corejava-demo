package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :10:30:03 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SumOfDigits {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,rev=0;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		sc.close();
		
		while(n!=0)
		{
			m=n%10;
			rev=rev+m;
			n=n/10;
		}
		System.out.println("The sum of given integer is : "+rev);
	}

}
