package Servlet.Usuario;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author parko
 */
@WebServlet(name = "SV_Usuario", urlPatterns = {"/SV_Usuario"})
public class SV_Usuario extends HttpServlet {

    Controladora controlusuario = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Usuario> lista_user = new ArrayList();
        lista_user = controlusuario.listarUsuario();

        HttpSession actual = request.getSession();
        actual.setAttribute("listusuario", lista_user);
        response.sendRedirect("Verusuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomreuser = request.getParameter("username");
        String password = request.getParameter("contra");
        String rol = request.getParameter("rol");
        System.out.println(password);

        controlusuario.crearUsuario(nomreuser, password, rol);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
