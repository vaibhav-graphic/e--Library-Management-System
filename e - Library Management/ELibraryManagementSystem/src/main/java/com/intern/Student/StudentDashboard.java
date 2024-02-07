package com.intern.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
import java.util.ArrayList;


@WebServlet("/SearchBooksSt")
public class StudentDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentDashboard() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String bookname = request.getParameter("inputBook");
		String authors = request.getParameter("inputAuthor");
		
		if(bookname == null || authors == null) {
			response.sendRedirect("StudentDashBoard.jsp");
		}
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
		   preparedStatement.setString(1, bookname);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int id = resultSet.getInt("bood_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				
				System.out.println(id + " " + title + " " + author);
				ArrayList<Object> list = new ArrayList<>();
				list.add(id);
				list.add(title);
				list.add(author);
				
				HttpSession httpSession =  request.getSession();
				httpSession.setAttribute("message1", list);
				response.sendRedirect("StudentDashBoard.jsp");
			}
		}catch (SQLException e) {
			response.sendRedirect("StudentDashBoard.jsp");
			e.printStackTrace();
		}
		catch (Exception e) {
			response.sendRedirect("StudentDashBoard.jsp");
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
