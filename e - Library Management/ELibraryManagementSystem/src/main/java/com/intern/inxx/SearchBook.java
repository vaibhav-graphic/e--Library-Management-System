package com.intern.inxx;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/SearchBooks")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SearchBook() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");
		
		String bookid = request.getParameter("inputBookid3");
		
		if(bookid == null) {
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			Statement statement = connection.createStatement();
			String query = "Select * from Book where bood_id = " + bookid + ";";
			ResultSet resultSet = statement.executeQuery(query);
			
			if(resultSet.next()) {
				int id = resultSet.getInt("bood_id");
				String title = resultSet.getString("title");
				double cost = resultSet.getDouble("cost");
				int quantity = resultSet.getInt("quantity");
				String author = resultSet.getString("author");
				
				System.out.println(id + " " + title + " " + cost + " " + quantity + " " + author);
				ArrayList<Object> list = new ArrayList<>();
				list.add(id);
				list.add(title);
				list.add(cost);
				list.add(quantity);
				list.add(author);
				HttpSession httpSession =  request.getSession();
				httpSession.setAttribute("message1", list);
				response.sendRedirect("SearchBook.jsp");
				return;
			}else {
				response.sendRedirect("SearchBook.jsp");
			}
			resultSet.close();
			statement.close();
			connection.close();
		}catch (SQLException e) {
			response.sendRedirect("SearchBook.jsp");
			e.printStackTrace();
		}
		printWriter.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
