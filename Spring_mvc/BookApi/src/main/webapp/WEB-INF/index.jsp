<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Data</title>
</head>
<body>
<h1> ${book.title}</h1>
<p> Description:${book.description}</p>
<p> Number Of Pages :${book.numberOfPages}</p>
<p> Language :${book.language}</p>
</body>
</html>