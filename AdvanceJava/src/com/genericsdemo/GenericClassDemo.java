package com.genericsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :05-Nov-2024
*Time   :11:23:54 am
*Email  :Kalakoti.Reddy@coforge.com
*/


class Sample<T>
{
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class GenericClassDemo
{
	public static void main(String[] args) {
		
   Sample<String> s1=new Sample<>("Java Generics");
   System.out.println("Display from generic class by passing String object : "+s1.getData());
		
   Sample<Integer> s2=new Sample<>(100);
   System.out.println("Display from generic class by passing Integer object : "+s2.getData());
		
   Sample<Double> s3=new Sample<>(99.88);
   System.out.println("Display from generic class by passing Double object : "+s3.getData());
		
	}
}
