<%@page import="java.util.List"%>
<%
List list = (List) session.getAttribute("fineCollection");
if (list != null) {
%>

<form action="Student_fine" method="post">
	<table class="table table-striped table-hover">
		<thead>
			<tr class="table-dark">
				<th scope="col">Issue Date</th>
				<th scope="col">Return Date</th>
			</tr>
		</thead>
		<tbody>
			<tr class="table-dark">
				<td><%=list.get(0)%></td>
				<td><%=list.get(1)%></td>
				<input type="hidden" name="issue_date" value="<%=list.get(0)%>">
				<input type="hidden" name="return_date" value="<%=list.get(1)%>">
			</tr>
		</tbody>
	</table>
	<button type="submit" class="btn btn-primary">Calculate Fine</button>
</form>

<%
session.removeAttribute("fineCollection");
} else {
System.out.println("null hai bhai");
}
%>