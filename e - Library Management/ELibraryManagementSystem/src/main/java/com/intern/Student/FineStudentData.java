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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/Student_fine")
public class FineStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FineStudentData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String sid = request.getParameter("studentid");
		System.out.println(sid + "yoy");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			
			String query = "Select * from issue where s_id = ?"; 
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sid);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String issue = resultSet.getString("issue_date");
				String returD = resultSet.getString("return_date");
				
				List<Object> list = new ArrayList<>();
				list.add(issue);
				list.add(returD);
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("fineCollection", list);
				response.sendRedirect("ViewDataInfoStudent.jsp");
				return;
			}else {
				response.sendRedirect("ViewDataInfoStudent.jsp");
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/rtml");
		
		String issue_date = request.getParameter("issue_date");
		String return_date = request.getParameter("return_date");
		
		double cal = calculateFine(issue_date,return_date);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("fine", cal);
		response.sendRedirect("ViewDataInfoStudent.jsp");
	}
	
	private double calculateFine(String issue,String return_date) {
		 LocalDate issueDate = LocalDate.parse(issue, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate returnDate = LocalDate.parse(return_date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate currentDate = LocalDate.now();

	        if (currentDate.isAfter(issueDate) && currentDate.isBefore(returnDate)) {
	            return 0.0;
	        } else if (currentDate.isAfter(returnDate)) {
	            long daysOverdue = java.time.temporal.ChronoUnit.DAYS.between(returnDate, currentDate);
	            double finePerDay = 1.0; 
	            return finePerDay * daysOverdue;
	        } else {
	            return -1;
	        }
	}

}
