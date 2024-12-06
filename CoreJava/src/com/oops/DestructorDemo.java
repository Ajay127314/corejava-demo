package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :4:48:59 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

//Object class is a super class of all java classes 
class Test
{
   //its a Destructor method
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Object Destructor and Grabage Collector");
		
	}
	
}


public class DestructorDemo 
{
public static void main(String[] args)
{
	Test t1=new Test();
	Test t2=new Test();
	Test t3=new Test();
	Test t4=new Test();
	
	//Deallocate memory -object destroyed explicitly
	
	t1=null;
	t2=null;
	t3=null;
	
	System.gc();//runs garbage collector----finalize method
	
	
}
	
	
}
