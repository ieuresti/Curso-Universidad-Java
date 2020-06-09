<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Estatica</title>
        <script type='text/JavaScript' src="recursos/funciones.js"></script>
        <link type="text/css" href="recursos/estilos.css" rel="stylesheet">
    </head>
    <body>
        
        <h1>Inclusi&oacute;n de Archivos Estaticos</h1>
        
        <!-- Esto es por cada menu -->
        <br>
        <!-- Menu principal -->
        <span class="noticias" align="left">
            <a href="javascript:desplegar ('noticias');"> <!--Cuando se de click mostrara el elemento(menu) noticias gracias a la funcion desplegar-->
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif">
            </a>
        </span>
        <span id="noticias" class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/noticia1.html"%></li>
                <li><%@include file="pages/noticia2.html"%></li>
            </ul>
        </span>
            
        <!-- Esto es por cada menu -->
        <br>
        <!-- Menu principal -->
        <span class="videos" align="left">
            <a href="javascript:desplegar ('videos');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif">
            </a>
        </span>
        <span id="videos" class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/video1.html"%></li>
            </ul>
        </span>
            
    </body>
</html>
