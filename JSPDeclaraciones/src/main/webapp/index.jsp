<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/05/2021
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private String user= "juan";
    public String getUser(){
        return this.user;
    }
    private int count=1;
%>

<html>
<head>
    <title>Uso de declaraciones</title>
</head>

<body>
<h1>Uso de declaraciones con jsp</h1>
Valor usuario por medio del atributo: <%=this.user%>
<br>
Valor usuario por medio del metodo:<%=this.getUser()%>
<br>
Contador visitas <%=this.count++%>
</body>
</html>
