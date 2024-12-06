package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :8:50:26 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SwapTwoNumbers {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		
		
		System.out.println("enter the two numbers :");
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		
		x=x+y;//x=5,y=4--->x=9
		y=x-y;//9-4----5
		x=x-y;//9-5----4
		
		System.out.println("Swap  two numbers without using third varaible "+x+" and "+y);
		
		
	}

}
