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
        //1. En este caso no hay necesidad de procesar parametros
        
        //2. Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3, 6);
        
        //3. Agregamos las variables en cierto alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet");
        HttpSession session = request.getSession();
        session.setAttribute("rectangulo", rec);
        
        //4. Redireccionamos
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        //Se propagan los objetos request y response
        //para que puedan ser utilizados por el JSP seleccionado
        rd.forward(request, response);
        //Ya no se necesita hacer nada mas despues del redireccionamiento, ya que el flujo continua con el JSP
    }

}
