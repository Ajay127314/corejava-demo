package com.controlflow;

/**
*Author :Kalakoti.Reddy
*Date   :25-Oct-2024
*Time   :9:47:57 am
*Email  :Kalakoti.Reddy@coforge.com
*
*program to demonstrate break and continue statements
*/

public class JumpDemo {
	
	public static void main(String[] args) 
	{
		System.out.println("*******  Break Statement Demo  *******");
		for (int i = 1; i <=10; i++) 
		{
			if(i==5)
				break;
			System.out.println(i);	
		}
		
		System.out.println("*******  Continue Statement Demo  *******");
		for (int i = 1; i <=10; i++) 
		{
			if(i>4 && i<9)
				continue;
			System.out.println(i);	
		}
		
		
		
	}

}
