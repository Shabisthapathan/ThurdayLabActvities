package com.BookandAuthor;

public class BookDetails {

	static void display(Book b)
	{
      System.out.println("Book name:"+b.getBookName());
      System.out.println("Book Author name:"+b.getAur());
      System.out.println("Book price:"+b.getPrice());
      System.out.println("Book Title:"+b.getTitle());
      System.out.println("Year of publication of Book:"+b.getYearOfPublication());
	}
	public static void main(String[] args) {
		Book b1 = new Book("StoryBooks","pathan",2022,99.50, new Author("Shabistha",22));
		display(b1); 

	}
}
