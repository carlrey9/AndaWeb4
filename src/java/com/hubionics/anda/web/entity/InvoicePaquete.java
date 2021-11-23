/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "invoice_paquete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvoicePaquete.findAll", query = "SELECT i FROM InvoicePaquete i"),
    @NamedQuery(name = "InvoicePaquete.findByIdInvoicePaquete", query = "SELECT i FROM InvoicePaquete i WHERE i.idInvoicePaquete = :idInvoicePaquete"),
    @NamedQuery(name = "InvoicePaquete.findByPrecioPaquete", query = "SELECT i FROM InvoicePaquete i WHERE i.precioPaquete = :precioPaquete"),
    @NamedQuery(name = "InvoicePaquete.findByVigenciaPaquete", query = "SELECT i FROM InvoicePaquete i WHERE i.vigenciaPaquete = :vigenciaPaquete")})
public class InvoicePaquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_invoice_paquete")
    private Integer idInvoicePaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_paquete")
    private long precioPaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vigencia_paquete")
    private int vigenciaPaquete;
    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne(optional = false)
    private Paquete idPaquete;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id_invoice")
    @ManyToOne(optional = false)
    private Invoice idInvoice;

    public InvoicePaquete() {
    }

    public InvoicePaquete(Integer idInvoicePaquete) {
        this.idInvoicePaquete = idInvoicePaquete;
    }

    public InvoicePaquete(Integer idInvoicePaquete, long precioPaquete, int vigenciaPaquete) {
        this.idInvoicePaquete = idInvoicePaquete;
        this.precioPaquete = precioPaquete;
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Integer getIdInvoicePaquete() {
        return idInvoicePaquete;
    }

    public void setIdInvoicePaquete(Integer idInvoicePaquete) {
        this.idInvoicePaquete = idInvoicePaquete;
    }

    public long getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(long precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    public int getVigenciaPaquete() {
        return vigenciaPaquete;
    }

    public void setVigenciaPaquete(int vigenciaPaquete) {
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Invoice getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Invoice idInvoice) {
        this.idInvoice = idInvoice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvoicePaquete != null ? idInvoicePaquete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoicePaquete)) {
            return false;
        }
        InvoicePaquete other = (InvoicePaquete) object;
        if ((this.idInvoicePaquete == null && other.idInvoicePaquete != null) || (this.idInvoicePaquete != null && !this.idInvoicePaquete.equals(other.idInvoicePaquete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.InvoicePaquete[ idInvoicePaquete=" + idInvoicePaquete + " ]";
    }
    
}
