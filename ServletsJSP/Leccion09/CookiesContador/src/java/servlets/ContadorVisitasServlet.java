package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "ContadorVisitasServlet", urlPatterns = {"/ContadorVisitasServlet"})
public class ContadorVisitasServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Declaramos la variable contador
        int contador = 0;
        
        //Si existe, obtenemos el contador de visitas actual
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) { //Preguntamos si existe una cookie con el nombre contadorVisitas
                    try {
                        //Obtenemos el valor del contador de visitas actual
                        contador = Integer.parseInt(c.getValue());
                    } catch (NumberFormatException e) {
                        //En caso de error, reiniciamos el contador de visitas
                        contador = 0;
                    }
                }
            } //Fin del for
        } //Fin del if
        
        //Incrementamos el contador de visitas y lo agregamos en la cookie de respuesta
        contador++;
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //La cookie se almacenara en el navegador por 1 hora
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Contador de visitas de cada cliente: " + contador);
    }

}
