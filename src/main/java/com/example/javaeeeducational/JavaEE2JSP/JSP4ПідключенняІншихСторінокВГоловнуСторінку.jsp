
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Підключення інших сторінок--%>

<%--1)Використовуючи директиву @include --%>
<%@include file="JSPTest.jsp"%> <%--Метод додавання інших сторінок із щитуванням перемінних і методів з підключаємого файлу --%>
<%@include file="TestClass.java"%> <%-- Підключення іншого класу або сервлета--%>
<%@include file="text.txt"%> <%-- Підключення текстового файлу--%>

<%--Доступ до полів і класу в іншій jsp дає @include--%>

<%=a%>
<%=A.class%>

<%--2) --%>
<jsp:include page="JSP1Begin.jsp"></jsp:include> <%--Другий метод додавання небуде доступу до полів підключчеих ресурсів--%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
