package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SV_EditarU", urlPatterns = {"/SV_EditarU"})
public class SV_EditarU extends HttpServlet {

    Controladora control = new Controladora();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        id = Integer.parseInt(request.getParameter("id"));

        Usuario usu = control.buscarUser(id);
        HttpSession actualsession = request.getSession(); // guardamos la session de actual del clinete
        actualsession.setAttribute("editar", usu); // Modificamos la session pasando el objeto al JSp setAttribute

        response.sendRedirect("EditarUsuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomreuser = request.getParameter("usernamee");
        String password = request.getParameter("contraa");
        String rol = request.getParameter("roll");

        Usuario userupdate = (Usuario) request.getSession().getAttribute("editar");
        userupdate.setNom_Usuario(nomreuser);
        userupdate.setPassword(password);
        userupdate.setRol(rol);
        control.actualizaUser(userupdate);

        response.sendRedirect("SV_Usuario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
