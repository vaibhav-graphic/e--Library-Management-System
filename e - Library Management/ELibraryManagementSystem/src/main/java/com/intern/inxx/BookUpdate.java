package com.intern.inxx;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * Servlet implementation class BookUpdate
 */
@WebServlet("/BookUpdates")
public class BookUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String bookid = request.getParameter("inputBookid3");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			Statement statement = connection.createStatement();
			
			String qurey = "Select * from Book where bood_id = " + bookid;
			
			ResultSet resultSet = statement.executeQuery(qurey);
			
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
				response.sendRedirect("BookUpdate.jsp");
				return;
			}else{
				HttpSession httpSession =  request.getSession();
				httpSession.setAttribute("message1", null);
				response.sendRedirect("BookUpdate.jsp");
			}
			resultSet.close();
			statement.close();
			connection.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			HttpSession httpSession =  request.getSession();
			httpSession.setAttribute("message1", null);
			response.sendRedirect("BookUpdate.jsp");
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String bookid = request.getParameter("inputBookid3");
		String cost = request.getParameter("inputCost3");
		String quantity = request.getParameter("inputQuantity3");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			Statement statement = connection.createStatement();
			String query = "UPDATE book SET cost = " + cost + ", quantity = " + quantity + " WHERE bood_id = " + bookid;
			
			int row = statement.executeUpdate(query);{
				if(row > 0) {
					response.sendRedirect("BookUpdate.jsp");
				}else {
					response.sendRedirect("BookUpdate.jsp");
				}
			}
		}catch (SQLException e) {
//			response.sendRedirect("BookUpdate.jsp");
			e.printStackTrace();
		}
	}

}
