package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :11:40:17 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class AbstractionDemo {
	public static void main(String[] args) 
	{
		Trainee t1=new Marks("Ajay", "NewYork", 10001, 44);
		
		System.out.println(t1);
		
		
		double result=t1.calculateMarks();
		System.out.println("Final Marks : "+result);
		
	}

}
