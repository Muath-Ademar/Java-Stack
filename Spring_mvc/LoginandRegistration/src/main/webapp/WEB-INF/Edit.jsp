<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Book</title>
</head>
<body>

 <form:form action="/books/${book.id}/edit" method="post" modelAttribute="book" style="margin-left:500px;">
        <input type="hidden" name="_method" value="put">
	<h1>Edit Book</h1>
        
        <p>
            <form:label path="title" class="form-label">Title</form:label>
            <form:errors path="title" />
            <form:input path="title" class="form-control" style="width: 400px;" />
        </p>
        <p>
            <form:label path="author" class="form-label">Author</form:label>
            <form:errors path="author" />
            <form:input path="author" class="form-control" style="width: 400px;" />
        </p>
        <p>
            <form:label path="mythoughts" class="form-label">My thoughts</form:label>
            <form:errors path="mythoughts" />
            <form:textarea path="mythoughts" class="form-control" style="width: 400px;" />
        </p>

        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
</body>
</html>