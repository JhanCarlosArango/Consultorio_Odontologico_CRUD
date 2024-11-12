package Logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author parko
 */
@Entity
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Horario;
    private String horario_ini;
    private String horario_fin;

    @OneToOne(mappedBy = "unHorario", cascade = CascadeType.ALL) // Variable unHorario de la clase odontologo; CascadeType.ALL: Esta parte se utiliza para definir cómo las operaciones de persistencia (como insertar, actualizar o eliminar) deben propagarse desde la entidad 
    private Odontologo odontoh;

    public Horario() {
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public String getHorario_ini() {
        return horario_ini;
    }

    public void setHorario_ini(String horario_ini) {
        this.horario_ini = horario_ini;
    }

    public String getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(String horario_fin) {
        this.horario_fin = horario_fin;
    }

}
