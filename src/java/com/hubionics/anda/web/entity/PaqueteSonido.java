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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "paquete_sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaqueteSonido.findAll", query = "SELECT p FROM PaqueteSonido p"),
    @NamedQuery(name = "PaqueteSonido.findByIdPaqueteSonido", query = "SELECT p FROM PaqueteSonido p WHERE p.idPaqueteSonido = :idPaqueteSonido")})
public class PaqueteSonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paquete_sonido")
    private Integer idPaqueteSonido;
    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne(optional = false)
    private Paquete idPaquete;
    @JoinColumn(name = "id_sonido", referencedColumnName = "id_sonido")
    @ManyToOne(optional = false)
    private Sonido idSonido;

    public PaqueteSonido() {
    }

    public PaqueteSonido(Integer idPaqueteSonido) {
        this.idPaqueteSonido = idPaqueteSonido;
    }

    public Integer getIdPaqueteSonido() {
        return idPaqueteSonido;
    }

    public void setIdPaqueteSonido(Integer idPaqueteSonido) {
        this.idPaqueteSonido = idPaqueteSonido;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Sonido getIdSonido() {
        return idSonido;
    }

    public void setIdSonido(Sonido idSonido) {
        this.idSonido = idSonido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaqueteSonido != null ? idPaqueteSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaqueteSonido)) {
            return false;
        }
        PaqueteSonido other = (PaqueteSonido) object;
        if ((this.idPaqueteSonido == null && other.idPaqueteSonido != null) || (this.idPaqueteSonido != null && !this.idPaqueteSonido.equals(other.idPaqueteSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.PaqueteSonido[ idPaqueteSonido=" + idPaqueteSonido + " ]";
    }
    
}
