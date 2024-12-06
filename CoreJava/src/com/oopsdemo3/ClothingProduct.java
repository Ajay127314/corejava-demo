package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :2:57:28 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ClothingProduct extends Product {
	
	private String size;
	private String color;

	public ClothingProduct(String name, double price,String size,String color) {
		super(name, price);
		this.size=size;
		this.color=color;
		
		
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		 System.out.println("Size   : "+size);
	     System.out.println("Color  : "+color);
	     System.out.println("Material: Cotton");
		
		
		
	}
	
	
	
	

}
