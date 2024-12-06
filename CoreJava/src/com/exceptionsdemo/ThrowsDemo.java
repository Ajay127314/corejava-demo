package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :4:18:17 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ThrowsDemo {
	
	void division(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        System.out.println("The Division is : "+result);
    }
    
    public static void main(String[] args) {
    	 ThrowsDemo td1=new ThrowsDemo();

         try{
             td1.division(10,0);
         }
         catch (ArithmeticException e){
             System.err.println(e);
         }

         try{
             td1.division(10,3);
         }
         catch (ArithmeticException e){
             System.err.println(e);
         }
	}

}
