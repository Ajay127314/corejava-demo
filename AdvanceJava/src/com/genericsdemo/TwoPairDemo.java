package com.genericsdemo;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :05-Nov-2024
*Time   :11:37:28 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class TwoPairDemo {
    public static void main(String[] args)
	{
		Pair<String,Integer> p1=new Pair<String, Integer>("The car Guys",8);
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Our Current Rating For "+p1.getFirst()+"is : "+p1.getSecond());
		System.out.println("How would you rate them ? : ");
		int score=sc.nextInt();
		p1.setSecond(score);
		System.out.println("Our new Rating For "+p1.getFirst()+"is :"+p1.getSecond());
		Pair<String,Float> p2=new Pair<>("TROY",8.5f);
		
        System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		
		System.out.println("How would you rate them ?:");
		float score1 =sc.nextFloat();
		
		p2.setSecond(score1);
		
		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		sc.close();
		
		}
}