<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Order</title>
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
                        <img src="https://s3-alpha-sig.figma.com/img/cb86/4615/0f51e3cddf45acdfd5bc16e866281d20?Expires=1707696000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=ViTn37AZQVkuo5SevR-OIakKBn2yXJv1e09tMTTCa6l7uQ9W~XQtWiMbKkNDUmyvLD4QPJ38t~~iUii7ZeAG1CZM3pJuzl56IIILbvJRPldehBzGP3geJC7FWPRQZ8ROur2RxOSuZHd5O2IJUT2q4~MtSZx6MwlcBP1yLJhV9LTWF8b2wJmex5ZmHFCaejoLfCI3H0JHPCXOPlP2MRE8Hv64Xb8mbuykNoT4sCY5kt6GNpdrlIURTl~gd9Gfm-uLrUd2CXCecux1ZtJAF~VukEjB0aWySlMQwFR0yYT2j8YQ0~r5tJBnFt06Dbg5rSXQPAVG7lVaPaVoLeEcJw84Zg__"
                            id="leftImg" alt="Img">
                    </div>
                    <div class="col">
                       <%@include file = "BookUpdateMessage.jsp" %>
                    </div>
                    
                    <div class="col">
                        <form action = "BookUpdates" method = "get">
                            <div class="row mb-3">
                                <label for="inputBookid3" class="col-sm-2 col-form-label">Book Id</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="inputBookid3">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-primary">Search</button>
                        </form>
                    </div>
                </div>
            </div>
</body>

</html>