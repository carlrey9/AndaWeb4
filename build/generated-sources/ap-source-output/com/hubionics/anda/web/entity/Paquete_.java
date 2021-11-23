package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.CodigosActivacion;
import com.hubionics.anda.web.entity.InvoicePaquete;
import com.hubionics.anda.web.entity.PaqueteSonido;
import com.hubionics.anda.web.entity.UsuarioPaquete;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-22T17:35:07")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile SingularAttribute<Paquete, String> urlImgPaquete;
    public static volatile ListAttribute<Paquete, InvoicePaquete> invoicePaqueteList;
    public static volatile ListAttribute<Paquete, UsuarioPaquete> usuarioPaqueteList;
    public static volatile SingularAttribute<Paquete, Integer> idPaquete;
    public static volatile SingularAttribute<Paquete, Date> fechaCreacionPaquete;
    public static volatile SingularAttribute<Paquete, Integer> paqueteActivo;
    public static volatile ListAttribute<Paquete, PaqueteSonido> paqueteSonidoList;
    public static volatile SingularAttribute<Paquete, Long> precioPaquete;
    public static volatile ListAttribute<Paquete, CodigosActivacion> codigosActivacionList;
    public static volatile SingularAttribute<Paquete, Integer> puntosPaquete;
    public static volatile SingularAttribute<Paquete, String> descPaquete;
    public static volatile SingularAttribute<Paquete, Integer> vigenciaPaquete;
    public static volatile SingularAttribute<Paquete, String> tituloPaquete;
    public static volatile SingularAttribute<Paquete, String> urlPagoPaquete;
    public static volatile SingularAttribute<Paquete, String> idinappPurchasegoogle;

}