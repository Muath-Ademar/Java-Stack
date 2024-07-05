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
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1 class="home">Home Page</h1> 
	<div class="upperlinks">
	<a class="text-center" href="/category/new">Add Category</a>
	<a class="text-center" href="/product/new">Add product</a>
	</div>
	<div class="container">
		<div class="row justify-content-center"">
			<div class="col-6">
				<table class="table table-striped">
					<thead>
					 
						<tr>
							<th scope="row" >Categories</th>

						</tr>
						
					</thead>
					<tbody>
						<c:forEach var="category" items="${categories}">
							<tr>
								<td scope="col" class="text-center"><a href="/categories/${category.id}"><c:out value="${category.name}"></c:out></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-6">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="row">Product Page</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="product" items="${products}">
						<tr>
							<td scope="col" class="text-center"><a href="/products/${product.id}"><c:out value="${product.name}"></c:out></a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>