<%--
 В jsp  є декілька змінних які ініціалізуються неявно тобто їх не порбібно явно обявляти вони створються разом з jsp
  request response session  дані змінні аналоги сервлетних змінних і володіють таким самими методами
  помимо цих є ще декілька власних jsp перемінних
  application - дозволяє працювати з аплікацією в програмів
  config

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.getMethod();
session.getAttribute("");
application.getRequestDispatcher("");
config.getInitParameter("");

%>
</body>
</html>
