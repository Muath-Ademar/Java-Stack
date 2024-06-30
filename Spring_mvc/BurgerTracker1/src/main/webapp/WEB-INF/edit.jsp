<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="/burger/edit/${burger.id}" method="post" modelAttribute="burger">
	<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Burger Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="restuarant">Restuarant</form:label>
        <form:errors path="restuarant"/>
        <form:textarea path="restuarant"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input path="rating"/>
    </p>
    <p>
        <form:label path="notes">Notes</form:label>
        <form:errors path="notes"/>     
        <form:input  path="notes"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>


</body>
</html>