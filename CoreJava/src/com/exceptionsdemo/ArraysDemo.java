package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :2:48:55 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ArraysDemo {
	public static void main(String[] args) 
	{
		String[] languages ={"C","C++","Java","Perl","Python","C#"};

        try {
            for (int i = 0; i <= languages.length; i++) {
                System.out.println(languages[i]);
            }
        }
        catch (Exception e){ //use error Object to print Exception messages
            System.err.println(e.toString());
        }
        finally {
            System.out.println("In Finally Block");
        }
	}

}
