<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/05/2021
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Procesa Formulario</title>
</head>
<body>
<h1>Resultado de procesar el Formulario
</h1>
Usuario: <%= request.getParameter("usuario")%>
<br>
Password: <%=request.getParameter("password") %>
<br>
<br>
<a href="../index.html ">Regresar al incio</a>
</body>
</html>
