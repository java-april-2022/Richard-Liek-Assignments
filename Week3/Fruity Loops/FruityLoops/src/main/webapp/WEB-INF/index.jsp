<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body>

	<h1 class="text-primary navbar justify-content-center">Fruit Store</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td class="text-info"><c:out value="${fruit.name}"></c:out></td>
					<td class="text-dark"><c:out value="${fruit.price}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	
	</table>
</body>
</html>