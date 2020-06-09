package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //Pedimos el atributo, y verificamos si existe
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //Si es igual a nulo, quiere decir que es la primera vez que accedemos al recurso
        if (contadorVisitas == null) {
            contadorVisitas = new Integer(1);
            titulo = "Bienvenido por primera vez...";
        } else {
            //Si es distinto de nulo, incrementamos el contador
            titulo = "Bienvenido Nuevamente";
            contadorVisitas += 1;
        }
        
        //En cualquier caso, agregamos el valor del contador a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Mostramos los valores en el cliente
        PrintWriter out = response.getWriter();
        out.println("Titulo: " + titulo);
        out.println("<br>");
        out.println("No. Accesos al recurso: " + contadorVisitas);
        out.println("<br>");
        out.println("ID de la sesion: " + sesion.getId());
    }

}
