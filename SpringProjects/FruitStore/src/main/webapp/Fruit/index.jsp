<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1>Fruit Store</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  
 
  <c:forEach var="fruit" items="${fruits}">
    <tr>
    <c:choose>
    <c:when test = "${fruit.name.startsWith('G')}">
      		<td style="color: orange"><c:out value="${fruit.name}"/></td>	
      		<td><c:out value="${fruit.price}"/></td>
     </c:when>
     <c:otherwise>
     <td><c:out value="${fruit.name}"/></td>	
      <td><c:out value="${fruit.price}"/></td>
     </c:otherwise>
     </c:choose>
    </tr>
</c:forEach>
  </tbody>
</table>
</body>
</html>