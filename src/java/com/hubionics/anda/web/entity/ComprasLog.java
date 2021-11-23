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
@Table(name = "compras_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComprasLog.findAll", query = "SELECT c FROM ComprasLog c"),
    @NamedQuery(name = "ComprasLog.findByIdcomprasLog", query = "SELECT c FROM ComprasLog c WHERE c.idcomprasLog = :idcomprasLog"),
    @NamedQuery(name = "ComprasLog.findByDescripcionComprasLog", query = "SELECT c FROM ComprasLog c WHERE c.descripcionComprasLog = :descripcionComprasLog"),
    @NamedQuery(name = "ComprasLog.findByFechaComprasLog", query = "SELECT c FROM ComprasLog c WHERE c.fechaComprasLog = :fechaComprasLog")})
public class ComprasLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcompras_log")
    private Integer idcomprasLog;
    @Size(max = 100)
    @Column(name = "descripcion_compras_log")
    private String descripcionComprasLog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_compras_log")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComprasLog;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public ComprasLog() {
    }

    public ComprasLog(Integer idcomprasLog) {
        this.idcomprasLog = idcomprasLog;
    }

    public ComprasLog(Integer idcomprasLog, Date fechaComprasLog) {
        this.idcomprasLog = idcomprasLog;
        this.fechaComprasLog = fechaComprasLog;
    }

    public Integer getIdcomprasLog() {
        return idcomprasLog;
    }

    public void setIdcomprasLog(Integer idcomprasLog) {
        this.idcomprasLog = idcomprasLog;
    }

    public String getDescripcionComprasLog() {
        return descripcionComprasLog;
    }

    public void setDescripcionComprasLog(String descripcionComprasLog) {
        this.descripcionComprasLog = descripcionComprasLog;
    }

    public Date getFechaComprasLog() {
        return fechaComprasLog;
    }

    public void setFechaComprasLog(Date fechaComprasLog) {
        this.fechaComprasLog = fechaComprasLog;
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
        hash += (idcomprasLog != null ? idcomprasLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasLog)) {
            return false;
        }
        ComprasLog other = (ComprasLog) object;
        if ((this.idcomprasLog == null && other.idcomprasLog != null) || (this.idcomprasLog != null && !this.idcomprasLog.equals(other.idcomprasLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.ComprasLog[ idcomprasLog=" + idcomprasLog + " ]";
    }
    
}
