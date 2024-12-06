package com.basics;

import java.util.Scanner;

public class VolumeOfCyclinder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float r,h;   // variables declaration
		
		final float PI=3.14f; // constant declaration
	
		System.out.println("Enter Radius of a Cylinder :");
		r=s.nextFloat();  // float input
		h=s.nextFloat();
		
		float  volume =PI*r*r*h; 
		
		System.out.println("The Volume of a cylinder  is : "+volume);
		System.out.format("%.2f", volume);
		
	s.close();
		

	}

}
