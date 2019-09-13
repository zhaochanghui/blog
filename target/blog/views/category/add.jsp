<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="add" method="post" modelAttribute="category">
    <p>name: <form:input path="name"></form:input></p>
    <p><button>提交</button></p>
</form:form>
</body>
</html>
