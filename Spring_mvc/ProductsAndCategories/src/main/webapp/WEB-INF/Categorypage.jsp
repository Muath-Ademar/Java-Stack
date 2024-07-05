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
<title>Category</title>
</head>
<body>
<h1><c:out value="${categories.name}"></c:out></h1>
<a href="/">Home</a>

  <form action="/categories/${categories.id}" method="post">
        <h4>Add Product:</h4>   
        <c:forEach var="product" items="${assigned}">
                <p><c:out value="${product.name}"/></p>
          </c:forEach>             
        <select name="productId" id="" class="input">
            <c:forEach var="product" items="${unassigned}">
                <option value="${product.id}">${product.name}</option>
            </c:forEach>
        </select>
        
        <input class="input button" type="submit" value="Add"/>
    </form>
</body>
</html>