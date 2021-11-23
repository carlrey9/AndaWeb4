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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "usuario_paquete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioPaquete.findAll", query = "SELECT u FROM UsuarioPaquete u"),
    @NamedQuery(name = "UsuarioPaquete.findByIdUsuarioPaquete", query = "SELECT u FROM UsuarioPaquete u WHERE u.idUsuarioPaquete = :idUsuarioPaquete"),
    @NamedQuery(name = "UsuarioPaquete.findByVigenciaPaquete", query = "SELECT u FROM UsuarioPaquete u WHERE u.vigenciaPaquete = :vigenciaPaquete"),
    @NamedQuery(name = "UsuarioPaquete.findByUltimoPago", query = "SELECT u FROM UsuarioPaquete u WHERE u.ultimoPago = :ultimoPago")})
public class UsuarioPaquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_paquete")
    private Integer idUsuarioPaquete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vigencia_paquete")
    private int vigenciaPaquete;
    @Column(name = "ultimo_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoPago;
    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne(optional = false)
    private Paquete idPaquete;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public UsuarioPaquete() {
    }

    public UsuarioPaquete(Integer idUsuarioPaquete) {
        this.idUsuarioPaquete = idUsuarioPaquete;
    }

    public UsuarioPaquete(Integer idUsuarioPaquete, int vigenciaPaquete) {
        this.idUsuarioPaquete = idUsuarioPaquete;
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Integer getIdUsuarioPaquete() {
        return idUsuarioPaquete;
    }

    public void setIdUsuarioPaquete(Integer idUsuarioPaquete) {
        this.idUsuarioPaquete = idUsuarioPaquete;
    }

    public int getVigenciaPaquete() {
        return vigenciaPaquete;
    }

    public void setVigenciaPaquete(int vigenciaPaquete) {
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Date getUltimoPago() {
        return ultimoPago;
    }

    public void setUltimoPago(Date ultimoPago) {
        this.ultimoPago = ultimoPago;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
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
        hash += (idUsuarioPaquete != null ? idUsuarioPaquete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPaquete)) {
            return false;
        }
        UsuarioPaquete other = (UsuarioPaquete) object;
        if ((this.idUsuarioPaquete == null && other.idUsuarioPaquete != null) || (this.idUsuarioPaquete != null && !this.idUsuarioPaquete.equals(other.idUsuarioPaquete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.UsuarioPaquete[ idUsuarioPaquete=" + idUsuarioPaquete + " ]";
    }
    
}
