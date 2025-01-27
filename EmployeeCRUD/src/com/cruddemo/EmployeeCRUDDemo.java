package com.cruddemo;


import java.util.Scanner;
/**
 *Author :Kalakoti.Reddy
 *Date   :07-Nov-2024
 *Time   :5:17:05 pm
 *Email  :Kalakoti.Reddy@coforge.com
 */

public class EmployeeCRUDDemo {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);

		Employee e=new Employee();
		String city=null,name=null,contactno=null; 
		int eid = 0;
		String email=null;
		

		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5  to update email using result set \t Press 6 to exit"); 

			Scanner s=new Scanner(System.in);
			int option=s.nextInt();

			switch(option)
			{
			case 1: System.out.println("Enter employee Name: ");
			        name=sc.next();
			 
			 System.out.println("enter the employee city :");
			 city=sc.next();
			 
			 System.out.println("enter the ph no:");
			 contactno=sc.next();
			 
			 System.out.println("enter the email :");
			 email=sc.next();
			 
			 
			 
			 e.insertEmployee(name,city,contactno,email);
			 break;

			case 2: e.getEmployee();
			break;

			case 3: System.out.println("Enter Employee Id for updating city :");
				    eid=sc.nextInt();
				
				    System.out.println("Enter the new city :");
				    city=sc.next();
			
			
			     e.updateEmployee(eid,city);
			break;

			case 4: System.out.println("Enter Employee Id  to be Deleted:");
			       eid=sc.nextInt();
			e.deleteEmployee(eid);
			break;
			
			case 5:System.out.println("enter employee id for email updation : ");
			       eid=sc.nextInt();
			       
			       System.out.println("Enter the new mail : ");
			       email=sc.next();
			        
			
			    e.updateEmployeeEmail(eid, email);
			    break;
			
			case 6: System.out.println("Program Terminated");
			System.exit(0);

			default: System.out.println("Invalid Selection");
			break;
			}
		}

	}
}
