package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :3:28:43 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Book extends Item{
	
	private String author;

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Author   : "+author);
	}
	
	

}
