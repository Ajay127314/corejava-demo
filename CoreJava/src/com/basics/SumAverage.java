package com.basics;

import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the three numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int sum=a+b+c;
		float avg=(float)(sum/3);
		
		System.out.println("The sum of three numbers is :"+ sum);
		System.out.println("The average of three numbers is :"+avg);
		System.out.println("average "+String.format("%.2f",avg));
		sc.close();
		
	}

}
