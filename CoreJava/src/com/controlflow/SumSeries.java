package com.controlflow;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :3:07:48 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SumSeries {
	public static void main(String[] args) 
	{
		int num,res=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		num=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		System.out.println("The sum of series is : "+res);
		
	}

}
