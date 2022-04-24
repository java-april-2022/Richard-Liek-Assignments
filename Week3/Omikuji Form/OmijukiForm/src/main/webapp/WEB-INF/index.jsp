<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS-->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="text-primary navbar justify-content-center">Send an Omikuji</h1>
	<div class="text-primary offset-lg-5">
		<form class="col-4 p-4 bg-info text-light" action="/results" method="post">
			<div class="form-group">
				<label for="number">Pick any number from 5 to 25:</label>
				<input type="number" name="number" id="number" min="5" max="25" required/>
			</div>
			<div class="form-group">
				<label for="city">Enter the name of any city:</label>
				<input type="text" name="city" class="form-control" required>
			</div>
			<div class="form-group">
				<label for="name">Enter the name of any real person:</label>
				<input type="text" name="name" class="form-control" required>
			</div>
			<div class="form-group">
				<label for="hobby">Enter professional endeavor or hobby:</label>
				<input type="text" name="hobby" class="form-control" required>
			</div>
			<div class="form-group">
				<label for="animal">Enter any type of living thing:</label>
				<input type="text" name="animal" class="form-control" required>
			</div>
			<div class="form-group">
				<label for="sayNice">Say something nice to someone:</label>
				<textarea name="sayNice" id="sayNice" cols="30" rows="10" class="form-control" required></textarea>
			</div>
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form>
	
	</div>
</body>
</html>