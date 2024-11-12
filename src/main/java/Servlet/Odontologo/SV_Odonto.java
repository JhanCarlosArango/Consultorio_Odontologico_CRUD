package Servlet.Odontologo;

import Logica.Controladora;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
@WebServlet(name = "SV_Odonto", urlPatterns = {"/SV_Odonto"})
public class SV_Odonto extends HttpServlet {

    Controladora controlO = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Odontologo> odonto = new ArrayList();
        odonto = controlO.traerOdonto();
        
        HttpSession actual = request.getSession();
        actual.setAttribute("Odonto", odonto);
        response.sendRedirect("VerOdonto.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        Date fechanas = null;
        String fechaNasString = request.getParameter("fechanas");

        if (fechaNasString != null && !fechaNasString.isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try {
                fechanas = dateFormat.parse(fechaNasString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {

        }
        String especialidad = request.getParameter("especialidad");
        controlO.creatOdonto(dni, nombre, apellido, telefono, direccion, fechanas, especialidad);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
