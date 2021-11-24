package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Paquete;
import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T16:19:47")
@StaticMetamodel(UsuarioPaquete.class)
public class UsuarioPaquete_ { 

    public static volatile SingularAttribute<UsuarioPaquete, Usuario> idUsuario;
    public static volatile SingularAttribute<UsuarioPaquete, Paquete> idPaquete;
    public static volatile SingularAttribute<UsuarioPaquete, Integer> vigenciaPaquete;
    public static volatile SingularAttribute<UsuarioPaquete, Integer> idUsuarioPaquete;
    public static volatile SingularAttribute<UsuarioPaquete, Date> ultimoPago;

}