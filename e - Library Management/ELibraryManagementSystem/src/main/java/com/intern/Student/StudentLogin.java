package com.intern.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/studentLogin")
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public StudentLogin() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("StudentRegister.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("username"); 
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			String query = "SELECT * FROM student WHERE s_id = ? and password = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			 preparedStatement.setString(1, name);
			 preparedStatement.setString(2, password);
             
             ResultSet resultSet = preparedStatement.executeQuery();
             Cookie cookie = new Cookie("StudetnId", name);
             response.addCookie(cookie);
             
             if(resultSet.next()) {
            	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentDashBoard.jsp");
            	 requestDispatcher.forward(request, response);
             }else {
            	 response.sendRedirect("StudentLogin.jsp");
             }
		}catch (SQLException e) {
			response.sendRedirect("StudentLogin.jsp");
			e.printStackTrace();
		}
	}

}
