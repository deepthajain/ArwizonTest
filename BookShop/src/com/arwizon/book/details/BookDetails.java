package com.arwizon.book.details;

public class BookDetails {
	
	private int bookId;
	private static int count;
	private String name;
	private String bookType;
	private String author;
	private int noOfCopies;
	
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	static {
		count = 110;
		 System.out.println("Inside static block");
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		BookDetails.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", name=" + name + ", bookType=" + bookType + ", author=" + author
				+ ", noOfCopies=" + noOfCopies + ", cost=" + cost + "]";
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	private double cost;
	

}
