<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project Details</title>
<a href="/dash">Dashboard</a>
</head>
<body>
<h1>Project Details</h1>
<p> Project:  <c:out value="${projects.title}"></c:out>
<p> Description: <c:out value="${projects.description}"></c:out>
<p> Due Date: <c:out value="${projects.dueDate}"></c:out>
<a href="#">tasks</a>
</body>
</html>