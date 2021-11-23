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
@Table(name = "Metricas_anda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metricasanda.findAll", query = "SELECT m FROM Metricasanda m"),
    @NamedQuery(name = "Metricasanda.findByIdMetricasanda", query = "SELECT m FROM Metricasanda m WHERE m.idMetricasanda = :idMetricasanda"),
    @NamedQuery(name = "Metricasanda.findByDescripcionMetrica", query = "SELECT m FROM Metricasanda m WHERE m.descripcionMetrica = :descripcionMetrica"),
    @NamedQuery(name = "Metricasanda.findByFechaMetrica", query = "SELECT m FROM Metricasanda m WHERE m.fechaMetrica = :fechaMetrica"),
    @NamedQuery(name = "Metricasanda.findByTipoMetrica", query = "SELECT m FROM Metricasanda m WHERE m.tipoMetrica = :tipoMetrica")})
public class Metricasanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMetricas_anda")
    private Integer idMetricasanda;
    @Size(max = 150)
    @Column(name = "descripcion_metrica")
    private String descripcionMetrica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_metrica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMetrica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_metrica")
    private int tipoMetrica;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Metricasanda() {
    }

    public Metricasanda(Integer idMetricasanda) {
        this.idMetricasanda = idMetricasanda;
    }

    public Metricasanda(Integer idMetricasanda, Date fechaMetrica, int tipoMetrica) {
        this.idMetricasanda = idMetricasanda;
        this.fechaMetrica = fechaMetrica;
        this.tipoMetrica = tipoMetrica;
    }

    public Integer getIdMetricasanda() {
        return idMetricasanda;
    }

    public void setIdMetricasanda(Integer idMetricasanda) {
        this.idMetricasanda = idMetricasanda;
    }

    public String getDescripcionMetrica() {
        return descripcionMetrica;
    }

    public void setDescripcionMetrica(String descripcionMetrica) {
        this.descripcionMetrica = descripcionMetrica;
    }

    public Date getFechaMetrica() {
        return fechaMetrica;
    }

    public void setFechaMetrica(Date fechaMetrica) {
        this.fechaMetrica = fechaMetrica;
    }

    public int getTipoMetrica() {
        return tipoMetrica;
    }

    public void setTipoMetrica(int tipoMetrica) {
        this.tipoMetrica = tipoMetrica;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMetricasanda != null ? idMetricasanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metricasanda)) {
            return false;
        }
        Metricasanda other = (Metricasanda) object;
        if ((this.idMetricasanda == null && other.idMetricasanda != null) || (this.idMetricasanda != null && !this.idMetricasanda.equals(other.idMetricasanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.Metricasanda[ idMetricasanda=" + idMetricasanda + " ]";
    }
    
}
