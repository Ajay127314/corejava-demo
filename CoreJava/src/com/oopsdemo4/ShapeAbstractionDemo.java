package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :10:53:33 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ShapeAbstractionDemo
{

	public static void main(String[] args)
	{
		
		Shape s;
		s=new Circle(10);
		System.out.println("The radius Of the Circle is : "+s.calculateArea());
		
		s=new Square(10.5);
		System.out.println("The area  Of the Square is : " +s.calculateArea());
	}
}
