<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add project</title>
<p><a href="/dash"> Home</a></p> 

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>

	<form:form action="/addproject" method="post" modelAttribute="project">
		<h1>Add a Project</h1>
		<p>
			<form:label path="title" class="form-label">Project Name</form:label>
			<form:errors path="title" />
			<form:input path="title" class="form-control" />
		</p>
		<p>
			<form:label path="description" class="form-label">Project Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" class="form-control" />
		</p>
		<p>
			<form:label path="dueDate" class="form-label">Due Date</form:label>
			<form:errors path="dueDate" />
			<form:input type="date" path="dueDate" class="form-control" />
		</p>
		<input type="submit" value="Submit" />
		
		</form:form>
</body>
</html>