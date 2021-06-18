<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/05/2021
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HolaMundo JSPs</title>
</head>
<body>
<h1>HolaMundo JSPs</h1>
<ul>
    <li><% out.print("HolaMundo con Scriplets"); %></li>
    <li>${"HolaMundo con Expression Language (El)"}</li>
    <li><%="HolaMundo con expresiones"%>
    </li>


</ul>
</body>
</html>
