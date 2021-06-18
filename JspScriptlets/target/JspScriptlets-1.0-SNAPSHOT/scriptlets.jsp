<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/05/2021
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP con scriptlets</title>
</head>
<body>
<h1>JSP con Scriptlets</h1>
<br>
<%--Scriplet para enviar informacion al navegador --%>
<% out.print("saludos desde un Scriptlet");%>
<%-- Scriplet para manejar los objetos implicitos --%>
<% String nombreAplicacion = request.getContextPath();
out.print("nombre de la aplicacion"+nombreAplicacion); %>
<br>
<%-- Scriplet con codigo condicionado--%>
<% if (session !=null && session.isNew()){
    %>
La sesion es nueva

<% }else if (session!=null){%>
la sesion no es nueva

<% } %>
<br>
<a href="index.html">Regresar al incio</a>

</body>
</html>
