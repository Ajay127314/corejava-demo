package com.collectionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :05-Nov-2024
*Time   :2:52:24 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Book {
	
	int id;
	String name,author,publisher;
	int quantity;
	
	
	public Book(int id, String name, String author, String publisher, int quality) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quality;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getQuantity() {
		return quantity;
	}
	
	
	
	
	
	

}
