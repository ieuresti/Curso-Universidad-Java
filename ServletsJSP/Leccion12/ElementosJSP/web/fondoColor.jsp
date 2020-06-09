<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String fondo = request.getParameter("colorFondo");
    //Si no se envio un color, ponemos un color por default
    if (fondo == null || fondo.trim().equals("")) {
            fondo = "white";
        }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio de Color de Fondo</title>
    </head>
    <body bgcolor="<%= fondo %>">
        <h1>Fondo de Color Aplicado: <%= fondo %></h1>
        <br>
        <a href="index.html">Regresar al index</a>
    </body>
</html>
