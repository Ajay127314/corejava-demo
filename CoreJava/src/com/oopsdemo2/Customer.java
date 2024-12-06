package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :11:35:14 am
*Email  :Kalakoti.Reddy@coforge.com
*Single inheritance demo for online-shopping
*/

public class Customer
{
	private String name;
	private String email;
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
		
		 
	    public void display(){
	        System.out.println("********** Customer Details ************");
	        System.out.println("Customer Name    : "+name);
	        System.out.println("Email            : "+email);
	    }

}
