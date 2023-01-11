<%--<//https://uk.wikipedia.org/wiki/JSP--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Заголовок</h1>
<p>Текст</p>
<jsp:scriptlet>
    out.print(Calendar.getInstance(request.getLocale()).getFirstDayOfWeek() == Calendar.SUNDAY ?
        "В вашій країні тиждень починається з неділі " :
        "В вашій країні тиждень починається не з неділі");
    </jsp:scriptlet>
</body>
</html>
