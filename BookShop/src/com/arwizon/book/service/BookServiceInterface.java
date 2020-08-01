package com.arwizon.book.service;

import java.util.Set;

import com.arwizon.book.details.BookDetails;

public interface BookServiceInterface {
	
	public void book(String name, String bookType, String authorName, int noOfCopies, double cost);
			
	public Set<BookDetails> displayBooks();

	public Set<BookDetails> searchBook(String name);

	void updateBook(int  bookId, int noOfCopies);



}
