package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("Metodo doGet no soportado en el Servlet");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Leemos los parametros del formulario, por default el formulario es de tipo Get
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        System.out.println("usuario: " + usuario);
        System.out.println("password: " + password);

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es: " + usuario);
        out.println("<br>");
        out.println("El parametro password es: " + password);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
