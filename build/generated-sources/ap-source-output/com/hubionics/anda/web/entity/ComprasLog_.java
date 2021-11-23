package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-22T17:35:07")
@StaticMetamodel(ComprasLog.class)
public class ComprasLog_ { 

    public static volatile SingularAttribute<ComprasLog, Date> fechaComprasLog;
    public static volatile SingularAttribute<ComprasLog, Usuario> idUsuario;
    public static volatile SingularAttribute<ComprasLog, String> descripcionComprasLog;
    public static volatile SingularAttribute<ComprasLog, Integer> idcomprasLog;

}