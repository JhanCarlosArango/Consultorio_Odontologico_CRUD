/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author parko
 */
@Entity
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Turno;
    private String hora_turno;
    @Temporal(TemporalType.DATE)
    private Date fech_Turno;
    private String Afeccio;
    @ManyToOne
    @JoinColumn(name = "fk_odonto")
    private Odontologo M_odonto;

    @ManyToOne
    @JoinColumn(name = "fk_pacien")
    private Paciente M_pacien;

    public Turno() {
    }

    public Turno(int id_Turno, String hora_turno, Date fech_Turno, String Afeccio) {
        this.id_Turno = id_Turno;
        this.hora_turno = hora_turno;
        this.fech_Turno = fech_Turno;
        this.Afeccio = Afeccio;
    }

    public String getAfeccio() {
        return Afeccio;
    }

    public void setAfeccio(String Afeccio) {
        this.Afeccio = Afeccio;
    }

    public int getId_Turno() {
        return id_Turno;
    }

    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public Date getFech_Turno() {
        return fech_Turno;
    }

    public void setFech_Turno(Date fech_Turno) {
        this.fech_Turno = fech_Turno;
    }

}
