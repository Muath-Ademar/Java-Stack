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
<title>Add Category</title>
</head>
<body>


	<form:form action="/add" method="post" modelAttribute="category" style="margin-left:500px ">
	<h1>add Category</h1>

		<p>
			<form:label path="name" class="form-label">Category name</form:label>
			<form:errors path="name" />
			<form:input path="name" class="form-control" style="width: 400px;" />
		</p>
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>