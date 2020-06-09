package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangulo;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Procesamos la peticion
        //1. Procesamos los parametros
        String accion = request.getParameter("accion");
        
        //2. Creamos los JavaBeans a compartir
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSession = new Rectangulo(3, 4);
        Rectangulo recApplication = new Rectangulo(5, 6);
        
        if ("agregaVariables".equals(accion)) {
            //3. Compartimos las variables en el alcance seleccionado
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);
            //Alcance application
            ServletContext application = this.getServletContext();
            request.setAttribute("rectanguloApplication", recApplication);
            
            //Agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. Redireccionamos al JSP seleccionado
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else if ("listarVariables".equals(accion)) {
            //4. Unicamente redireccionamos, ya no agregamos variables
            //y se desplegaran solamente las que sigan disponibles segun el alcance de cada variable
            request.getRequestDispatcher("/WEB-INF/alcanceVariables.jsp").forward(request, response);
            
        } else {
            //4. Redireccionamos a la pagina de inicio
            //agregamos un mensaje
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            //Esta linea no agregaria, envia la informacion al JSP
            //si no es una peticion al navegador web
            //response.sendRedirect("index.jsp");
        }
    }
}
