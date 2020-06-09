<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC 2</title>
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <div style="color:red"> ${mensaje} </div>
        <a href="${pageContext.request.contextPath}/ServletControlador">Link al Servlet Controlador sin parametros</a>
        <br><br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">Link al Servlet Controlador para agregar las variables</a>
        <br><br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">Link al Servlet Controlador para listar variables</a>
    </body>
</html>
