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
@Table(name = "paquete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paquete.findAll", query = "SELECT p FROM Paquete p"),
    @NamedQuery(name = "Paquete.findByIdPaquete", query = "SELECT p FROM Paquete p WHERE p.idPaquete = :idPaquete"),
    @NamedQuery(name = "Paquete.findByTituloPaquete", query = "SELECT p FROM Paquete p WHERE p.tituloPaquete = :tituloPaquete"),
    @NamedQuery(name = "Paquete.findByDescPaquete", query = "SELECT p FROM Paquete p WHERE p.descPaquete = :descPaquete"),
    @NamedQuery(name = "Paquete.findByPrecioPaquete", query = "SELECT p FROM Paquete p WHERE p.precioPaquete = :precioPaquete"),
    @NamedQuery(name = "Paquete.findByPuntosPaquete", query = "SELECT p FROM Paquete p WHERE p.puntosPaquete = :puntosPaquete"),
    @NamedQuery(name = "Paquete.findByVigenciaPaquete", query = "SELECT p FROM Paquete p WHERE p.vigenciaPaquete = :vigenciaPaquete"),
    @NamedQuery(name = "Paquete.findByFechaCreacionPaquete", query = "SELECT p FROM Paquete p WHERE p.fechaCreacionPaquete = :fechaCreacionPaquete"),
    @NamedQuery(name = "Paquete.findByUrlImgPaquete", query = "SELECT p FROM Paquete p WHERE p.urlImgPaquete = :urlImgPaquete"),
    @NamedQuery(name = "Paquete.findByUrlPagoPaquete", query = "SELECT p FROM Paquete p WHERE p.urlPagoPaquete = :urlPagoPaquete"),
    @NamedQuery(name = "Paquete.findByPaqueteActivo", query = "SELECT p FROM Paquete p WHERE p.paqueteActivo = :paqueteActivo"),
    @NamedQuery(name = "Paquete.findByIdinappPurchasegoogle", query = "SELECT p FROM Paquete p WHERE p.idinappPurchasegoogle = :idinappPurchasegoogle")})
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paquete")
    private Integer idPaquete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo_paquete")
    private String tituloPaquete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "desc_paquete")
    private String descPaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_paquete")
    private long precioPaquete;
    @Column(name = "puntos_paquete")
    private Integer puntosPaquete;
    @Column(name = "vigencia_paquete")
    private Integer vigenciaPaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion_paquete")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionPaquete;
    @Size(max = 250)
    @Column(name = "url_img_paquete")
    private String urlImgPaquete;
    @Size(max = 250)
    @Column(name = "url_pago_paquete")
    private String urlPagoPaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "paquete_activo")
    private int paqueteActivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "id_inappPurchase_google")
    private String idinappPurchasegoogle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaquete")
    private List<InvoicePaquete> invoicePaqueteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaquete")
    private List<UsuarioPaquete> usuarioPaqueteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaquete")
    private List<CodigosActivacion> codigosActivacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaquete")
    private List<PaqueteSonido> paqueteSonidoList;

    public Paquete() {
    }

    public Paquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Paquete(Integer idPaquete, String tituloPaquete, String descPaquete, long precioPaquete, Date fechaCreacionPaquete, int paqueteActivo, String idinappPurchasegoogle) {
        this.idPaquete = idPaquete;
        this.tituloPaquete = tituloPaquete;
        this.descPaquete = descPaquete;
        this.precioPaquete = precioPaquete;
        this.fechaCreacionPaquete = fechaCreacionPaquete;
        this.paqueteActivo = paqueteActivo;
        this.idinappPurchasegoogle = idinappPurchasegoogle;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getTituloPaquete() {
        return tituloPaquete;
    }

    public void setTituloPaquete(String tituloPaquete) {
        this.tituloPaquete = tituloPaquete;
    }

    public String getDescPaquete() {
        return descPaquete;
    }

    public void setDescPaquete(String descPaquete) {
        this.descPaquete = descPaquete;
    }

    public long getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(long precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    public Integer getPuntosPaquete() {
        return puntosPaquete;
    }

    public void setPuntosPaquete(Integer puntosPaquete) {
        this.puntosPaquete = puntosPaquete;
    }

    public Integer getVigenciaPaquete() {
        return vigenciaPaquete;
    }

    public void setVigenciaPaquete(Integer vigenciaPaquete) {
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Date getFechaCreacionPaquete() {
        return fechaCreacionPaquete;
    }

    public void setFechaCreacionPaquete(Date fechaCreacionPaquete) {
        this.fechaCreacionPaquete = fechaCreacionPaquete;
    }

    public String getUrlImgPaquete() {
        return urlImgPaquete;
    }

    public void setUrlImgPaquete(String urlImgPaquete) {
        this.urlImgPaquete = urlImgPaquete;
    }

    public String getUrlPagoPaquete() {
        return urlPagoPaquete;
    }

    public void setUrlPagoPaquete(String urlPagoPaquete) {
        this.urlPagoPaquete = urlPagoPaquete;
    }

    public int getPaqueteActivo() {
        return paqueteActivo;
    }

    public void setPaqueteActivo(int paqueteActivo) {
        this.paqueteActivo = paqueteActivo;
    }

    public String getIdinappPurchasegoogle() {
        return idinappPurchasegoogle;
    }

    public void setIdinappPurchasegoogle(String idinappPurchasegoogle) {
        this.idinappPurchasegoogle = idinappPurchasegoogle;
    }

    @XmlTransient
    public List<InvoicePaquete> getInvoicePaqueteList() {
        return invoicePaqueteList;
    }

    public void setInvoicePaqueteList(List<InvoicePaquete> invoicePaqueteList) {
        this.invoicePaqueteList = invoicePaqueteList;
    }

    @XmlTransient
    public List<UsuarioPaquete> getUsuarioPaqueteList() {
        return usuarioPaqueteList;
    }

    public void setUsuarioPaqueteList(List<UsuarioPaquete> usuarioPaqueteList) {
        this.usuarioPaqueteList = usuarioPaqueteList;
    }

    @XmlTransient
    public List<CodigosActivacion> getCodigosActivacionList() {
        return codigosActivacionList;
    }

    public void setCodigosActivacionList(List<CodigosActivacion> codigosActivacionList) {
        this.codigosActivacionList = codigosActivacionList;
    }

    @XmlTransient
    public List<PaqueteSonido> getPaqueteSonidoList() {
        return paqueteSonidoList;
    }

    public void setPaqueteSonidoList(List<PaqueteSonido> paqueteSonidoList) {
        this.paqueteSonidoList = paqueteSonidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaquete != null ? idPaquete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquete)) {
            return false;
        }
        Paquete other = (Paquete) object;
        if ((this.idPaquete == null && other.idPaquete != null) || (this.idPaquete != null && !this.idPaquete.equals(other.idPaquete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.Paquete[ idPaquete=" + idPaquete + " ]";
    }
    
}
