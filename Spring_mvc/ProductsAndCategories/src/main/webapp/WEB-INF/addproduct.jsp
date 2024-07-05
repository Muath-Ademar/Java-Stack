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
<title>Add Product</title>
</head>
<body>
	<form:form action="/addProduct" method="post" modelAttribute="product" style="margin-left:500px ">
	<h1>Add Product</h1>

		<p>
			<form:label path="name" class="form-label">Product name</form:label>
			<form:errors path="name" />
			<form:input path="name" class="form-control" style="width: 400px;" />
		</p>
		<p>
			<form:label path="description" class="form-label">Product description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" class="form-control" style="width: 400px;" />
		</p>
		<p>
			<form:label path="price" class="form-label">Price</form:label>
			<form:errors path="price" />
			<form:input type="number" path="price" class="form-control" style="width: 400px;" />
		</p>
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>