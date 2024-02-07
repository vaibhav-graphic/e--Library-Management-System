package com.intern.inxx;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet("/adminLogin")
public class AdminLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminLog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
					"root", "W7301@jqir#");
			Statement statement = connection.createStatement();
			String qurey = "SELECT * FROM Admin where adminname = '" + username + "' and password = '" + password
					+ "';";
			ResultSet resultSet = statement.executeQuery(qurey);

			if (resultSet.next()) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("DashBoard.jsp");
				requestDispatcher.forward(request, response);
			} else {
				response.sendRedirect("AdminLoginPage.jsp");
			}
			connection.close();
			statement.close();
			resultSet.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			response.sendRedirect("AdminLoginPage.jsp");
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
