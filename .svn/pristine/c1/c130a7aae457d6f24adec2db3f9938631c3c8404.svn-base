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
@Table(name = "anda_requirements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AndaRequirements.findAll", query = "SELECT a FROM AndaRequirements a"),
    @NamedQuery(name = "AndaRequirements.findByIdandaRequirements", query = "SELECT a FROM AndaRequirements a WHERE a.idandaRequirements = :idandaRequirements"),
    @NamedQuery(name = "AndaRequirements.findByDescripcionRequirement", query = "SELECT a FROM AndaRequirements a WHERE a.descripcionRequirement = :descripcionRequirement"),
    @NamedQuery(name = "AndaRequirements.findByFechaRequirement", query = "SELECT a FROM AndaRequirements a WHERE a.fechaRequirement = :fechaRequirement"),
    @NamedQuery(name = "AndaRequirements.findByEstadoRequirement", query = "SELECT a FROM AndaRequirements a WHERE a.estadoRequirement = :estadoRequirement"),
    @NamedQuery(name = "AndaRequirements.findByFechaUpdateRequirement", query = "SELECT a FROM AndaRequirements a WHERE a.fechaUpdateRequirement = :fechaUpdateRequirement"),
    @NamedQuery(name = "AndaRequirements.findByDescripcionRespuestaRequirement", query = "SELECT a FROM AndaRequirements a WHERE a.descripcionRespuestaRequirement = :descripcionRespuestaRequirement")})
public class AndaRequirements implements Serializable {

    @Size(max = 45)
    @Column(name = "anda_requirementscol")
    private String andaRequirementscol;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idanda_requirements")
    private Integer idandaRequirements;
    @Size(max = 500)
    @Column(name = "descripcion_requirement")
    private String descripcionRequirement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_requirement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRequirement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_requirement")
    private int estadoRequirement;
    @Column(name = "fecha_update_requirement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdateRequirement;
    @Size(max = 500)
    @Column(name = "descripcion_respuesta_requirement")
    private String descripcionRespuestaRequirement;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public AndaRequirements() {
    }

    public AndaRequirements(Integer idandaRequirements) {
        this.idandaRequirements = idandaRequirements;
    }

    public AndaRequirements(Integer idandaRequirements, Date fechaRequirement, int estadoRequirement) {
        this.idandaRequirements = idandaRequirements;
        this.fechaRequirement = fechaRequirement;
        this.estadoRequirement = estadoRequirement;
    }

    public Integer getIdandaRequirements() {
        return idandaRequirements;
    }

    public void setIdandaRequirements(Integer idandaRequirements) {
        this.idandaRequirements = idandaRequirements;
    }

    public String getDescripcionRequirement() {
        return descripcionRequirement;
    }

    public void setDescripcionRequirement(String descripcionRequirement) {
        this.descripcionRequirement = descripcionRequirement;
    }

    public Date getFechaRequirement() {
        return fechaRequirement;
    }

    public void setFechaRequirement(Date fechaRequirement) {
        this.fechaRequirement = fechaRequirement;
    }

    public int getEstadoRequirement() {
        return estadoRequirement;
    }

    public void setEstadoRequirement(int estadoRequirement) {
        this.estadoRequirement = estadoRequirement;
    }

    public Date getFechaUpdateRequirement() {
        return fechaUpdateRequirement;
    }

    public void setFechaUpdateRequirement(Date fechaUpdateRequirement) {
        this.fechaUpdateRequirement = fechaUpdateRequirement;
    }

    public String getDescripcionRespuestaRequirement() {
        return descripcionRespuestaRequirement;
    }

    public void setDescripcionRespuestaRequirement(String descripcionRespuestaRequirement) {
        this.descripcionRespuestaRequirement = descripcionRespuestaRequirement;
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
        hash += (idandaRequirements != null ? idandaRequirements.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AndaRequirements)) {
            return false;
        }
        AndaRequirements other = (AndaRequirements) object;
        if ((this.idandaRequirements == null && other.idandaRequirements != null) || (this.idandaRequirements != null && !this.idandaRequirements.equals(other.idandaRequirements))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.AndaRequirements[ idandaRequirements=" + idandaRequirements + " ]";
    }

    public String getAndaRequirementscol() {
        return andaRequirementscol;
    }

    public void setAndaRequirementscol(String andaRequirementscol) {
        this.andaRequirementscol = andaRequirementscol;
    }
    
}
