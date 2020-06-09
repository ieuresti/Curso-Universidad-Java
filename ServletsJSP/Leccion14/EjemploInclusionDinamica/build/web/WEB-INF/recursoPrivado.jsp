<%
    String colorFondo = request.getParameter("colorFondo");
    if (colorFondo == null || colorFondo.trim().equals("")) {
        colorFondo = "white"; //valor por default
    }
%>

<body bgcolor="<%=colorFondo%>">
    Despliege del contenido desde un JSP privado en WEB-INF
</body>

