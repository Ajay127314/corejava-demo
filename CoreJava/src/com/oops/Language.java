package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :4:12:11 pm
*Email  :Kalakoti.Reddy@coforge.com
*
*program to demonstarte constructor overloading
*/

public class Language {
	private String name;
	private float version;
	
	
	public Language()
	{
		this.name="Java";
		this.version=8.0f;
		System.out.println("The language is : "+this.name+" -V "+this.version);
	}


	public Language(String name) 
	{
	
		this.name = name;
		this.version=5.0f;
		System.out.println("The language is : "+this.name+" -V "+this.version);
	 }


	public Language(float version) {
		
		this.version = version;
		this.name="Python";
		System.out.println("The language is : "+this.name+" -V "+this.version);
	}


	public Language(String name, float version) {
		super();
		this.name = name;
		this.version = version;
		System.out.println("The language is : "+this.name+" -V "+this.version);
	}
	
}
