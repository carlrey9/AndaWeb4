package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Paquete;
import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-22T17:35:07")
@StaticMetamodel(CodigosActivacion.class)
public class CodigosActivacion_ { 

    public static volatile SingularAttribute<CodigosActivacion, String> codigoActivacion;
    public static volatile SingularAttribute<CodigosActivacion, Usuario> idUsuario;
    public static volatile SingularAttribute<CodigosActivacion, Paquete> idPaquete;
    public static volatile SingularAttribute<CodigosActivacion, Integer> idCodigosActivacion;
    public static volatile SingularAttribute<CodigosActivacion, Integer> codigoIsRedeemed;
    public static volatile SingularAttribute<CodigosActivacion, Date> fechaActivacion;

}