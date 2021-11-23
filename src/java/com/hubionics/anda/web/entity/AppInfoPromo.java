/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "appInfoPromo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AppInfoPromo.findAll", query = "SELECT a FROM AppInfoPromo a"),
    @NamedQuery(name = "AppInfoPromo.findByIdappInfoPromo", query = "SELECT a FROM AppInfoPromo a WHERE a.idappInfoPromo = :idappInfoPromo"),
    @NamedQuery(name = "AppInfoPromo.findByDescInfoPromo", query = "SELECT a FROM AppInfoPromo a WHERE a.descInfoPromo = :descInfoPromo"),
    @NamedQuery(name = "AppInfoPromo.findByPromoActiva", query = "SELECT a FROM AppInfoPromo a WHERE a.promoActiva = :promoActiva"),
    @NamedQuery(name = "AppInfoPromo.findByFechaInicio", query = "SELECT a FROM AppInfoPromo a WHERE a.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "AppInfoPromo.findByFechaFin", query = "SELECT a FROM AppInfoPromo a WHERE a.fechaFin = :fechaFin")})
public class AppInfoPromo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idappInfoPromo")
    private Integer idappInfoPromo;
    @Size(max = 200)
    @Column(name = "descInfoPromo")
    private String descInfoPromo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "promo_activa")
    private int promoActiva;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    public AppInfoPromo() {
    }

    public AppInfoPromo(Integer idappInfoPromo) {
        this.idappInfoPromo = idappInfoPromo;
    }

    public AppInfoPromo(Integer idappInfoPromo, int promoActiva) {
        this.idappInfoPromo = idappInfoPromo;
        this.promoActiva = promoActiva;
    }

    public Integer getIdappInfoPromo() {
        return idappInfoPromo;
    }

    public void setIdappInfoPromo(Integer idappInfoPromo) {
        this.idappInfoPromo = idappInfoPromo;
    }

    public String getDescInfoPromo() {
        return descInfoPromo;
    }

    public void setDescInfoPromo(String descInfoPromo) {
        this.descInfoPromo = descInfoPromo;
    }

    public int getPromoActiva() {
        return promoActiva;
    }

    public void setPromoActiva(int promoActiva) {
        this.promoActiva = promoActiva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idappInfoPromo != null ? idappInfoPromo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppInfoPromo)) {
            return false;
        }
        AppInfoPromo other = (AppInfoPromo) object;
        if ((this.idappInfoPromo == null && other.idappInfoPromo != null) || (this.idappInfoPromo != null && !this.idappInfoPromo.equals(other.idappInfoPromo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.AppInfoPromo[ idappInfoPromo=" + idappInfoPromo + " ]";
    }
    
}
