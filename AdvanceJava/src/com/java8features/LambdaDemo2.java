package com.java8features;

/**
*Author :Kalakoti.Reddy
*Date   :08-Nov-2024
*Time   :12:36:49 pm
*Email  :Kalakoti.Reddy@coforge.com
*/
//block lambda expressions 
public class LambdaDemo2 {
	public static void main(String[] args)
	{
		//lambda expression
		
		MyString reverseStr=(str)->
		{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
				
		};
		
		
		System.out.println(reverseStr.myStringFunction("Lambda Expression"));
		System.out.println(reverseStr.myStringFunction("madam"));

		System.out.println(reverseStr.myStringFunction("Hello world Java"));

		
		//lambda expression with single parameter
		
		MyString myName=name->{return "Hello "+name;};
		
		System.out.println(myName.myStringFunction("Ajay"));
		
		
		
          MyString myName1=name->{return "Hello "+name;};
		
		System.out.println(myName1.myStringFunction("James Gosling"));
		
		
		MyString str=(s)->{return "The length of string is :"+s.length();};
		System.out.println(str.myStringFunction("ajay"));
		
	}

}
