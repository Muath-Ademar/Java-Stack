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
<title>Welcome</title>
</head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<body>
	<h1>
		Welcome
		<c:out value="${user.userName}"></c:out>
	</h1>

	<p>
		<a href="/logout">logout</a>
	</p>
	<p>
		<a href="/projects/new"> +Add New Project</a>
	</p>

	<p>All projects</p>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Project</th>
				<th scope="col">team Lead</th>
				<th scope="col">Due Date</th>
				<th scope="col">action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${projects}">
				<tr>
					<th scope="row"><a href="/projects/${project.id}">${project.title}</a></th>
					<td scope="row">${project.user.userName}</td>
					<td scope="row">${project.dueDate}</td>

					<td scope="row"><a href="/join/${project.id}">join</a></td>

				</tr>
			</c:forEach>
		</tbody>
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col" class="dark-theamed">Project</th>
					<th scope="col">team Lead</th>
					<th scope="col">Due Date</th>
					<th scope="col">action</th>
				</tr>
			</thead>
			<tbody>
				<h1></h1>
				<c:forEach var="project" items="${assigned}">
					<tr>
						<th scope="row"><a href="/projects/${project.id}">${project.title}</a></th>
						<td scope="row">${project.user.userName}</td>
						<td scope="row">${project.dueDate}</td>
						<c:if test="${userid==project.user.id}">
							<td scope="row"><a href="/projects/edit/${project.id}">edit</a></td>
						</c:if>
						<c:if test="${userid!=project.user.id}">
							<td scope="row"><a href="join/${project.id}/delete">Leave Team</a></td>
						</c:if>

					</tr>
				</c:forEach>

			</tbody>
		</table>
</body>
</html>