package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :3:24:32 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class TimeTest {
	public static void main(String[] args)
	{
		Time t1=new Time(12,45,55);
		Time t2=new Time(10,30,30);
		
		t1.add(t2);
		t1.display();
		
		
	}

}
