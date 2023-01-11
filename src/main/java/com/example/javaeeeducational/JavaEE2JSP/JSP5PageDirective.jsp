


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%-- <%@ page це спеціальна дериктива яка може задавати ряд параметрів   --%>
<%--1)Імпорт--%>
<%@ page import="MyPackage" %>

<%--2)Включати виключати сесію--%>
<%@ page session="true" %>


<%--3)Робити наслідування від сервлета або класу--%>
<%@ page extends="MyPackage.Cart" %>


<%--4)Перенаправлення в разі винекнення помилки на сторінці--%>
<%@ page errorPage="" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
