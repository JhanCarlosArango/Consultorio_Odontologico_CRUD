/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author parko
 */
@Entity
public class Responable extends Persona {

    private String tipoRes;

    public Responable() {
    }

    public Responable(String tipoRes, int id_persona, String dni, String nombre, String apellido, String telefono, String direcion, Date fech_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direcion, fech_nac);

        this.tipoRes = tipoRes;
    }

    public String getTipoRes() {
        return tipoRes;
    }

    public void setTipoRes(String tipoRes) {
        this.tipoRes = tipoRes;
    }

}
