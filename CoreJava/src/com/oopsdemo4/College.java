package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :3:01:21 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class College {
	String name;
	int id;
	String universty;
	String course;
	
	public College(String name, int id, String universty, String course) {
		this.name = name;
		this.id = id;
		this.universty = universty;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getUniversty() {
		return universty;
	}

	public String getCourse() {
		return course;
	}
	
	
	
	

}
