/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author parko
 */
@Entity
public class Paciente extends Persona implements Serializable {

    private boolean tiene_OS;
    private String tipoSangre;
    @OneToOne
    private Responable unResponsable;
    @OneToMany(mappedBy = "M_pacien")
    private List<Turno> listaTurno;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSangre, Responable unResponsable, List<Turno> listaTurno, int id_persona, String dni, String nombre, String apellido, String telefono, String direcion, Date fech_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direcion, fech_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public Responable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

}
