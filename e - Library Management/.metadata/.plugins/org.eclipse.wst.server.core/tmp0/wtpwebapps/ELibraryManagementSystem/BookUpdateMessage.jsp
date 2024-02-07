<%@page import="java.util.List"%>
<%
   List list = (List)session.getAttribute("message1");
	if(list != null){
%>
<div class="col">
            <form class = "form" action = "BookUpdates" method = "post">
              <div class="row mb-3">
                <label for="inputBookid3" class="col-sm-2 col-form-label">Book Id</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" value = "<%= list.get(0) %>" name="inputBookid3">
                </div>
              </div>

              <div class="row mb-3">
                <label for="inputTitle3" class="col-sm-2 col-form-label">Title</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" value = "<%= list.get(1) %>" name="inputTitle3">
                </div>
              </div>
              
              <div class="row mb-3">
                <label for="inputAuthor3" class="col-sm-2 col-form-label">Author</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" value = "<%= list.get(4) %>" name="inputAuthor3">
                </div>
              </div>

              <div class="row mb-3">
                <label for="inputCost3" class="col-sm-2 col-form-label">cost</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" value = "<%= list.get(2) %>" name="inputCost3">
                </div>
              </div>              

              <div class="row mb-3">
                <label for="inputQuantity3" class="col-sm-2 col-form-label">Quantity</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" value = "<%= list.get(3) %>" name="inputQuantity3">
                </div>
              </div>
              
              <button type="submit" class="btn btn-primary">Update</button>
            </form>
          </div>
        </div>
	

<%	
		session.removeAttribute("message1");
	}else{	
%>

<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong>The book not exist</strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<% 
	session.removeAttribute("message1");
	}
%>
