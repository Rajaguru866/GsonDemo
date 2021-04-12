package com.zoho.GsonCustomSerialize;

public abstract class Book {
	
	private static String publisher;
	private static String officeAddress;
	public abstract String getBookName();
	public abstract void setBookName(String bookName);
	public abstract int getStoriesCount();
	public abstract void setStoriesCount(int storiesCount);
	public abstract double getPrice();
	public abstract void setPrice(double price);
	public abstract String getAuthor();
	public abstract void setAuthor(String author);
	public abstract int getPages();
	public abstract void setPages(int pages);
	public abstract String getComposer();
	public abstract void setComposer(String name);
	public abstract String getGenre();
	
	public static String getPublisher() {
		return publisher;
	}
	public static void setPublisher(String publisher) {
		Book.publisher = publisher;
	}
	public static String getOfficeAddress() {
		return officeAddress;
	}
	public static void setOfficeAddress(String officeAddress) {
		Book.officeAddress = officeAddress;
	}
	
	

}
