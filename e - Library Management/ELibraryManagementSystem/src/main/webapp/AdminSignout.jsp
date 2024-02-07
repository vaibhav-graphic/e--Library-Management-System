<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="indexStyle.css" rel="stylesheet">
</head>

<body>
    <div class="container-fluid">
        <div class="container">
            <div class="row">
                <h1>e-Library Management System</h1>
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
                        <img src="https://s3-alpha-sig.figma.com/img/5600/9709/bd17099f09e2fc14fcf008b13f3571e3?Expires=1707696000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=igWsAwDHQP-qdQtX0~Er02EzB1Qh4Qfemf1E9QDw14SyyAa7SWzNr7cSbHKouvXYuDmsFg6VgMD9czmtcx37qaNK~EOqsrgjHKvotTz2ohn9oq~qTCCX532SULCiD2K8K1PK4BspDfVlnqpSvw~iY-uTgBmjkoZPfdT5zAwSQTnNJHHH662-Yft33iTuMqRPV65wwA0-xl5TChCLrM0QGFbx~IogsI3~4vgbwXcRFz2SRccUJZo3kTcn9qmXICQ3FjNEvbuuDwAwnBPpxp7KOeAjvDLmuutrtwD03AzsVqcFG0u0jdhAGsQElGWzBChA9RySNV6-4DkVQU8mAvyDZA__"
                            id="leftImg" alt="Img">
                    </div>
                    <div class="col">
                    
                            <button type="submit"  class="btn btn-primary"><a href="index.jsp"><h6>Signout</h6></a></button>
                    </div>
                </div>
            </div>
</body>

</html>