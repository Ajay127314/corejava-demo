package packagedemo;

/**
*Author :Kalakoti.Reddy
*Date   :04-Nov-2024
*Time   :4:52:03 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ObjectClassDemo {
	public static void main(String[] args) 
	{
		Person p1=new Person("Ajay", 23);
		Person p2=new Person("Ajay", 23);
		Person p3=new Person("Sruthi", 21);
		
		System.out.println("Person 1 :"+p1.toString());
		System.out.println("Person 3 :"+p3);
		System.out.println("Person1 equals Person 2 :"+p1.equals(p2));
		System.out.println("Person1 equals Person 2 :"+p2.equals(p3));
		
		
		System.out.println("Person 1 Hash code : "+p1.hashCode());
		System.out.println("Person 1 Hash code : "+p2.hashCode());
		System.out.println("Person 1 Hash code : "+p3.hashCode());
		
	System.out.println("Class of person 1: "+p1.getClass().getName());
		
		
	}

}
