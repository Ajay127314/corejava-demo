package com.java8features;

import java.time.LocalDate;

/**
*Author :Kalakoti.Reddy
*Date   :09-Nov-2024
*Time   :11:22:26 am
*Email  :Kalakoti.Reddy@coforge.com
*/

//java 8 allows to add functionality to interface
interface Parser
{
	default void parse()
	{
		System.out.println("Default Parsing logic");
	}
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}


class TextParser implements Parser
{
	//inherit default implementation of Parse
	
	void display()
	{
		System.out.println("Hello Text Parser");
	}
}

class XMLParser implements Parser
{
	//
	
	public void parse()
	{
		System.out.println("Parsing XML files");
	}
}

public class DefaultMethodDemo1
{
	public static void main(String[] args) 
	{
		Parser p=new TextParser() ;
	    p.parse();
	    
	    
	    TextParser p1=new TextParser();
	    p1.display();
	    
	    p=new XMLParser();
	    p.parse();
	    
	    System.out.println("Program executed on :");
	    Parser.displayDate();
	}
	
	

}
