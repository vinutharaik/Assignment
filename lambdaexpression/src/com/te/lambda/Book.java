package com.te.lambda;

public class Book {
	private  int id;
	private String bookName;
	private  int pages;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Book(int id, String bookName, int pages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.pages = pages;
	}
	

}
