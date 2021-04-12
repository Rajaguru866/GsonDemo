package com.zoho.GsonCustomSerialize;

public class ComicBook extends Book{
	
	private String bookName;
	private String author;
	private String artist;     // ComicBook has artist as differene field
	private int storiesCount;
	private double price;
	private int pages;
	private final String genre = "Comic";
	public ComicBook(String bookName, String author, String artist, int storiesCount, double price, int pages) {
		this.bookName = bookName;
		this.storiesCount = storiesCount;
		this.price = price;
		this.pages = pages;
		this.author = author;
		this.artist = artist;
	}
	
	public ComicBook() {
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
		return artist;
	}

	public void setComposer(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "ComicBook [bookName=" + bookName + ", author=" + author + ", artist=" + artist + ", storiesCount=" + storiesCount + ", price="
				+ price + ", pages=" + pages + ", Publisher=" + Book.getPublisher() + ", Publisher Address=" + Book.getOfficeAddress() + "]";
	}
	

}
