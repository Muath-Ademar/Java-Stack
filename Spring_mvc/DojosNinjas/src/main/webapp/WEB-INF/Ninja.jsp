<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja</title>
</head>
<body>
	<h1>Add Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="ninjas">
		<form:label path="dojo">Select Dojo</form:label>
		<form:select path="dojo">
		<c:forEach var="dojo" items = "${dojos}">
			<form:option value="${dojo.id}" path="dojo">
				<c:out value="${dojo.name}" />
			</form:option>
			</c:forEach>
		</form:select>
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName" />
		<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">age</form:label>
			<form:errors path="age" />
			<form:input path="age" />
		</p>


		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>