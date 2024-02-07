<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
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
					<div class="col">
						<img
							src="https://s3-alpha-sig.figma.com/img/212b/d3d3/999fcd49b8b86b27315bddd6a9e74a83?Expires=1707696000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=YqAzujfrktWoOfNE6Wjo8MoOpkQ0P9fEYbZ-4YeFUrproRHzVHduZ0QJ4v5cUUNRib3fn7wtV88KQiKiCLA-DWqbA6SnMrB9z2g3IiNmu3cgQ4zhGUgmvCImgVlrEYSlbt2JYIIrn~VBqXxrYsmumTusxGrsNV4HwHL3OhunQGVdQ44qp5R8EKwihIgpWknZf3nT12YCd4M~AliP2pr5d8qe-H5SCUMOdZTxxSU0YTIFx8-LYtV6jiLfwSixUjd4TDsWBCcDNZBnaq4RsXXhTGo9isElVnDniiSsS-JR4jrc4MzQc~3L4RFvSGo-Wcg25SUTUcRXqRINhYQ~-01~Bw__"
							id="leftImg" alt="Img">
					</div>
					<div class="col">
						<form action="student_register" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Student
									id</label> <input type="text" class="form-control" name="StudentId">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">User
									Name</label> <input type="text" class="form-control" name="username">
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control" name="password">
							</div>
							<button type="submit" class="btn btn-primary">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
