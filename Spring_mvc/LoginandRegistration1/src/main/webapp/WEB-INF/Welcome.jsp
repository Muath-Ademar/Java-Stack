<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
 <h1>Welcome <c:out value="${user.userName}"></c:out></h1>
  <p>Books from everyones shelves </p>
  <p><a href="/logout">logout</a></p> 
  <p><a href="/book/new">+ Add book to my shelf</a></p>
  
  	<table class="table table-striped table-bordered" >
	
		<thead>
		
			<tr>
				<th scope="col" style="width: 25%;">ID</th>
				<th scope="col" style="width: 25%;">Title</th>
				<th scope="col" style="width: 25%;">Author</th>
				<th scope="col" style="width: 25%;">posted by</th>
				<th scope="col" style="width: 25%;">Action</th>
				

			</tr>
		</thead>
		<tbody>
			 <c:forEach var="book" items="${books}"> 
				<tr>
					<td scope="row"><c:out value="${book.id}"></c:out></td>
					<td scope="row"><a href="/books/${book.id}"><c:out value="${book.title}"></a></c:out></td>
					<td scope="row"><c:out value="${book.author}" ></c:out></td>
					<td scope="row"><c:out value="${book.user.userName}" ></c:out></td>
					<td scope="row"><c:if test = "${Theuser==book.user.id}">
					<p><a href="/books/${book.id}/edit">edit</a></p>
					</c:if></td>

				</tr>
			 </c:forEach> 
		</tbody>
	</table>
</body>
</html>