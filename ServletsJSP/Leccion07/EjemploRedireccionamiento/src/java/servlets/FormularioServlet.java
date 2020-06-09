package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormularioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormularioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        //Simulamos valores ya que no hay BD en este ejemplo
        String usuarioCorrecto = "Ivan";
        String passCorrecto = "123";
        
        //Recuperar el parametro que el usuario envio desde el formulario
        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");
        
        if (usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)) {
            out.println("<h1>");
            out.println("Datos correctos");
            out.println("<br>Usuario: " + pUsuario);
            out.println("<br>Password: " + pPassword);
            out.println("</h1>");
        } else {
            //Respondemos al navegador con un codigo de estado No Autorizado
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
        
        //Listado de codigos de error
        //http://docstore.mik.ua/orelly/java-ent/servlet/appc_01.htm
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
