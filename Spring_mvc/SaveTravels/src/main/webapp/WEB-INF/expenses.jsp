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
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>

<h1 style="margin-left:500px">Save Travels</h1>
	<table class="table table-striped table-bordered" style="width: 50%; margin-left:500px">
	
		<thead>
		
			<tr>
				<th scope="col" style="width: 25%;">Expenses</th>
				<th scope="col" style="width: 25%;">Vendors</th>
				<th scope="col" style="width: 25%;">Amounts</th>
				<th scope="col" style="width: 25%;">Actions</th>
				<th scope="col" style="width: 25%;">Delete</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>

					<td scope="row"><c:out value="${expense.name}" /></td>
					<td scope="row"><c:out value="${expense.vendor}" /></td>
					<td scope="row"><c:out value="${expense.amount}" /></td>
					<td scope="row"><a href="/edit/${expense.id}">Edit</a></td>
					<td scope="row"><form action="/delete/${expense.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


	
<form:form action="/new" method="post" modelAttribute="expense" style= "margin-left:500px ">
<h1>Add an Expense</h1>
    <p>
        <form:label path="name" class="form-label">Expense Name</form:label>
        <form:errors path="name" />
        <form:input path="name" class="form-control" style="width: 400px;" />
    </p>
    <p>
        <form:label path="vendor" class="form-label">Vendor</form:label>
        <form:errors path="vendor" />
        <form:input path="vendor" class="form-control" style="width: 400px;" />
    </p>
    <p>
        <form:label path="amount" class="form-label">Amount</form:label>
        <form:errors path="amount" />
        <form:input path="amount" class="form-control" style="width: 400px;" />
    </p>
    <p>
        <form:label path="description" class="form-label">Description</form:label>
        <form:errors path="description" />
        <form:textarea path="description" class="form-control" cols="20" rows="5" style="width: 400px;"/>
    </p>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>