package com.assignment2;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :04-Nov-2024
*Time   :10:51:55 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class FizzBuzz {
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter num: ");
		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
	
	for(int i=1;i<=a;i++)
	{
		 
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
				
			}
			else if (i%3==0) {
				System.out.println("Fizz");
			}
			
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			
			else {
				System.out.println(i);
			}	   
	}
		
		
		scan.close();

	}
	

}
