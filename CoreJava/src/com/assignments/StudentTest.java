package com.assignments;

/**
*Author :Kalakoti.Reddy
*Date   :27-Oct-2024
*Time   :6:15:31 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class StudentTest 
{
public static void main(String[] args)
{
	Student s1=new Student();
	s1.setName("Ajay");
	s1.setYear(2024);
	s1.setAddress("13b-WallStreet");
	System.out.println("Name"+"\t"+"Year Of Joining "+"\t"+"Address"+"\t");
	System.out.println(s1.getName()+"\t"+s1.getYear()+"\t\t\t"+s1.getAddress()+"\t");
	
	
	Student s2=new Student();
	s2.setName("Vijay");
	s2.setYear(2024);
	s2.setAddress("14b-WallStreet");
	
	System.out.println(s2.getName()+"\t"+s2.getYear()+"\t\t\t"+s2.getAddress()+"\t");
	
	
	
	
}
}
