<%
   String message = (String)session.getAttribute("message");
   String message2 = (String)session.getAttribute("message2");
	if(message != null){
		
		
%>

<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong>The book add suceesfully</strong> 
  <button type="submit" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>

<%	
		session.removeAttribute("message");
	}else if(message2 != null){
		
%>
<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong>The book is already add</strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<% 
	session.removeAttribute("message2");
	}
%>
