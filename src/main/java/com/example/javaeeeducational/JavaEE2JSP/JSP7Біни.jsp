
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="person" class="JavaEE2JSP.JSP7Person"></jsp:useBean> <%--Підключення біна--%>
<jsp:setProperty name="person" property="name" value="Max"/> <%-- Задання значення полю біна з JSP файла --%>
<jsp:setProperty name="person" property="age" value="30"/> <%-- Задання значення полю біна з JSP файла --%>
</body>
</html>
