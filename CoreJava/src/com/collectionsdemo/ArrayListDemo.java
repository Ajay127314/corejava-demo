
package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
*Author :Kalakoti.Reddy
*Date   :05-Nov-2024
*Time   :12:39:52 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ArrayListDemo {
 public static void main(String[] args)
 {
	ArrayList<String> a1=new ArrayList<String>();
	
	a1.add("Java");
	a1.add("Perl");
	a1.add("C++");
	a1.add("C# 5.0");
	a1.add("Java");
	a1.add("Python");

	System.out.println(a1);
	
	System.out.println("Elements at Index 1 : "+a1.get(1));
	
	System.out.println("Does list contains element Java ?: "+a1.contains("java"));
	
	a1.add(2,"Oracle");
	System.out.println(a1);
	
	System.out.println("Is ArrayList Empty ? :"+a1.isEmpty());
	System.out.println("Index of perl : "+a1.indexOf("Perl"));
	System.out.println("Size of arraylist : "+a1.size());
	
	Collections.sort(a1);
	System.out.println("Array list after sorting :"+a1);
	
	//a1.add(100);
	
	ArrayList<Integer> a2=new ArrayList<Integer>();
	
	a2.add(100000);
	a2.add(10000);
	a2.add(1000);
	a2.add(100);
	a2.add(10);
	a2.add(10);
	
	System.out.println(a2);
	System.out.println("Size : "+a2.size());
	
	
	
	
			}
}
