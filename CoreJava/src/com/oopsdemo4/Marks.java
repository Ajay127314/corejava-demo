package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :11:36:50 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Marks extends Trainee {
	
	private double marks;
	
	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
	 System.out.println("Marks : "+marks);
		return (marks*2);
	}

}
