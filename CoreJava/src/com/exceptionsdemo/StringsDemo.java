package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :2:51:38 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class StringsDemo {
	public static void main(String[] args)
	{

        String s1="Hello World";
        String s2=null;
       // String s2="Java";
        try{
            System.out.println(s1.length());
            System.out.println(s2.length());
        }
        catch (Exception exception){
            System.err.println("Exception occurred:"+exception);
        }
		
		
	}

}
