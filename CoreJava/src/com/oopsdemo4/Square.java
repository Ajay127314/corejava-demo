package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :10:50:23 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Square extends Shape {
	 private final double side;
	 
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
