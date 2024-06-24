<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
<h1>you have visited <c:out value="${counter}"/> <a href="/your_server">http://your_server. </a> <br>  
<a href="/your_server">Test another visit</a> </h1>
</body>
</html>