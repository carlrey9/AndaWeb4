package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Sonido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T14:18:56")
@StaticMetamodel(KeyVault.class)
public class KeyVault_ { 

    public static volatile SingularAttribute<KeyVault, Integer> idKeyVault;
    public static volatile SingularAttribute<KeyVault, String> secretKey;
    public static volatile ListAttribute<KeyVault, Sonido> sonidoList;

}