package com.BookandAuthor;

public class Book {

	private String bookName,title;
	
	private int yearOfPublication;
	private double price;
	private Author aur;
	

	public Book()
	{
		super();
	}
	
	public Book(String bookName,String title,int yearOfPublication,double price,Author aur)
	{
	super();
	this.bookName=bookName;
	this.title=title;
	this.yearOfPublication=yearOfPublication;
	this.price=price;
	this.setAur(aur);
	}
	


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAur() {
		return aur;
	}

	public void setAur(Author aur) {
		this.aur = aur;
	}

}
