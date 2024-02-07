<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.awt.Taskbar.State"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

   <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="indexStyle.css" rel="stylesheet">
</head>

<body>
    <div class="container-fluid">
        <div class="container">
            <div class="row">
            <table class="table table-striped table-hover">
            <thead>
    			   <tr class="table-light">
      			   <th scope="col">title</th>
   				   <th scope="col">Author</th>
      			   <th scope="col">Quantity</th>
    			   </tr>
  				</thead>
  				<tbody>
                <% 
					try{
						Class.forName("com.mysql.cj.jdbc.Driver");
					}catch(ClassNotFoundException e){
						e.printStackTrace();
					}
                
                	try{
                		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem",
            					"root", "W7301@jqir#");
                		String query = "Select * from book";
                		Statement statement = connection.createStatement();
                		ResultSet resultSet = statement.executeQuery(query);
                		
                		while(resultSet.next()){
                	%>
                	<tr class="table-light">
                	<td><%= resultSet.getString(2) %></td>
      				<td><%= resultSet.getString(5) %></td>
      				<td><%= resultSet.getString(4) %></td>
    				</tr>
                	<%		
                		}
                		resultSet.close();
                        statement.close();
                        connection.close();
                	}catch(SQLException e){
                		e.printStackTrace();
                	}
                %>
                  </tbody>
                  </table>
            </div>

            <div class="container text-center" id="container3Part2">
                <div class="row justify-content-around">
                    <div class="col-2">
                        <a class="btn btn-primary" id="mainBookPage" href="StudentDashBoard.jsp" role="button">
                            <h6>Book Search</h6>
                        </a>
                    </div>
                    <div class="col-2">
                        <a class="btn btn-primary" id="mainBookPage" href="ViewDataInfoStudent.jsp" role="button">
                            <h6>View Data info</h6>
                        </a>
                    </div>
                    <div class="col-2">
                        <a class="btn btn-primary" id="mainBookPage" href="StudentReturn.jsp" role="button">
                            <h6>Return Book</h6>
                        </a>
                    </div>
                    <div class="col-2">
                        <a class="btn btn-primary" id="mainBookPage" href="PlaceOrder.jsp" role="button">
                            <h6>Place Order</h6>
                        </a>
                    </div>
                    <div class="col-2">
                        <a class="btn btn-primary" id="mainBookPage" href="StudentLogOut.jsp" role="button">
                            <h6>Logout</h6>
                        </a>
                    </div>
                </div>
            </div>

            <div class="cotainer" id="container3Part2">
                <div class="row justify-content-evenly">
                    <div class="col">
                        <form action = "SearchBooksSt" method = "get">
                        <h2>Search Book</h2>
                            <div class="row mb-3">
                                <label for="inputBookid3" class="col-sm-2 col-form-label">Book Name</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="inputBook">
                                </div>
                                
                                <label for="inputBookid3" class="col-sm-2 col-form-label">Suggested</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="input">
                                </div>
                                
                                <label for="inputBookid3" class="col-sm-2 col-form-label">Author Name</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="inputAuthor">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-primary">Search</button>
                             <%@include file = "MessageStudentTable.jsp" %>
                        </form>
                    </div>
                </div>
            </div>
</body>

</html>    