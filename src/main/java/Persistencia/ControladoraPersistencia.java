/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Odontologo;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parko
 */
public class ControladoraPersistencia {

    PersonaJpaController perJPA = new PersonaJpaController();
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    SecretarioJpaController secreteJPA = new SecretarioJpaController();
    UsuarioJpaController usuJPa = new UsuarioJpaController();
    PacienteJpaController pacienJPA = new PacienteJpaController();
    ResponableJpaController resJPA = new ResponableJpaController();
    TurnoJpaController turJPa = new TurnoJpaController();
    HorarioJpaController HorarioJPA = new HorarioJpaController();

    public ControladoraPersistencia() {
    }

    public void crearUsuario_JPA(Usuario usu) {
        usuJPa.create(usu);
    }

    public List<Usuario> listareUsuarios_JPA() {
        return usuJPa.findUsuarioEntities();
    }

    public void eliminarUser_JPA(int id) {
        try {
            usuJPa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUser(int id) {
        return usuJPa.findUsuario(id);
    }

    public void actualizarUser_JPA(Usuario usu) {
        try {
            usuJPa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearOdonto(Odontologo odont) {
        odontoJPA.create(odont);
    }

    public List<Odontologo> traerodonto_JPa() {
        return odontoJPA.findOdontologoEntities();
    }

    public void eliminarOdonto_JPA(int id) {
        try {
            odontoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo buscarodonto_JPA(int id) {
        return odontoJPA.findOdontologo(id);
    }

    public void actualizarOdonto_JPA(Odontologo odontoupdate) {
        try {
            odontoJPA.edit(odontoupdate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
