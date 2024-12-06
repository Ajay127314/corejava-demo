package com.controlflow;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :4:30:33 pm
*Email  :Kalakoti.Reddy@coforge.com
*Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {
	public static void main(String[] args)
	{
		String userInput=null;
		Scanner sc=new Scanner(System.in);
		
		
		do
		{
			System.out.println("Welcome to online shopping app");
			System.out.println("1.View Products");
			System.out.println("2.Add Products");
            System.out.println("3.check out");
            System.out.println("4.Exit");
            
            System.out.println("enter your choice :");
            int choice=sc.nextInt();
            
            switch(choice)
            {
            case 1:
	            	System.out.println("Displaying Products ....");
	            	break;
            case 2:
	            	System.out.println("Adding Products ....");
	            	break;
            case 3:
	            	System.out.println("checking out....");
	            	break;
            case 4:
            		System.out.println("Exit application .Good Bye !!!");
            		return;
	        default:
	        		System.out.println("Invalid choice ,please try again");
	        		
	        	
            }
            System.out.println("Do you want to continue shopping (yes/no) :");
            userInput=sc.next();
               
		}while(userInput.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for shopping with us ");
		sc.close();
		
		
		
		
	}

}
