<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hello home!</h1>
<h3>Calculator test</h3>
<form method="post" action="/">
    <input name="a" type="number">
    <input name="b" type="number">
    <input type="submit" value="add numbers">

    <c:set var="result" scope="request" value="${requestScope.get('result')}"/>
    <c:if test="${result gt 0}">
        <p><c:out value="${result}"/></p>
    </c:if>

</form>
</body>
</html>
