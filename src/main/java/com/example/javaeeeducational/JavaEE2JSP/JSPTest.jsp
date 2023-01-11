<%@ page import="JavaEE2JSP.A" %><%--<//https://uk.wikipedia.org/wiki/JSP--%>
<%--//JSP це такий формат файлу написаний на html який після компіляції буде перетворений у програмний сервлет--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%int a;%>


<%

    class A{
        String name;
        int age;
        public A(){};
        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void somMetod(){
            System.out.println("somMetod");
        }}%>









</body>
</html>

