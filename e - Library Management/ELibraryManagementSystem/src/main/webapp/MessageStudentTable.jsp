<%@page import="java.util.List"%>
<%
   List list = (List)session.getAttribute("message1");
	if(list != null){
%>

<table class="table table-striped table-hover">
  <thead>
    <tr class="table-dark">
    <th scope="col">title</th>
      <th scope="col">Author</th>
           <th scope="col">Quantity</th>
    </tr>
  </thead>
  <tbody>
    <tr class="table-dark">
          <td><%= list.get(1) %></td> 
    <td><%= list.get(2) %></td>
      <td><%= list.get(0) %></td>  
    </tr>
  </tbody>
</table>

<%	
		session.removeAttribute("message1");
	}	
%>
