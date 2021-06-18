<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/05/2021
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String fondo= request.getParameter("colorFondo");
    if( fondo==null||fondo.trim().equals("")){
        fondo="white";
    }
%>
<html>
<head>
    <title>JSP Cambio de color</title>
</head>
<body bgcolor="<%=fondo%>">
<h1>JSP cambio de color</h1>
<br>
Color de fondo aplicado: <%=fondo%>
<br>
<a href="index.html">Regresar al inicio</a>

</body>
</html>
