package com.zoho.GsonCustomSerialize;

public class ClassicBook extends Book{
	
	
	private String bookName;
	private String author;
	private String writer;		// ClassicBook has writer as different field
	private int storiesCount;
	private double price;
	private int pages;
	private final String genre = "Classic";
	
	
	public ClassicBook(String bookName, String author, String writer, int storiesCount, double price, int pages) {
		this.bookName = bookName;
		this.storiesCount = storiesCount;
		this.price = price;
		this.pages = pages;
		this.author = author;
		this.writer = writer;
	}
	
	public ClassicBook() {
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getStoriesCount() {
		return storiesCount;
	}
	public void setStoriesCount(int storiesCount) {
		this.storiesCount = storiesCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getGenre() {
		return genre;
	}
	

	public String getComposer() {
		return writer;
	}

	public void setComposer(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "ClassicBook [bookName=" + bookName + ", writer=" + writer + ", storiesCount=" + storiesCount + ", price=" + price + ", pages="
				+ pages + ", publisher=" + Book.getPublisher() + ", Publisher Address=" + Book.getOfficeAddress() + "]";
	}

	
	
	

}
