<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
</head>
<body>
	<h1>
		<c:out value="${products.name}"></c:out>
	</h1>
	<a href="/">Home</a>

	<form action="/products/${products.id}" method="post">
		<h4>Add Category:</h4>
		<c:forEach var="category" items="${assigned}">
			<option value="${category.id}">${category.name}</option>
		</c:forEach>
		<select name="categoryId" id="" class="input">
			<c:forEach var="category" items="${unassigned}">
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select> <input class="input button" type="submit" value="Add" />
	</form>
</body>
</html>