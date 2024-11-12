package Logica;

import Logica.Odontologo;
import Logica.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-30T18:55:51")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Integer> id_Turno;
    public static volatile SingularAttribute<Turno, String> hora_turno;
    public static volatile SingularAttribute<Turno, Date> fech_Turno;
    public static volatile SingularAttribute<Turno, String> Afeccio;
    public static volatile SingularAttribute<Turno, Odontologo> M_odonto;
    public static volatile SingularAttribute<Turno, Paciente> M_pacien;

}