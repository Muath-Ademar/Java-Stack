<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="Gold">
        <h1>Your Gold: <c:out value="${counter}"/> </h1>
        
    </div>
<div class="container">
    <div class="box">
        <h1>Farm</h1>
        <p>(earns 10-20 gold)</p>
        <form action="/action" method="post">
            
            <input type="hidden", name="box" value="Farm">
            <button>find Gold</button>
        </form>
        
    </div>
    <div class="box">
        <h1>Cave</h1>
        <p>(earns 5-10 gold)</p>
        <form action="/action" method="post">
            
            <input type="hidden", name="box" value="Cave">
            <button>find Gold!</button>
        </form>
    </div>
    <div class="box">
        <h1>House</h1>
        <p>(earns 2-5 gold)</p>
        <form action="/action" method="post">
            
            <input type="hidden", name="box" value="House">
            <button>find Gold!</button>
        </form>
        
    </div>
    <div class="box">
        <h1>Quest</h1>
        <p>(earns/takes 0-50 gold)</p>
        <form action="/action" method="post">
            
            <input type="hidden", name="box" value="Quest">
            <button>find Gold!</button>
        </form>
    </div>
    
</div>
    <h1 class="act">Activities:</h1>
    
        <div class="Activities">
        <c:forEach var="act" items="${activities}">
		        <c:if test ="${act.contains('earned')}">
		            <p style="color:Green;" class="activities-list"><c:out value="${act}"/></p>
		        </c:if>
		   		<c:if test = "${act.contains('lost')}">
		            <p style="color:red;" class="activities-list"><c:out value="${act}"/></p>
		        </c:if>
         </c:forEach>
        </div>
  

</body>
</html>