package Servlet.Odontologo;

import Logica.Controladora;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "SV_EditarO", urlPatterns = {"/SV_Editar"})
public class SV_EditarO extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Odontologo odont = control.buscarodonto(id);

        HttpSession actual = request.getSession();
        actual.setAttribute("odonto", odont);

        response.sendRedirect("EditarOdonto.jsp");
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

        Odontologo odontoupdate = (Odontologo) request.getSession().getAttribute("odonto"); // es mejor volver a traer el objeto de la session 
        // que instanciar un nuevo objeto de tupo odontologo
        odontoupdate.setDni(dni);
        odontoupdate.setNombre(nombre);
        odontoupdate.setApellido(apellido);
        odontoupdate.setTelefono(telefono);
        odontoupdate.setDirecion(direccion);
        odontoupdate.setFech_nac(fechanas);
        odontoupdate.setEspecialidad(especialidad);
        control.actualozarodonto(odontoupdate);
        response.sendRedirect("SV_Odonto");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
