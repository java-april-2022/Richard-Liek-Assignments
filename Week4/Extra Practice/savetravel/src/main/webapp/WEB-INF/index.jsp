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
    <h1>Save Travels</h1>
    <table class="table table-hover bg-info">
        <thead>
            <tr>
                <th>Expense</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <!-- For Each Loop Here -->
			<c:forEach var="expense" items="${exp}">
				<tr>
                	<td><c:out value="${expense.name}"/></td>
                	<td><c:out value="${expense.vendor}"/></td>
                	<td>$<c:out value="${expense.amount}"/></td>
                	<td><c:out value="${expense.description}"/></td>	
            	</tr>
			</c:forEach>
        </tbody>
    </table>
    
    <form:form action="/newExpense" method="post" modelAttribute="expense" class="col-4 p-4 bg-info text-dark">
    	<div class="form-group">
        	<form:errors path="name"/>
    		<form:label path="name">Expense Name:</form:label>
    		<form:input path="name"/>
    	</div>
    	<div class="form-group">
	    	<form:errors path="vendor"/>
	    	<form:label path="vendor">Vendor:</form:label>
	    	<form:input path="vendor"/>
    	</div>
    	<div class="form-group">
	    	<form:errors path="amount"/>
	    	<form:label path="amount">Amount:</form:label>
	    	<form:input path="amount" type="number"/>
    	</div>
    	<div class="form-group">
	    	<form:errors path="description"/>
	    	<form:label path="description">Description:</form:label>
	    	<form:textarea path="description"/>
    	</div>
    	<input type="submit" value="Submit" class="btn btn-primary">
    </form:form>

</body>
</html>