package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.AutorSonido;
import com.hubionics.anda.web.entity.KeyVault;
import com.hubionics.anda.web.entity.PaqueteSonido;
import com.hubionics.anda.web.entity.SubCategoriaSonido;
import com.hubionics.anda.web.entity.TempoSonido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T16:19:47")
@StaticMetamodel(Sonido.class)
public class Sonido_ { 

    public static volatile SingularAttribute<Sonido, Integer> idSonido;
    public static volatile SingularAttribute<Sonido, String> nombreArchivo;
    public static volatile SingularAttribute<Sonido, String> descSonido;
    public static volatile SingularAttribute<Sonido, TempoSonido> idTempoSonido;
    public static volatile SingularAttribute<Sonido, KeyVault> secretKey;
    public static volatile SingularAttribute<Sonido, SubCategoriaSonido> idSubcategoria;
    public static volatile SingularAttribute<Sonido, String> urlIcono;
    public static volatile ListAttribute<Sonido, PaqueteSonido> paqueteSonidoList;
    public static volatile SingularAttribute<Sonido, Date> fechaCreacionSonido;
    public static volatile SingularAttribute<Sonido, String> urlIconoInactivo;
    public static volatile SingularAttribute<Sonido, AutorSonido> idAutorSonido;
    public static volatile SingularAttribute<Sonido, String> urlSonido;

}