package com.arwizon.book.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import com.arwizon.book.details.BookDetails;

public class BookServiceInterfaceImp implements BookServiceInterface {
	Connection con = ConnectionClass.Connectiondb();
	@Override
	public void book(String name, String bookType, String authorName, int noOfCopies, double cost) {
		try {

			String sql = "insert into Books values(?,?,?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
		
			stmt.setInt(1, BookDetails.getCount());
			stmt.setString(2, name);
			stmt.setString(3, bookType);
			stmt.setString(4, authorName);
			stmt.setInt(5, noOfCopies);
			stmt.setDouble(6, cost);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	

	@Override
	public Set<BookDetails> displayBooks() {
			
			Set<BookDetails> m1 = new HashSet<BookDetails>();
		
			try {

				String sql = "select * from Books";
				PreparedStatement stmt = con.prepareStatement(sql);
			   
				
				ResultSet rs=stmt.executeQuery();
				
				while(rs.next()) {
					BookDetails bd1=new BookDetails();
					bd1.setBookId(rs.getInt(1));
					bd1.setName(rs.getString(2));
					bd1.setAuthor(rs.getString(3));
					bd1.setBookType(rs.getString(4));
					bd1.setNoOfCopies(rs.getInt(5));
					bd1.setCost(rs.getDouble(6));
					
					m1.add(bd1);	             
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
			
			return m1;
			
		}

		
	
	@Override
	public Set<BookDetails> searchBook(String name) {
		Set<BookDetails> m1 = new HashSet<BookDetails>();
		
		try {

			String sql = "select * from Books where name=?";
			PreparedStatement stmt = con.prepareStatement(sql);
		   
			stmt.setString(1, name);
			ResultSet rs=stmt.executeQuery();
			;
			
			while(rs.next()) {
				BookDetails bd1=new BookDetails();
				bd1.setBookId(rs.getInt(1));
				bd1.setName(rs.getString(2));
				bd1.setAuthor(rs.getString(3));
				bd1.setBookType(rs.getString(4));
				bd1.setNoOfCopies(rs.getInt(5));
				bd1.setCost(rs.getDouble(6));
				
				m1.add(bd1);	             
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return m1;
		
	}

	@Override
	public void updateBook(int  bookId, int noOfCopies) {
		try {
			String sql="update Books set noOfCopies=? where bookId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(2, bookId);
			stmt.setInt(1,noOfCopies );
			stmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
