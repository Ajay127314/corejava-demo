package com.java8features;

/**
*Author :Kalakoti.Reddy
*Date   :08-Nov-2024
*Time   :12:24:23 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class LambdaDemo1 {
	public static void main(String[] args) 
	{
		NumericTest isEven=(n)->(n%2==0);
		NumericTest isNegative=(n)->(n<0);
		
		System.out.println("7 is even number :"+isEven.computeTest(7));
		System.out.println("-55 is negative number :"+isNegative.computeTest(-55));
		
	//boolean a=(n)-> (n%2==0);//error-lambda expression should be stored in instance of FI
		
		
		
	}

}
