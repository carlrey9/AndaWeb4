package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.InvoicePaquete;
import com.hubionics.anda.web.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T10:00:34")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Integer> estadoCompra;
    public static volatile SingularAttribute<Invoice, Long> totalInvoice;
    public static volatile ListAttribute<Invoice, InvoicePaquete> invoicePaqueteList;
    public static volatile SingularAttribute<Invoice, Integer> idInvoice;
    public static volatile SingularAttribute<Invoice, Usuario> idUsuario;
    public static volatile SingularAttribute<Invoice, Date> fechaRealizadoInvoice;
    public static volatile SingularAttribute<Invoice, String> googleOrderId;

}