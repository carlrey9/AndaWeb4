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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "codigos_activacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigosActivacion.findAll", query = "SELECT c FROM CodigosActivacion c"),
    @NamedQuery(name = "CodigosActivacion.findByIdCodigosActivacion", query = "SELECT c FROM CodigosActivacion c WHERE c.idCodigosActivacion = :idCodigosActivacion"),
    @NamedQuery(name = "CodigosActivacion.findByCodigoIsRedeemed", query = "SELECT c FROM CodigosActivacion c WHERE c.codigoIsRedeemed = :codigoIsRedeemed"),
    @NamedQuery(name = "CodigosActivacion.findByCodigoActivacion", query = "SELECT c FROM CodigosActivacion c WHERE c.codigoActivacion = :codigoActivacion"),
    @NamedQuery(name = "CodigosActivacion.findByFechaActivacion", query = "SELECT c FROM CodigosActivacion c WHERE c.fechaActivacion = :fechaActivacion")})
public class CodigosActivacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_codigos_activacion")
    private Integer idCodigosActivacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_is_redeemed")
    private int codigoIsRedeemed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigo_activacion")
    private String codigoActivacion;
    @Column(name = "fecha_activacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActivacion;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne(optional = false)
    private Paquete idPaquete;

    public CodigosActivacion() {
    }

    public CodigosActivacion(Integer idCodigosActivacion) {
        this.idCodigosActivacion = idCodigosActivacion;
    }

    public CodigosActivacion(Integer idCodigosActivacion, int codigoIsRedeemed, String codigoActivacion) {
        this.idCodigosActivacion = idCodigosActivacion;
        this.codigoIsRedeemed = codigoIsRedeemed;
        this.codigoActivacion = codigoActivacion;
    }

    public Integer getIdCodigosActivacion() {
        return idCodigosActivacion;
    }

    public void setIdCodigosActivacion(Integer idCodigosActivacion) {
        this.idCodigosActivacion = idCodigosActivacion;
    }

    public int getCodigoIsRedeemed() {
        return codigoIsRedeemed;
    }

    public void setCodigoIsRedeemed(int codigoIsRedeemed) {
        this.codigoIsRedeemed = codigoIsRedeemed;
    }

    public String getCodigoActivacion() {
        return codigoActivacion;
    }

    public void setCodigoActivacion(String codigoActivacion) {
        this.codigoActivacion = codigoActivacion;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCodigosActivacion != null ? idCodigosActivacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodigosActivacion)) {
            return false;
        }
        CodigosActivacion other = (CodigosActivacion) object;
        if ((this.idCodigosActivacion == null && other.idCodigosActivacion != null) || (this.idCodigosActivacion != null && !this.idCodigosActivacion.equals(other.idCodigosActivacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.CodigosActivacion[ idCodigosActivacion=" + idCodigosActivacion + " ]";
    }
    
}
