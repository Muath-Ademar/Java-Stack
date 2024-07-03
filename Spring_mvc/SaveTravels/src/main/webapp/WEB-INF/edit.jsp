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
<title>Edit Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1>Edit an Expense</h1>
	<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
	
		<p>
			<form:label path="name" class="form-lable">Expense Name</form:label>
			<form:errors path="name" />
			<form:input path="name" class="form-control"/>
		</p>
		<p>
			<form:label path="vendor" class="form-lable">Vendor</form:label>
			<form:errors path="vendor" />
			<form:input path="vendor" class="form-control" />
		</p>
		<p>
			<form:label path="amount" class="form-lable">Amount</form:label>
			<form:errors path="amount" />
			<form:input path="amount" class="form-control" />
		</p>
		<p>
			<form:label path="description" class="form-lable">description</form:label>
			<form:errors path="description" />
			<form:textarea  path="description"  class="form-control"/>
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>