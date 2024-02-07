<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

    <!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>view Order</title>
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
      			   <th scope="col">Student Id</th>
   				   <th scope="col">Book Id</th>
      			   <th scope="col">issue Date</th>
      			   <th scope="col">return Date</th>
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
                		String query = "Select * from issue";
                		PreparedStatement preparedStatement = connection.prepareStatement(query);
                		ResultSet resultSet = preparedStatement.executeQuery();
                		
                		while(resultSet.next()){
                	%>
                	<tr class="table-light">
                	<td><%= resultSet.getString(1) %></td>
      				<td><%= resultSet.getString(2) %></td>
      				<td><%= resultSet.getString(3) %></td>
      				<td><%= resultSet.getString(4) %></td>
    				</tr>
                	<%		
                		}
                		resultSet.close();
                        preparedStatement.close();
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
            <a class="btn btn-primary" id="mainBookPage" href="AddBooks.jsp" role="button">
              <h6>Add Book</h6>
            </a>
          </div>
          <div class="col-2">
            <a class="btn btn-primary" id="mainBookPage" href="SearchBook.jsp" role="button">
              <h6>Book Search</h6>
            </a>
          </div>
          <div class="col-2">
            <a class="btn btn-primary" id="mainBookPage" href="BookUpdate.jsp" role="button">
              <h6>Book Update</h6>
            </a>
          </div>
          <div class="col-2">
            <a class="btn btn-primary" id="mainBookPage" href="ViewOrder.jsp" role="button">
              <h6>View Order</h6>
            </a>
          </div>
          <div class="col-2">
            <a class="btn btn-primary" id="mainBookPage" href="AdminSignout.jsp" role="button">
              <h6>Signout</h6>
            </a>
          </div>
        </div>
      </div>

      <div class="cotainer" id="container3Part2">
        <div class="row justify-content-evenly">
          <div class="col">
            <h2>View Order</h2>
            
            <%@include file = "MessageViewOrder.jsp" %>
          </div>
          <div class="col">
            <form class = "form" action = "viewOrder" method = "post">
              <div class="row mb-3">
                <label for="inputBookid3" class="col-sm-2 col-form-label">Book Id</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" name="inputBookid3">
                </div>
              </div>

              <div class="row mb-3">
                <label for="inputTitle3" class="col-sm-2 col-form-label">Title</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" name="inputTitle3">
                </div>
              </div>
              
              <div class="row mb-3">
                <label for="inputAuthor3" class="col-sm-2 col-form-label">Author</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" name="inputAuthor3">
                </div>
              </div>
              
              <button type="submit" class="btn btn-primary">Search</button>
            </form>
          </div>
        </div>
      </div>
</body>

</html>