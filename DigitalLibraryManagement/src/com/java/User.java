package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

	public void SearchBook(String title) {
		// TODO Auto-generated method stub
		Connection con = DataConnection.getConnection();
		try {
			String qurey = "SELECT * FROM Books WHERE Title LIKE ?";
			PreparedStatement stmt = con.prepareStatement(qurey);
			stmt.setString(1, "%" + title + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("Id : " + rs.getInt("Book_id") + ", Title: " + rs.getString("Title") + ", Author: " + rs.getString("Author") + ", Category: " + rs.getString("Category"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

