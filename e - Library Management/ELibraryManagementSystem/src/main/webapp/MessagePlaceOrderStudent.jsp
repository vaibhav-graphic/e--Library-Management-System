<%@page import="java.util.List"%>
<html>
<head>
    <title>Place Order</title>
</head>
<body>

<%
    List list = (List) session.getAttribute("student table");
    if (list != null) {
%>
    <form action="SearchBookPlace" method="post">
        <table class="table table-striped table-hover">
            <thead>
                <tr class="table-dark">
                    <th scope="col">Student id</th>
                    <th scope="col">Student name</th>
                    <th scope="col">issue date</th>
                    <th scope="col">return date</th>
                </tr>
            </thead>
            <tbody>
                <tr class="table-dark">
                    <td><%= list.get(0) %></td>
                    <td><%= list.get(1) %></td>
                    <td><%= list.get(2) %></td>
                    <td><%= list.get(3) %></td>
                    <input type="hidden" name="s_id" value="<%= list.get(0) %>">
                    <input type="hidden" name="book_Name" value="<%= list.get(4) %>">
                    <input type="hidden" name="issue_date" value="<%= list.get(2) %>">
                    <input type="hidden" name="return_date" value="<%= list.get(3) %>">
                </tr>
            </tbody>
        </table>
        <button type="submit" class="btn btn-primary">Place Order</button>
    </form>
<%
        session.removeAttribute("student table");
    } else {
%>
<%
    }
%>

</body>
</html>
