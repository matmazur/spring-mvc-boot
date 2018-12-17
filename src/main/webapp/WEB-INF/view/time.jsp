<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Time right now</title>
</head>
<body>
<c:set var="time" scope="request" value="${requestScope.get('time')}"/>
<h1>Time right now is ${time}</h1>
</body>
</html>
