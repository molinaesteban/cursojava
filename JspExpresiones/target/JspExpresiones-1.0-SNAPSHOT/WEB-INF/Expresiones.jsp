<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/05/2021
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP con Expresiones</title>
</head>
<body>
<h1>JSP con expresiones</h1>
Concatenacion: <%="Saludos"+" "+ "JSP "%>
<br>
Operacion Matematica <%=2*3/2%>
<br>
Session id: <%= session.getId()%>
<br>
<br>
<a href="">Regresar al inicio</a>
</body>
</html>
