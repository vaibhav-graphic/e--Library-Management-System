<% 
	String message = (String)session.getAttribute("message");
	String message1 = (String)session.getAttribute("message2");
	
	if(message != null){
		
%>
	
	<h4> Total Number Of Order = 1 </h4>
		
<% 
	session.removeAttribute("message");
	}else if(message1 == null){
		
%>

	<h4> Total Number Of Order = 0 </h4>
	
<% 
	session.removeAttribute("message1");
	}
%>