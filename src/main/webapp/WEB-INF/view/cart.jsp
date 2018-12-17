<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Cart page</title>
</head>
<body>
<c:set var="cart" scope="session" value="${sessionScope.get('cart')}"/>
<c:if test="${cart == null}">
    <p><c:out value="is empty"/></p>
</c:if>
<c:otherwise>
    <ol>
        <c:forEach items="${cart}" var="item">
            <li>${item}</li>
        </c:forEach>
    </ol>
</c:otherwise>

</body>
</html>
