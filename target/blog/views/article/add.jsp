<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="add" method="post" modelAttribute="article">
<p> title:<form:input path="title"/> </p>
<p> brief:<form:input path="brief"/> </p>
<p> content: <form:input path="content"/> </p>
    <p>categoyr:<form:select path="categoryId" items="${categories}" itemValue="id" itemLabel="name"></form:select> </p>
    <p><button>提交</button></p>
</form:form>

</body>
</html>
