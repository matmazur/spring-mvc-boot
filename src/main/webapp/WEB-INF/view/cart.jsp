<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Cart page</title>
</head>
<body>
<c:set var="cart" scope="request" value="${requestScope.get('cart')}"/>
<c:choose>
    <c:when test="${cart == null || empty cart}">
        <p>list <c:out value="is empty"/></p>
    </c:when>
    <c:otherwise>
        <ol>
            <c:forEach items="${cart}" var="item">
                <li>${item}</li>
            </c:forEach>
        </ol>
    </c:otherwise>
</c:choose>
<h2></h2>
<form method="post" action="/cart">
    <input type="text" name="product" placeholder="type in product to add">
    <input type="submit" value="add to list">
</form>
</body>
</html>
