package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :10:16:27 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Publisher {
	
	String name;
	String publisherID;
	String city;
	
	
	public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Publisher [name=" + name + ", publisherID=" + publisherID + ", city=" + city + "]";
	}
	
	
	
	

}
