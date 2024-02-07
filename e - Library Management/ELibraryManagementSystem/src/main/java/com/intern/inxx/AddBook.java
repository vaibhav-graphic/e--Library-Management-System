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
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/AddBooks")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBook() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");

		String bookid = request.getParameter("inputBookid3");
		String title = request.getParameter("inputTitle3");
		String author = request.getParameter("inputAuthor3");
		String cost = request.getParameter("inputCost3");
		String quantity = request.getParameter("inputQuantity3");

		System.out.println(bookid + " " + title + " " + author + " " + cost + " " + quantity + " ");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			Statement statement = connection.createStatement();
			String query = "INSERT INTO book (bood_id, title, cost, quantity, author) VALUES (" + bookid + ",'" + title
					+ "'," + cost + "," + quantity + ",'" + author + "'" + ");";
			int rowAffected = statement.executeUpdate(query);

			if (rowAffected > 0) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("message", "The book add succesfull!");

				response.sendRedirect("AddBooks.jsp");
				return;
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message2", "The book is already add");

			response.sendRedirect("AddBooks.jsp");

			e.printStackTrace();
		}
		printWriter.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
