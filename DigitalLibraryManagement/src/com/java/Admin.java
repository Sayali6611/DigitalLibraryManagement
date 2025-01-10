package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {

	public void AddBook(String Title, String Author, String Category) {
	    Connection con = DataConnection.getConnection();
	    if (con != null) {
	        try {
	            String query = "INSERT INTO Books (title, author, category) VALUES (?, ?, ?)";
	            PreparedStatement stmt = con.prepareStatement(query);
	            stmt.setString(1, Title);
	            stmt.setString(2, Author);
	            stmt.setString(3, Category);
	            stmt.executeUpdate();
	            System.out.println("Book added successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        System.out.println("Connection failed.");
	    }
	}

	public void viewBooks() {
		Connection con = DataConnection.getConnection();
		try {
			String query = "SELECT * FROM BOOKS";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt("Book_id") + ", Title: " + rs.getString("Title") + ", Author: " + rs.getString("Author") + ", Category: " + rs.getString("Category"));
		      } 
		   }   catch (SQLException e) {
				e.printStackTrace();
		}
	}
}

