package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :10:46:59 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Circle  extends Shape{
    private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
}
