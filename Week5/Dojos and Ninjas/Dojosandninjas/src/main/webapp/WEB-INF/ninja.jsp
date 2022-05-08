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
	        <a href="" class="btn btn-primary">Create Dojo</a>
	        <a href="/ninja/new" class="btn btn-primary">Create Ninja</a>
		</div>
	</nav>
	<h2>Create a new Ninja!</h2>
	<form:form action="/ninja/new" method="POST" modelAttribute="newNinja">
		<form:errors path="firstName"/>
		<div class="form-group">
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName"/>
		</div>
		<form:errors path="lastName"/>
		<div class="form-group">
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName"/>
		</div>
		<form:errors path="age"/>
		<div class="form-group">
			<form:label path="age">Age:</form:label>
			<form:input path="age" type="number"/>
		</div>
		<!-- Select Dojo Input HERE -->
		<form:select path="dojo">
    		<c:forEach items="${dojos}" var="dojo">
    			<form:option value="${dojo.id}"> ${dojo.name} </form:option>
    		</c:forEach>
    	</form:select>
		<input type="submit" value="Submit"/>
		
	</form:form>
</body>
</html>