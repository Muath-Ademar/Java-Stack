<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1>Book Store</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Title</th>
      <th scope="col">Description</th>
      <th scope="col">Pages</th>
      <th scope="col">Number of pages</th>
      <th scope="col">Language</th>
      
    </tr>
  </thead>
  <tbody>
  
 
  <c:forEach var="book" items="${books}">
    <tr>
    		<td>${book.id}</td>
      		<td><a href="/books/${book.id}"/> ${book.title}</a></td>
      		<td>${book.description}</td>
      		<td>${book.numberOfPages}</td>
      		<td>${book.language}</td>

    </tr>
</c:forEach>
  </tbody>
</table>
</body>
</html>