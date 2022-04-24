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
<title>Omikuki</title>
</head>
<body class="d-flex flex-column align-items-center">
    <h1 class="text-primary mb-3">Omikuji</h1>
    <div class="form-group col-4 p-4 bg-info text-dark mx-auto">
        <p>In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${name}"/>
        as your roommate, <c:out value="${hobby}"/> for a living.<br> The next time you see a <c:out value="${animal}"/>, you will have 
    good luck. <br> Also, <c:out value="${sayNice}"/></p>
    </div>
    <a class="btn btn-primary text-light mt-3" href="/">Go Back</a>
</body>
</html>