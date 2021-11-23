/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "invoice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i"),
    @NamedQuery(name = "Invoice.findByIdInvoice", query = "SELECT i FROM Invoice i WHERE i.idInvoice = :idInvoice"),
    @NamedQuery(name = "Invoice.findByFechaRealizadoInvoice", query = "SELECT i FROM Invoice i WHERE i.fechaRealizadoInvoice = :fechaRealizadoInvoice"),
    @NamedQuery(name = "Invoice.findByTotalInvoice", query = "SELECT i FROM Invoice i WHERE i.totalInvoice = :totalInvoice"),
    @NamedQuery(name = "Invoice.findByGoogleOrderId", query = "SELECT i FROM Invoice i WHERE i.googleOrderId = :googleOrderId"),
    @NamedQuery(name = "Invoice.findByEstadoCompra", query = "SELECT i FROM Invoice i WHERE i.estadoCompra = :estadoCompra")})
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_invoice")
    private Integer idInvoice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_realizado_invoice")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRealizadoInvoice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_invoice")
    private long totalInvoice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "google_order_id")
    private String googleOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_compra")
    private int estadoCompra;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInvoice")
    private List<InvoicePaquete> invoicePaqueteList;

    public Invoice() {
    }

    public Invoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Invoice(Integer idInvoice, Date fechaRealizadoInvoice, long totalInvoice, String googleOrderId, int estadoCompra) {
        this.idInvoice = idInvoice;
        this.fechaRealizadoInvoice = fechaRealizadoInvoice;
        this.totalInvoice = totalInvoice;
        this.googleOrderId = googleOrderId;
        this.estadoCompra = estadoCompra;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Date getFechaRealizadoInvoice() {
        return fechaRealizadoInvoice;
    }

    public void setFechaRealizadoInvoice(Date fechaRealizadoInvoice) {
        this.fechaRealizadoInvoice = fechaRealizadoInvoice;
    }

    public long getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(long totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public String getGoogleOrderId() {
        return googleOrderId;
    }

    public void setGoogleOrderId(String googleOrderId) {
        this.googleOrderId = googleOrderId;
    }

    public int getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(int estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<InvoicePaquete> getInvoicePaqueteList() {
        return invoicePaqueteList;
    }

    public void setInvoicePaqueteList(List<InvoicePaquete> invoicePaqueteList) {
        this.invoicePaqueteList = invoicePaqueteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvoice != null ? idInvoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.idInvoice == null && other.idInvoice != null) || (this.idInvoice != null && !this.idInvoice.equals(other.idInvoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.Invoice[ idInvoice=" + idInvoice + " ]";
    }
    
}
