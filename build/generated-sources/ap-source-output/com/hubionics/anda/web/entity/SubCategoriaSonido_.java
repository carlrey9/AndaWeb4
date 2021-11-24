package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.CategoriaSonido;
import com.hubionics.anda.web.entity.Sonido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T17:14:45")
@StaticMetamodel(SubCategoriaSonido.class)
public class SubCategoriaSonido_ { 

    public static volatile SingularAttribute<SubCategoriaSonido, String> urlIconSubCategoriaSonido;
    public static volatile SingularAttribute<SubCategoriaSonido, String> descSubCategoriaSonido;
    public static volatile SingularAttribute<SubCategoriaSonido, CategoriaSonido> idCategoriaSonido;
    public static volatile ListAttribute<SubCategoriaSonido, Sonido> sonidoList;
    public static volatile SingularAttribute<SubCategoriaSonido, Integer> idSubCategoriaSonido;

}