<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Burger Tracker</h1>
<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating (out of 5)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.name}"/></td>
				<td><c:out value="${burger.restuarant}"/></td>
				<td><c:out value="${burger.rating}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<h1>Add burger</h1>
<form:form action="/burger" method="post" modelAttribute="burger">
    <p>
        <form:label path="name">Burger Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="restuarant">Restuarant</form:label>
        <form:errors path="restuarant"/>
        <form:textarea path="restuarant"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input path="rating"/>
    </p>
    <p>
        <form:label path="notes">Notes</form:label>
        <form:errors path="notes"/>     
        <form:input  path="notes"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>