package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T17:14:45")
@StaticMetamodel(Metricasanda.class)
public class Metricasanda_ { 

    public static volatile SingularAttribute<Metricasanda, Usuario> idUsuario;
    public static volatile SingularAttribute<Metricasanda, Integer> tipoMetrica;
    public static volatile SingularAttribute<Metricasanda, Integer> idMetricasanda;
    public static volatile SingularAttribute<Metricasanda, Date> fechaMetrica;
    public static volatile SingularAttribute<Metricasanda, String> descripcionMetrica;

}