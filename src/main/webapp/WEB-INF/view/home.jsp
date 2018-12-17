<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hello home!</h1>
<h3><a href="${pageContext.request.contextPath}/time">Time/scope test here</a></h3>
<h3><a href="${pageContext.request.contextPath}/cart">Cart session/singleton scope test here</a></h3>

<h3>Calculator test</h3>
<form method="post" action="/">
    <input name="a" type="number">
    <input name="b" type="number">
    <input type="submit" value="calculator">
</form>

<c:set var="resultAdd" scope="request" value="${requestScope.get('result-adding')}"/>
<c:set var="resultMinus" scope="request" value="${requestScope.get('result-substraction')}"/>
<c:set var="resultMulti" scope="request" value="${requestScope.get('result-multiplying')}"/>
<c:set var="resultDivi" scope="request" value="${requestScope.get('result-dividing')}"/>

<c:if test="${resultAdd != null}">
    <h3>adding result is : <c:out value="${ resultAdd }"/></h3>
    <h3>substracting result is : <c:out value="${ resultMinus }"/></h3>
    <h3>multiplying result is : <c:out value="${ resultMulti }"/></h3>
    <h3>dividing result is : <c:out value="${ resultDivi }"/></h3>
</c:if>

</body>
</html>
