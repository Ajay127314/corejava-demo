package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :5:05:09 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class StaticDemo {
	
	public static void main(String[] args)
	{
		Student student1=new Student(101,"Mary");
        Student student2=new Student(102,"King");
        Student student3=new Student(103,"John");
        Student student4=new Student(104,"David");

        System.out.println("************ Student Details ***************");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
        
        Student.organizationChange();
        
        System.out.println("************ Student Details After Organization Change ***************");
        student1.display();
        student2.display();
        student3.display();
        student4.display(); 
		
		
	}

}
