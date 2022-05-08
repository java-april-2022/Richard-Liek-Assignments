<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>Travel Expenses</title>
</head>
<body class="container bg-dark">
	<nav class="d-flex justify-content-between align-items-center col-12">
		<h1 class="text-light">Dojos and Ninjas</h1>
		<div>
			<a href="/" class="btn btn-primary">Home</a>
	        <a href="/dojo/new" class="btn btn-primary">Create Dojo</a>
	        <a href="/ninja" class="btn btn-primary">Create Ninja</a>
		</div>
	</nav>
    <table class="table table-hover bg-info col-4 p-4">
        <thead>
            <tr>
                <th>Dojo Location</th>
                <th>Actions</th>
            </tr>
        </thead>
      	<tbody>
            <!-- For Each Loop Here -->
			<c:forEach var="dojos" items="${dojoLocations}">
				<tr>
                	<td><c:out value="${dojos.name}"/></td>
                	<td><a class="btn btn-primary" href="/dojo/<c:out value="${dojos.id}"/>">Details</a></td>
            	</tr>
			</c:forEach>
        </tbody>

</body>
</html>