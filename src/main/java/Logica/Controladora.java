package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author parko
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Controladora() {
    }

    public void crearUsuario(String nameUser, String contra, String rol) {

        Usuario usu = new Usuario();
        usu.setNom_Usuario(nameUser);
        usu.setPassword(contra);
        usu.setRol(rol);

        controlPersis.crearUsuario_JPA(usu);
    }

    public List<Usuario> listarUsuario() {
        return controlPersis.listareUsuarios_JPA();
    }

    public void eliminarUser(int id) {
        controlPersis.eliminarUser_JPA(id);
    }

    public Usuario buscarUser(int id) {
        return controlPersis.traerUser(id);
    }

    public void actualizaUser(Usuario userupdate) {
        controlPersis.actualizarUser_JPA(userupdate);
    }

    public void creatOdonto(String dni, String nombre, String apellido, String telefono, String direccion, Date fechanas, String especialidad) {
        Odontologo odont = new Odontologo();

        odont.setDni(dni);
        odont.setNombre(nombre);
        odont.setApellido(apellido);
        odont.setTelefono(telefono);
        odont.setDirecion(direccion);
        odont.setFech_nac(fechanas);
        odont.setEspecialidad(especialidad);

        controlPersis.crearOdonto(odont);
    }

    public List<Odontologo> traerOdonto() {
        return controlPersis.traerodonto_JPa();
    }

    public void eliminarOdonto(int id) {
        controlPersis.eliminarOdonto_JPA(id);
    }

    public Odontologo buscarodonto(int id) {
        return controlPersis.buscarodonto_JPA(id);
    }

    public void actualozarodonto(Odontologo odontoupdate) {
        controlPersis.actualizarOdonto_JPA(odontoupdate);
    }

    public boolean validarUser(String user, String pass) {

        boolean vali = false;
        List<Usuario> listauser = new ArrayList<Usuario>();
        listauser = controlPersis.listareUsuarios_JPA();
        for (Usuario usuario : listauser) {
            if (usuario.getNom_Usuario().equals(user)) {
                if (usuario.getPassword().equals(pass)) {
                    vali = true;
                }
            }
        }
        return vali;
    }

}
