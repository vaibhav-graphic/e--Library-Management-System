<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DashBoard</title>
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

            <div class="container" id="container3Part2">
                <div class="row justify-content-around">
                    <div class="col-4">
                        <a class="btn btn-primary btn-lg" id="DashBordButton" href="AddBooks.jsp" role="button">Add Book</a>
                    </div>
                    <div class="col-4">
                        <a class="btn btn-primary btn-lg" id="DashBordButton" href="#" role="button">Book Search</a>
                    </div>
                    <div class="col-4">
                        <a class="btn btn-primary btn-lg" id="DashBordButton" href="#" role="button">Book Update</a>
                    </div>
                </div>
                <div class="row justify-content-around">
                    <div class="col-4">
                        <a class="btn btn-primary btn-lg" id="DashBordButton" href="#" role="button">View Order</a>
                    </div>
                    <div class="col-4">
                        <a class="btn btn-primary btn-lg" id="DashBordButton" href="#" role="button">Signout</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
