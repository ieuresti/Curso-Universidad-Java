<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Expression Languaje</title>
    </head>
    <body>
        <h1>Ejemplo de Expression Languaje</h1>
        <br>
        <!-- Pasamos un parametro utilizando el metodo get (param(usuario) valor(juan)) -->
        <a href="variablesImplicitas.jsp?usuario=juan">Objetos implicitos con EL</a>
        <br><br>
        
        <!-- Entramos al JSP que accede al JavaBean -->
        Formulario HTML:
        <br>
        <form name="form1" action="accesoJavaBeans.jsp">
            Base: <input type="text" name="base">
            <br>
            Altura: <input type="text" name="altura">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
