<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>Registration and Login</title>
</head>
<body class="container">
	<div class="navbar">
		<h1>Welcome to Book Club!</h1>
	</div>
	<div class="d-flex justify-content-around">
		<form:form action="/registration" method="post"
					modelAttribute="newUser" class="col-4 p-4 bg-info text-light">
					<h2 class="text-light">Register</h2>
					<div class="form-group">
						<form:label path="name"> Name</form:label>
						<form:errors class="text-danger" path="name" />
						<form:input class="form-control" path="name" />
					</div>
					<div class="form-group">
						<form:label path="email">Email</form:label>
						<form:errors class="text-danger" path="email" />
						<form:input class="form-control" path="email" />
					</div>
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:errors class="text-danger" path="password" />
						<form:password class="form-control" path="password" />
					</div>
					<div class="form-group">
						<form:label path="confirmPassword">Confirm Password</form:label>
						<form:errors class="text-danger" path="confirmPassword" />
						<form:password class="form-control" path="confirmPassword" />
					</div>
					<button class="btn btn-primary">Submit</button>
		</form:form>
		
		<form:form action="/login" method="post" modelAttribute="newLogin" class="col-4 p-4 bg-info text-light">
					<h2 class="text-light">Login</h2>
					<div class="form-group">
						<form:label path="email">Email</form:label>
						<form:errors path="email" />
						<form:input class="form-control" path="email" />
					</div>
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:errors path="password" />
						<form:password class="form-control" path="password" />
					</div>
					<button class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>