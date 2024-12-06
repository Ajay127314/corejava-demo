package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :10:15:42 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Author {
	
	String authorName;
	int age;
	String place;
	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}
	
	
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}
	
	
	
	

}
