package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :4:58:54 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Student {
	
	private int rollNo;
	private String name;
	
	private static String organization="VTU";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void organizationChange() {

		organization="Coforge";
	}
	
	public void display()
	{
		System.out.println(this.rollNo+" "+this.name+" "+organization);
	}
	
	

}
