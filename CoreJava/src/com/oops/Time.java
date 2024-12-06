package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :3:18:44 pm
*Email  :Kalakoti.Reddy@coforge.com
*
*
*Java program to perform addition of 2 Times
 *  t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
 *  
 *     t1 + t2
 *     if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *     if min> 60  ... hrs should be incremented by 1 & min -60
*/

public class Time
{
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		super();
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	public void add(Time obj)
	{
		this.sec+=obj.sec;
		this.min+=obj.min;
		this.hrs+=obj.hrs;
		
		if(this.sec>=60)
		{
			this.sec-=60;
			this.min++;
		}
		 if(this.min>=60)
		{
			this.min-=60;
			this.hrs++;
		}
	}
		public void display() {
			System.out.println("The Addition of 2 times  is :");
			System.out.println(this.hrs+"hrs :"+this.min+"min :"+this.sec+"sec");
		}
	}
	
	


