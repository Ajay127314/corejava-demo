package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :10:17:40 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Magazine {
	
	private String name;
	private int price;
	
	
	private  Author author ;
	private Publisher publisher;
	
	
	public Magazine(String name, int price, Author author, Publisher publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	
	void display()
	{
		System.out.println("*************** Magazine Details ****************");
		System.out.println("Magazine Name    : "+name);
	    System.out.println("Magazine Price   : "+price);
	    
	    System.out.println("------------Author Details----------");
	    System.out.println("Author Name  : "+author.authorName);
	    System.out.println("Author Age   : "+author.age);
	    System.out.println("Author place : "+author.place);
	    
	    System.out.println("------------Publisher Details-------");
	    System.out.println("Publisher Name: "+publisher.name);
	    System.out.println("Publisher ID  : "+publisher.publisherID);
	    System.out.println("Publisher City: "+publisher.city);
	    
	}

	@Override
	public String toString() {
		return "Magazine [name=" + name + ", price=" + price + ", author=" + author + ", publisher=" + publisher + "]";
	}

		
	
	

}
