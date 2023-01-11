<%--<//https://uk.wikipedia.org/wiki/JSP--%>
<%--//JSP це такий формат файлу написаний на html який після компіляції буде перетворений у програмний сервлет--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--Види записів у jsp --%>
<%--1)Запис який виведе на сторінку записане --%>
<%----%>
hell wold

<%----%>


<%--2)В jsp файлі можна прописувати html код прорисовки сторінки --%>

<h1>Заголовок</h1>
<p>Текст</p>

<%--3)Прописання java логіки у jsp використовуючи символи <%%>--%>

<%System.out.println("hello");%>

<%
class A{
    int a;
    String name;

    public A(int a, String name) {
        this.a = a;
        this.name = name;
    }

   int somMetod(){
        return 1;
   }
}

%>


<%--4)Вираз який повинен поветати String--%>
<%="hello"%>


<jsp:forward page="JSP2Scriplet.jsp "></jsp:forward> <%--Перенаправляє на іншу JSP сторінку--%>

</body>
</html>

