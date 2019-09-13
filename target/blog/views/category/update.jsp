<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="update" method="post" modelAttribute="category">
    <form:hidden path="id"/>
    <p>name: <form:input path="name"></form:input></p>
    <p>parent:<form:select path="parent.id" items="${categories}" itemValue="parent.id" itemLabel="paent.name" /> </p>
    <p><button>提交</button></p>
</form:form>
</body>
</html>
