package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :4:52:31 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class MathUtils {
	
	public static int square(int num) {
		
		return num*num;
		
	}

	public static int myAddition(int a,int b) {
		return a+b;
		
	}
	
	public static void main(String[] args)
	{
		int result=MathUtils.square(5);
		
		System.out.println("The Square of 5 is : "+result);
		System.out.println("The addition of 2 numbers is : "+MathUtils.myAddition(400, 120));
	}
}
