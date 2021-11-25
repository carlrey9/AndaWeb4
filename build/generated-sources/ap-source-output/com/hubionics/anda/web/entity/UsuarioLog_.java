package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-25T10:53:51")
@StaticMetamodel(UsuarioLog.class)
public class UsuarioLog_ { 

    public static volatile SingularAttribute<UsuarioLog, Date> dateEventoUsuarioLog;
    public static volatile SingularAttribute<UsuarioLog, String> conceptoUsuarioLog;
    public static volatile SingularAttribute<UsuarioLog, Usuario> idUsuarioFk;
    public static volatile SingularAttribute<UsuarioLog, Integer> idUsuarioLog;

}