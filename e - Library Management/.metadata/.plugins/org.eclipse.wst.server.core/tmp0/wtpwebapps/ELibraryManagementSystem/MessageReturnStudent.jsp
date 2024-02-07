<%@page import="java.util.List"%>

<%
	List list = (List) session.getAttribute("S_R_table");
	if(list != null){
%>
<form action="studentreturning" method="post">
	<table class="table table-striped table-hover">
		<thead>
			<tr class="table-dark">
				<th scope="col">student id</th>
				<th scope="col">book Name</th>
				<th scope="col">Author</th>
				<input type="hidden" name="s_id" value="<%=list.get(0)%>">
				<input type="hidden" name="book_name" value="<%=list.get(1)%>">
				<input type="hidden" name="book_author" value="<%=list.get(2)%>">
				<input type="hidden" name="book_id" value="<%=list.get(3)%>">
			</tr>
		</thead>
		<tbody>
			<tr class="table-dark">

				<td><%=list.get(0)%></td>
				<td><%=list.get(1)%></td>
				<td><%=list.get(2)%></td>
			</tr>
		</tbody>
	</table>
	<button type="submit" class="btn btn-primary">return</button>
</form>
<% 
	session.removeAttribute("S_R_table");
	}
%>