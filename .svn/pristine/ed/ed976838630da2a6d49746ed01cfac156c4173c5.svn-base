/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "tempo_sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TempoSonido.findAll", query = "SELECT t FROM TempoSonido t"),
    @NamedQuery(name = "TempoSonido.findByIdTempoSonido", query = "SELECT t FROM TempoSonido t WHERE t.idTempoSonido = :idTempoSonido"),
    @NamedQuery(name = "TempoSonido.findByTheTempoSonido", query = "SELECT t FROM TempoSonido t WHERE t.theTempoSonido = :theTempoSonido"),
    @NamedQuery(name = "TempoSonido.findByUrlIconoTempoSonido", query = "SELECT t FROM TempoSonido t WHERE t.urlIconoTempoSonido = :urlIconoTempoSonido")})
public class TempoSonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tempo_sonido")
    private Integer idTempoSonido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "the_tempo_sonido")
    private int theTempoSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "url_icono_tempo_sonido")
    private String urlIconoTempoSonido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTempoSonido")
    private List<Sonido> sonidoList;

    public TempoSonido() {
    }

    public TempoSonido(Integer idTempoSonido) {
        this.idTempoSonido = idTempoSonido;
    }

    public TempoSonido(Integer idTempoSonido, int theTempoSonido, String urlIconoTempoSonido) {
        this.idTempoSonido = idTempoSonido;
        this.theTempoSonido = theTempoSonido;
        this.urlIconoTempoSonido = urlIconoTempoSonido;
    }

    public Integer getIdTempoSonido() {
        return idTempoSonido;
    }

    public void setIdTempoSonido(Integer idTempoSonido) {
        this.idTempoSonido = idTempoSonido;
    }

    public int getTheTempoSonido() {
        return theTempoSonido;
    }

    public void setTheTempoSonido(int theTempoSonido) {
        this.theTempoSonido = theTempoSonido;
    }

    public String getUrlIconoTempoSonido() {
        return urlIconoTempoSonido;
    }

    public void setUrlIconoTempoSonido(String urlIconoTempoSonido) {
        this.urlIconoTempoSonido = urlIconoTempoSonido;
    }

    @XmlTransient
    public List<Sonido> getSonidoList() {
        return sonidoList;
    }

    public void setSonidoList(List<Sonido> sonidoList) {
        this.sonidoList = sonidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTempoSonido != null ? idTempoSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TempoSonido)) {
            return false;
        }
        TempoSonido other = (TempoSonido) object;
        if ((this.idTempoSonido == null && other.idTempoSonido != null) || (this.idTempoSonido != null && !this.idTempoSonido.equals(other.idTempoSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.TempoSonido[ idTempoSonido=" + idTempoSonido + " ]";
    }
    
}
