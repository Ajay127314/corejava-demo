package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :3:24:10 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Laptop extends Item{
	
	private String manufacturer;

	public Laptop(String name, int price,String manufacturer)
	{
		super(name, price);
		this.manufacturer=manufacturer;
		
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturer     : "+manufacturer);
	}
	
}