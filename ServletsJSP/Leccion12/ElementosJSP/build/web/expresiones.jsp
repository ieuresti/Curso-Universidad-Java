<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- Directivas -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP de expresiones</title>
    </head>
    <body>
        <h1>JSP de expresiones</h1>
        Concatenaci&oacute;n: <%= "Saludos" + "JSP" %>
        <br>
        Operaci&oacute;n Matematica: <%= 2 * 3 / 2 %>
        <br>
        Session id: <%= session.getId() %> <!-- Regresa el id de la sesion -->
        <br><br>       
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
