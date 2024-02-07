<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add book page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <link href="indexStyle.css" rel="stylesheet">
</head>

<body>
  <div class="container-fluid">
    <div class="container">
      <div class="row">
        <h1>e-Library Management System</h1>
        <%@include file = "AddBookMessage.jsp" %>
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
            <h2>Add Books</h2>
            <img
              src="https://s3-alpha-sig.figma.com/img/dda3/fe8e/41c58c07e1e6acd275e2ad60ba111d84?Expires=1707696000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=eDrIyKi0MG8mmDQlrR2NQC5PFcoInCN0f62RfbYd80VbP8tGoF~8a2nY1T-KKfCEzaT6HMqnfp2aV8YGEB7Jsw9em8p~Xtx2F2DtIWguhDFMSxY71lskGd27iHw6t7mhQL2FZRKmJIumuUycTM5OQZQMfuKYihixgvMpKvtn5kTOcCZL8WbpVOoxpvp0bAwLfX5U2YtYBx570Lgo~~aWZgmahTIFTM7aBNJ54~XwxaixLzShEXVXRKGB85fjnN6nI01yS3YOPx8LHtzkQ1bTQMaItw-XS3frqjx9Qzp9DOq2U8WpRPa-t9yqOz2A0mxKDETPcI4lUnK7Ik5k79lfaQ__"
              id="leftImg" alt="Img">
          </div>
          <div class="col">
            <form class = "form" action = "AddBooks" method = "post">
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

              <div class="row mb-3">
                <label for="inputCost3" class="col-sm-2 col-form-label">Cost</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" name="inputCost3">
                </div>
              </div>              

              <div class="row mb-3">
                <label for="inputQuantity3" class="col-sm-2 col-form-label">Quantity</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" name="inputQuantity3">
                </div>
              </div>
              
              <button type="submit" class="btn btn-primary">Add</button>
            </form>
          </div>
        </div>
      </div>
</body>

</html>