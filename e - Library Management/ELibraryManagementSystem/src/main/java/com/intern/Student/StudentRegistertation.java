package com.intern.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/student_register")
public class StudentRegistertation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegistertation() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String sid = request.getParameter("StudentId");
		String sName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(sid != null && sName != null && password != null) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
						"root", "W7301@jqir#");
				String query = "Insert into student (s_id,student_name,password) VALUES (?, ?, ?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, sid);
				preparedStatement.setString(2, sName);
				preparedStatement.setString(3, password);
				
				int row = preparedStatement.executeUpdate();
				if(row > 0) {
					response.sendRedirect("StudentLogin.jsp");
				}
			}catch (SQLException e) {
				response.sendRedirect("StudentLogin.jsp");
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("StudentRegister.jsp");
		}
	}

}
