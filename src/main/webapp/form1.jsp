<%--
  Created by IntelliJ IDEA.
  User: carlocontardi
  Date: 24/09/2021
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Ecco il form mate!
<form action="formServlet" method="post">
    <input type="email" name="email" placeholder="E-mail"/>
    <input type="text" name="first-name" placeholder="Nome"/>
    <input type="text" name="last-name" placeholder="Cognome"/>
    <input type="password" name="password" placeholder="Password"/>
    <input type="submit"/>
</form>
</body>
</html>
