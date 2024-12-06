package com.java8features;

/**
*Author :Kalakoti.Reddy
*Date   :09-Nov-2024
*Time   :10:40:13 am
*Email  :Kalakoti.Reddy@coforge.com
*/

//Java program to use Method Reference to a Constructor

interface IMessage
{
	ConstructorReference getMessage(String msg);
}

class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodreferenceDemo4 {
	
	public static void main(String[] args)
	{
		IMessage hello=ConstructorReference::new;
		hello.getMessage("Method Reference to constructor");
		
		ConstructorReference a=new ConstructorReference("hello");
		
	}
	

}
