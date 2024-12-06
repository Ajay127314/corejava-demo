
package com.oopsdemo2;

import java.util.ArrayList;
import java.util.List;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :11:41:23 am
*Email  :Kalakoti.Reddy@coforge.com
*
*composition Example
*/

public class Library {
	
	private List<Book> books;//Composition -Library has book reference object 

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	
	
	

}
