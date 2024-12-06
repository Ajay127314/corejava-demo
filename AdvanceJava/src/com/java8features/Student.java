package com.java8features;

/**
*Author :Kalakoti.Reddy
*Date   :08-Nov-2024
*Time   :2:53:26 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;
	
	public Student(Integer rollNumber, String name, double marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	
	
	

}
