<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
<h1><c:out value="${Book.title}"></c:out></h1>
<c:if test="${ Theuser == Book.user.id}">
    <h2><c:out value="${Book.user.userName}"></c:out> Read <c:out value="${Book.title}"></c:out> By <c:out value="${Book.author}"></c:out></h2>
</c:if>
		
<h2>here are <c:out value="${Book.user.userName}"></c:out>'s thoughts.</h2>

<p><c:out value="${Book.mythoughts}"/></p>
<c:if test="${ Theuser == Book.user.id}">
		<p><a href="/books/${Book.id}/edit">edit</a></p>
		<form action="/delete/${Book.id}" method="post">
		<input type="hidden" name="_method" value="delete"> 
		<input type="submit" value="Delete">
		</form>
</c:if>
</body>
</html>