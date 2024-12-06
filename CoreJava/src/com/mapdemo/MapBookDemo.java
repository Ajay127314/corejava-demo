package com.mapdemo;

import java.util.Map;
import java.util.TreeMap;

import com.collectionsdemo.Book;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :10:42:37 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class MapBookDemo {
	public static void main(String[] args) {
		Map<Integer,Book> bookMap=new TreeMap<>();
		
		//create Books
				Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
			    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
			    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
			    
			    //add Books to map
			    bookMap.put(3, b3);
			    bookMap.put(1, b1);
			    bookMap.put(2, b2);		
			    
			    
			      //Traversing in Map
				    for(Map.Entry<Integer,Book> e:bookMap.entrySet())
				    {
				    	int key=e.getKey();
				    	Book b=e.getValue();
				    	System.out.println("Book :"+key+" Details: ");
				    	System.out.println(b.getId()+ " "+b.getName()+" "+b.getAuthor()+
				    			" "+b.getPublisher()+" "+b.getQuantity());
				    }
			    
			    
			    
	}
	
	

}