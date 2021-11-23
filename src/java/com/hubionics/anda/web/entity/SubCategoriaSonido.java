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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "sub_categoria_sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategoriaSonido.findAll", query = "SELECT s FROM SubCategoriaSonido s"),
    @NamedQuery(name = "SubCategoriaSonido.findByIdSubCategoriaSonido", query = "SELECT s FROM SubCategoriaSonido s WHERE s.idSubCategoriaSonido = :idSubCategoriaSonido"),
    @NamedQuery(name = "SubCategoriaSonido.findByDescSubCategoriaSonido", query = "SELECT s FROM SubCategoriaSonido s WHERE s.descSubCategoriaSonido = :descSubCategoriaSonido"),
    @NamedQuery(name = "SubCategoriaSonido.findByUrlIconSubCategoriaSonido", query = "SELECT s FROM SubCategoriaSonido s WHERE s.urlIconSubCategoriaSonido = :urlIconSubCategoriaSonido")})
public class SubCategoriaSonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sub_categoria_sonido")
    private Integer idSubCategoriaSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "desc_sub_categoria_sonido")
    private String descSubCategoriaSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "url_icon_sub_categoria_sonido")
    private String urlIconSubCategoriaSonido;
    @JoinColumn(name = "id_categoria_sonido", referencedColumnName = "id_categoria_sonido")
    @ManyToOne(optional = false)
    private CategoriaSonido idCategoriaSonido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubcategoria")
    private List<Sonido> sonidoList;

    public SubCategoriaSonido() {
    }

    public SubCategoriaSonido(Integer idSubCategoriaSonido) {
        this.idSubCategoriaSonido = idSubCategoriaSonido;
    }

    public SubCategoriaSonido(Integer idSubCategoriaSonido, String descSubCategoriaSonido, String urlIconSubCategoriaSonido) {
        this.idSubCategoriaSonido = idSubCategoriaSonido;
        this.descSubCategoriaSonido = descSubCategoriaSonido;
        this.urlIconSubCategoriaSonido = urlIconSubCategoriaSonido;
    }

    public Integer getIdSubCategoriaSonido() {
        return idSubCategoriaSonido;
    }

    public void setIdSubCategoriaSonido(Integer idSubCategoriaSonido) {
        this.idSubCategoriaSonido = idSubCategoriaSonido;
    }

    public String getDescSubCategoriaSonido() {
        return descSubCategoriaSonido;
    }

    public void setDescSubCategoriaSonido(String descSubCategoriaSonido) {
        this.descSubCategoriaSonido = descSubCategoriaSonido;
    }

    public String getUrlIconSubCategoriaSonido() {
        return urlIconSubCategoriaSonido;
    }

    public void setUrlIconSubCategoriaSonido(String urlIconSubCategoriaSonido) {
        this.urlIconSubCategoriaSonido = urlIconSubCategoriaSonido;
    }

    public CategoriaSonido getIdCategoriaSonido() {
        return idCategoriaSonido;
    }

    public void setIdCategoriaSonido(CategoriaSonido idCategoriaSonido) {
        this.idCategoriaSonido = idCategoriaSonido;
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
        hash += (idSubCategoriaSonido != null ? idSubCategoriaSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategoriaSonido)) {
            return false;
        }
        SubCategoriaSonido other = (SubCategoriaSonido) object;
        if ((this.idSubCategoriaSonido == null && other.idSubCategoriaSonido != null) || (this.idSubCategoriaSonido != null && !this.idSubCategoriaSonido.equals(other.idSubCategoriaSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.SubCategoriaSonido[ idSubCategoriaSonido=" + idSubCategoriaSonido + " ]";
    }
    
}
