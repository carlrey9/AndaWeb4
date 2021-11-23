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
@Table(name = "categoria_sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaSonido.findAll", query = "SELECT c FROM CategoriaSonido c"),
    @NamedQuery(name = "CategoriaSonido.findByIdCategoriaSonido", query = "SELECT c FROM CategoriaSonido c WHERE c.idCategoriaSonido = :idCategoriaSonido"),
    @NamedQuery(name = "CategoriaSonido.findByDescCategoriaSonido", query = "SELECT c FROM CategoriaSonido c WHERE c.descCategoriaSonido = :descCategoriaSonido")})
public class CategoriaSonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_categoria_sonido")
    private Integer idCategoriaSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "desc_categoria_sonido")
    private String descCategoriaSonido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoriaSonido")
    private List<SubCategoriaSonido> subCategoriaSonidoList;

    public CategoriaSonido() {
    }

    public CategoriaSonido(Integer idCategoriaSonido) {
        this.idCategoriaSonido = idCategoriaSonido;
    }

    public CategoriaSonido(Integer idCategoriaSonido, String descCategoriaSonido) {
        this.idCategoriaSonido = idCategoriaSonido;
        this.descCategoriaSonido = descCategoriaSonido;
    }

    public Integer getIdCategoriaSonido() {
        return idCategoriaSonido;
    }

    public void setIdCategoriaSonido(Integer idCategoriaSonido) {
        this.idCategoriaSonido = idCategoriaSonido;
    }

    public String getDescCategoriaSonido() {
        return descCategoriaSonido;
    }

    public void setDescCategoriaSonido(String descCategoriaSonido) {
        this.descCategoriaSonido = descCategoriaSonido;
    }

    @XmlTransient
    public List<SubCategoriaSonido> getSubCategoriaSonidoList() {
        return subCategoriaSonidoList;
    }

    public void setSubCategoriaSonidoList(List<SubCategoriaSonido> subCategoriaSonidoList) {
        this.subCategoriaSonidoList = subCategoriaSonidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaSonido != null ? idCategoriaSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaSonido)) {
            return false;
        }
        CategoriaSonido other = (CategoriaSonido) object;
        if ((this.idCategoriaSonido == null && other.idCategoriaSonido != null) || (this.idCategoriaSonido != null && !this.idCategoriaSonido.equals(other.idCategoriaSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.CategoriaSonido[ idCategoriaSonido=" + idCategoriaSonido + " ]";
    }
    
}
