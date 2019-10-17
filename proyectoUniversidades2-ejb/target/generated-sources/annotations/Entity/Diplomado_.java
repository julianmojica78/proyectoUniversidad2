package Entity;

import Entity.Estudiante;
import Entity.Universidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-16T18:39:30")
@StaticMetamodel(Diplomado.class)
public class Diplomado_ { 

    public static volatile SingularAttribute<Diplomado, String> descripcion;
    public static volatile ListAttribute<Diplomado, Estudiante> listaEstudiantes;
    public static volatile SingularAttribute<Diplomado, Date> fechaInicio;
    public static volatile SingularAttribute<Diplomado, Universidad> universidad;
    public static volatile SingularAttribute<Diplomado, Integer> id;
    public static volatile SingularAttribute<Diplomado, String> nombre;
    public static volatile SingularAttribute<Diplomado, Date> fechaFin;

}