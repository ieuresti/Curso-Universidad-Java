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
@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Suponemos que el usuario esta visitando por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioridad
        //llamada visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) { //Preguntamos si existe una cookie con estos valores
                    //En caso de que ya exista una cookie indicando que ya existe un usuario registrado
                    //con anterioridad ponemos la bandera en falso y salimos del ciclo
                    nuevoUsuario = false;
                    break;
                }
            } //Fin del for
        } //Fin del if
        
        //Revisamos si el usuario es un nuevo visitante
        String mensaje = null;
        if (nuevoUsuario) {
            //En caso de ser un nuevo usuario creamos el objeto Cookie
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        
        //Escribimos la salida
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //Omitimos el codigo HTML para simplificar el codigo
        out.println("Mensaje: " + mensaje);
    }

}
