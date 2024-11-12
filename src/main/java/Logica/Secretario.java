/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author parko private int oid_secretario; private String sector; private
 * Usuario unUsuario;
 */
@Entity
public class Secretario extends Persona {

    private String sector;
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, int id_persona, String dni, String nombre, String apellido, String telefono, String direcion, Date fech_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direcion, fech_nac);

        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

}
