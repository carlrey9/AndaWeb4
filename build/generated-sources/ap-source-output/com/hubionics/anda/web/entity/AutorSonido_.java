package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Sonido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T14:16:14")
@StaticMetamodel(AutorSonido.class)
public class AutorSonido_ { 

    public static volatile SingularAttribute<AutorSonido, String> nombreAutor;
    public static volatile SingularAttribute<AutorSonido, Integer> idAutorSonido;
    public static volatile ListAttribute<AutorSonido, Sonido> sonidoList;

}