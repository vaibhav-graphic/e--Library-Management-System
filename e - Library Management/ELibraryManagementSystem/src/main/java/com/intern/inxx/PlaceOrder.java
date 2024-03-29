package com.intern.inxx;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.tomcat.util.digester.ArrayStack;

@WebServlet("/SearchBookPlace")
public class PlaceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PlaceOrder() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String bookName = request.getParameter("bookName");
		String author = request.getParameter("author");
		
		Cookie cookie1 = new Cookie("bookname", bookName);
		response.addCookie(cookie1);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			
			String query = "Select * from book where title = ? and author = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookName);
			preparedStatement.setString(2, author);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				Cookie[] cookies = request.getCookies();
				String stude_id = "";
				
				for (Cookie cookie : cookies) {
				    if ("StudetnId".equals(cookie.getName())) {
				    	stude_id = cookie.getValue();
				        break; 
				    }
				}
				
				if(stude_id != null) {
					String query2 = "Select * from student where s_id = ?";
					
					PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
					preparedStatement2.setString(1, stude_id);
					
					ResultSet resultSet2 = preparedStatement2.executeQuery();
					ArrayList<Object> list = new ArrayStack<Object>();
					if(resultSet2.next()) {
						int id = resultSet2.getInt("s_id");
						String name = resultSet2.getString("student_name");
	
						LocalDate issueDate = LocalDate.now();
						LocalDate returnDate = issueDate.plusDays(5);
						
//						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//						
//						String formattedIssueDate = issueDate.format(formatter);
//				        String formattedReturnDate = returnDate.format(formatter);
						
						list.add(id);
						list.add(name);
						list.add(issueDate);
						list.add(returnDate);
						list.add(bookName);
//						list.add(formattedIssueDate);
//						list.add(formattedReturnDate);
						
						System.out.println(list);
						
						HttpSession httpSession = request.getSession();
						System.out.println(stude_id + "****");
						httpSession.setAttribute("student table", list);
						response.sendRedirect("PlaceOrder.jsp");
						return;
					}
					preparedStatement2.close();
					resultSet2.close();
				}
			}else {
				response.sendRedirect("PlaceOrder.jsp");
			}
			preparedStatement.close();
			resultSet.close();
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String sid = request.getParameter("s_id");
		Cookie[] cookie1 = request.getCookies();
		String bookname = request.getParameter("book_Name");
		String bookid= "";
		String issue = request.getParameter("issue_date");
		String returnDate = request.getParameter("return_date");
		boolean flag = false;
		
		
		System.out.println(sid.toString() +" "+ bookid +" "+ issue +" "+ returnDate + "*****");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			
			String query = "Select * from book where title = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,bookname);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				bookid = resultSet.getString("bood_id");
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			
			String query = "INSERT INTO issue (s_id, book_id, issue_date, return_date) VALUES (?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sid);
			preparedStatement.setString(2, bookid);
			preparedStatement.setString(3, issue);
			preparedStatement.setString(4, returnDate);
			
			int row = preparedStatement.executeUpdate();
			
			if(row > 0) {
				System.out.println("insert succes in issue table");
				flag = true;
				response.sendRedirect("PlaceOrder.jsp");
			}
			
			preparedStatement.close();
			connection.close();			
		}catch (SQLException e) {
			response.sendRedirect("PlaceOrder.jsp");
			e.printStackTrace();
		}
		
		if(flag == true) {
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
						"root", "W7301@jqir#");
				
				String query = "UPDATE book SET quantity = quantity - 1 WHERE bood_id = ?";
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, bookid);
				int row = preparedStatement.executeUpdate();
				
				if(row > 0) {
					System.out.println("done");
				}
				preparedStatement.close();
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
