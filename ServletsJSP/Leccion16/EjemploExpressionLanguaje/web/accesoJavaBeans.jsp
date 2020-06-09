<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso a JavaBeans</title>
    </head>
    <body>
        <h1>Acceso a JavaBeans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo"/>
        
        <!-- Asignamos los valores del formulario al JavaBean -->
        <jsp:setProperty name="rectangulo" property="*"/>
        <br>
        Valor base: ${rectangulo.base} <!-- nombre del bean / propiedad (valor del atributo) -->
        <br>
        Valor altura: ${rectangulo.altura}
        <br>
        Valor area: ${rectangulo.area} <!-- Se llama indirectamente el metodo getArea() -->
        <br>
        Calculo del area: ${rectangulo.base*rectangulo.altura}
        <br><br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
