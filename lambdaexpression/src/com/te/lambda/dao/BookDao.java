package com.te.lambda.dao;

import java.util.ArrayList;
import java.util.List;

import com.te.lambda.Book;

public class BookDao {
	
		
	public List<Book> getBook(){
	List<Book>books=new ArrayList<Book>();
	books.add(new Book(1,"java",12));
	books.add(new Book(12,"accentuure",11));
	books.add(new Book(11,"python",13));
	books.add(new Book(14,"code",2));
	books.add(new Book(14,"crytpton",15));
	return books;
	}
	
	
	

}
