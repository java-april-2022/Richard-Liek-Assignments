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
<body class="container">
	<nav class="d-flex justify-content-between align-items-center col-12">
		<h1 class="text-dark">Dojos and Ninjas</h1>
		<div>
			<a href="/" class="btn btn-primary">Home</a>
		</div>
	</nav>
 
	<form:form action="/dojo/new" method="POST" modelAttribute="newDojo">
		<form:errors path="name"/>
		<form:label path="name">Dojo Name/Location:</form:label>
		<form:input path="name"/>
		<input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>

</body>
</html>