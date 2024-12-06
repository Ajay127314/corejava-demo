package com.exceptionsdemo;

import java.io.IOException;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :3:11:04 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class OutOfMemoryErrorDemo {
	
	
	
	 public void createArray(int size)
		{
			try
			{
				Integer[] a=new Integer[size];
			}
			/* System.err is a PrintStream. System.err works like System.out except it is normally only used
			 *  to output error texts. Some programs (like Eclipse) will show the output to System.err in 
			 *  red text, to make it more obvious that it is error text.*/
			catch(OutOfMemoryError e)
			{
				System.err.println("Array Size too Large "+e);
				System.err.println("Max JVM Memory: "+Runtime.getRuntime().maxMemory());
				System.out.println("Java Version :"+Runtime.version());
				
			}
		}
	public static void main(String[] args) {
		
		OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		
		d1.createArray(1000*1000*1000);
		
		try
		{
			Runtime.getRuntime().exec("mspaint");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
