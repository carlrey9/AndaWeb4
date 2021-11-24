package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.Invoice;
import com.hubionics.anda.web.entity.Paquete;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T17:14:45")
@StaticMetamodel(InvoicePaquete.class)
public class InvoicePaquete_ { 

    public static volatile SingularAttribute<InvoicePaquete, Long> precioPaquete;
    public static volatile SingularAttribute<InvoicePaquete, Invoice> idInvoice;
    public static volatile SingularAttribute<InvoicePaquete, Paquete> idPaquete;
    public static volatile SingularAttribute<InvoicePaquete, Integer> idInvoicePaquete;
    public static volatile SingularAttribute<InvoicePaquete, Integer> vigenciaPaquete;

}