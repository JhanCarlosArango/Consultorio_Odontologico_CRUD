/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author parko
 */
@Entity
public class Odontologo extends Persona implements Serializable {

    private String especialidad;
    // creo la relacio de un a uno
    @OneToMany(mappedBy = "M_odonto") // para configurar la relacion hacia turno que se relaciona con la variable llamada M_odonto;
    private List<Turno> listaTurno;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    @JoinColumn(name = "id_Horario", unique = true)
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(int id_odontologo, String especialidad, List<Turno> listaTurno, Usuario unUsuario, Horario unHorario, int id_persona, String dni, String nombre, String apellido, String telefono, String direcion, Date fech_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direcion, fech_nac);

        this.especialidad = especialidad;
        this.listaTurno = listaTurno;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

    
}
