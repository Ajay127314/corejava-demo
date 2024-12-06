package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :3:30:53 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class UpcastingDemo 
{
	public static void main(String[] args)
	{
		Item item;
		
		
		//Upcasting -child object is referred by parent Object
		item=new Book("Java Programming",450,"James Gosling");
		item.display();
		
		item=new Laptop("IdeaPad",60000,"Lenovo");
		item.display();
		
		item=new Book("Python Made easy ",650,"Yeswanth Kanetkar");
		item.display();
	}
}
