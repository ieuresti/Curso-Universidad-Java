package servlets;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        //Creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();
        
        //Recuperamos la lista de articulos previos
        //Si es que existen en la sesion
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            //Si no existen, inicializamos la lista y la agregamos a la sesion
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
        //Ya tenemos la lista de articulos lista para trabajar
        //Agregamos el nuevo articulo y lo agregamos por paso por referencia a la lista de articulos
        //Diferente de null y cadena vacia
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) { //trim() remueve espacios a la izq y der
            articulos.add(articuloNuevo);
        }
        try (PrintWriter out = response.getWriter()) {
            //Mostramos los articulos totales al cliente
            out.println("<h1>Lista de Articulos</h1>");
            out.println("<br>");
            //Iteramos todos los articulos, incluyendo el nuevo
            for (String articulo : articulos) {
                out.println("<li>" + articulo + "</li>");
            }
            //Agregamos un link para regresar al inicio
            out.println("<br>");
            out.println("<a href='/EjemploCarritoCompras'>regresar</a>");
        }
    }

}
