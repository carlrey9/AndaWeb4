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
@Table(name = "autor_sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutorSonido.findAll", query = "SELECT a FROM AutorSonido a"),
    @NamedQuery(name = "AutorSonido.findByIdAutorSonido", query = "SELECT a FROM AutorSonido a WHERE a.idAutorSonido = :idAutorSonido"),
    @NamedQuery(name = "AutorSonido.findByNombreAutor", query = "SELECT a FROM AutorSonido a WHERE a.nombreAutor = :nombreAutor")})
public class AutorSonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_autor_sonido")
    private Integer idAutorSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_autor")
    private String nombreAutor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutorSonido")
    private List<Sonido> sonidoList;

    public AutorSonido() {
    }

    public AutorSonido(Integer idAutorSonido) {
        this.idAutorSonido = idAutorSonido;
    }

    public AutorSonido(Integer idAutorSonido, String nombreAutor) {
        this.idAutorSonido = idAutorSonido;
        this.nombreAutor = nombreAutor;
    }

    public Integer getIdAutorSonido() {
        return idAutorSonido;
    }

    public void setIdAutorSonido(Integer idAutorSonido) {
        this.idAutorSonido = idAutorSonido;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
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
        hash += (idAutorSonido != null ? idAutorSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutorSonido)) {
            return false;
        }
        AutorSonido other = (AutorSonido) object;
        if ((this.idAutorSonido == null && other.idAutorSonido != null) || (this.idAutorSonido != null && !this.idAutorSonido.equals(other.idAutorSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.AutorSonido[ idAutorSonido=" + idAutorSonido + " ]";
    }
    
}
