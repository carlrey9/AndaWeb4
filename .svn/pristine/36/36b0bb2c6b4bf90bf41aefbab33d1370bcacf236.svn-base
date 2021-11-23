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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "usuario_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioLog.findAll", query = "SELECT u FROM UsuarioLog u"),
    @NamedQuery(name = "UsuarioLog.findByIdUsuarioLog", query = "SELECT u FROM UsuarioLog u WHERE u.idUsuarioLog = :idUsuarioLog"),
    @NamedQuery(name = "UsuarioLog.findByConceptoUsuarioLog", query = "SELECT u FROM UsuarioLog u WHERE u.conceptoUsuarioLog = :conceptoUsuarioLog"),
    @NamedQuery(name = "UsuarioLog.findByDateEventoUsuarioLog", query = "SELECT u FROM UsuarioLog u WHERE u.dateEventoUsuarioLog = :dateEventoUsuarioLog")})
public class UsuarioLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_log")
    private Integer idUsuarioLog;
    @Size(max = 45)
    @Column(name = "concepto_usuario_log")
    private String conceptoUsuarioLog;
    @Column(name = "date_evento_usuario_log")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEventoUsuarioLog;
    @JoinColumn(name = "id_usuario_fk", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuarioFk;

    public UsuarioLog() {
    }

    public UsuarioLog(Integer idUsuarioLog) {
        this.idUsuarioLog = idUsuarioLog;
    }

    public Integer getIdUsuarioLog() {
        return idUsuarioLog;
    }

    public void setIdUsuarioLog(Integer idUsuarioLog) {
        this.idUsuarioLog = idUsuarioLog;
    }

    public String getConceptoUsuarioLog() {
        return conceptoUsuarioLog;
    }

    public void setConceptoUsuarioLog(String conceptoUsuarioLog) {
        this.conceptoUsuarioLog = conceptoUsuarioLog;
    }

    public Date getDateEventoUsuarioLog() {
        return dateEventoUsuarioLog;
    }

    public void setDateEventoUsuarioLog(Date dateEventoUsuarioLog) {
        this.dateEventoUsuarioLog = dateEventoUsuarioLog;
    }

    public Usuario getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Usuario idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioLog != null ? idUsuarioLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioLog)) {
            return false;
        }
        UsuarioLog other = (UsuarioLog) object;
        if ((this.idUsuarioLog == null && other.idUsuarioLog != null) || (this.idUsuarioLog != null && !this.idUsuarioLog.equals(other.idUsuarioLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.UsuarioLog[ idUsuarioLog=" + idUsuarioLog + " ]";
    }
    
}
