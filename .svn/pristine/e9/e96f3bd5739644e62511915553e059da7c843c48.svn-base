/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "sonido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sonido.findAll", query = "SELECT s FROM Sonido s"),
    @NamedQuery(name = "Sonido.findByIdSonido", query = "SELECT s FROM Sonido s WHERE s.idSonido = :idSonido"),
    @NamedQuery(name = "Sonido.findByUrlSonido", query = "SELECT s FROM Sonido s WHERE s.urlSonido = :urlSonido"),
    @NamedQuery(name = "Sonido.findByUrlIcono", query = "SELECT s FROM Sonido s WHERE s.urlIcono = :urlIcono"),
    @NamedQuery(name = "Sonido.findByNombreArchivo", query = "SELECT s FROM Sonido s WHERE s.nombreArchivo = :nombreArchivo"),
    @NamedQuery(name = "Sonido.findByDescSonido", query = "SELECT s FROM Sonido s WHERE s.descSonido = :descSonido"),
    @NamedQuery(name = "Sonido.findByFechaCreacionSonido", query = "SELECT s FROM Sonido s WHERE s.fechaCreacionSonido = :fechaCreacionSonido"),
    @NamedQuery(name = "Sonido.findByUrlIconoInactivo", query = "SELECT s FROM Sonido s WHERE s.urlIconoInactivo = :urlIconoInactivo")})
public class Sonido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sonido")
    private Integer idSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "url_sonido")
    private String urlSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "url_icono")
    private String urlIcono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_archivo")
    private String nombreArchivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "desc_sonido")
    private String descSonido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion_sonido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "url_icono_inactivo")
    private String urlIconoInactivo;
    @JoinColumn(name = "id_subcategoria", referencedColumnName = "id_sub_categoria_sonido")
    @ManyToOne(optional = false)
    private SubCategoriaSonido idSubcategoria;
    @JoinColumn(name = "id_tempo_sonido", referencedColumnName = "id_tempo_sonido")
    @ManyToOne(optional = false)
    private TempoSonido idTempoSonido;
    @JoinColumn(name = "id_autor_sonido", referencedColumnName = "id_autor_sonido")
    @ManyToOne(optional = false)
    private AutorSonido idAutorSonido;
    @JoinColumn(name = "secret_key", referencedColumnName = "id_key_vault")
    @ManyToOne(optional = false)
    private KeyVault secretKey;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSonido")
    private List<PaqueteSonido> paqueteSonidoList;

    public Sonido() {
    }

    public Sonido(Integer idSonido) {
        this.idSonido = idSonido;
    }

    public Sonido(Integer idSonido, String urlSonido, String urlIcono, String nombreArchivo, String descSonido, Date fechaCreacionSonido, String urlIconoInactivo) {
        this.idSonido = idSonido;
        this.urlSonido = urlSonido;
        this.urlIcono = urlIcono;
        this.nombreArchivo = nombreArchivo;
        this.descSonido = descSonido;
        this.fechaCreacionSonido = fechaCreacionSonido;
        this.urlIconoInactivo = urlIconoInactivo;
    }

    public Integer getIdSonido() {
        return idSonido;
    }

    public void setIdSonido(Integer idSonido) {
        this.idSonido = idSonido;
    }

    public String getUrlSonido() {
        return urlSonido;
    }

    public void setUrlSonido(String urlSonido) {
        this.urlSonido = urlSonido;
    }

    public String getUrlIcono() {
        return urlIcono;
    }

    public void setUrlIcono(String urlIcono) {
        this.urlIcono = urlIcono;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getDescSonido() {
        return descSonido;
    }

    public void setDescSonido(String descSonido) {
        this.descSonido = descSonido;
    }

    public Date getFechaCreacionSonido() {
        return fechaCreacionSonido;
    }

    public void setFechaCreacionSonido(Date fechaCreacionSonido) {
        this.fechaCreacionSonido = fechaCreacionSonido;
    }

    public String getUrlIconoInactivo() {
        return urlIconoInactivo;
    }

    public void setUrlIconoInactivo(String urlIconoInactivo) {
        this.urlIconoInactivo = urlIconoInactivo;
    }

    public SubCategoriaSonido getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(SubCategoriaSonido idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public TempoSonido getIdTempoSonido() {
        return idTempoSonido;
    }

    public void setIdTempoSonido(TempoSonido idTempoSonido) {
        this.idTempoSonido = idTempoSonido;
    }

    public AutorSonido getIdAutorSonido() {
        return idAutorSonido;
    }

    public void setIdAutorSonido(AutorSonido idAutorSonido) {
        this.idAutorSonido = idAutorSonido;
    }

    public KeyVault getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(KeyVault secretKey) {
        this.secretKey = secretKey;
    }

    @XmlTransient
    public List<PaqueteSonido> getPaqueteSonidoList() {
        return paqueteSonidoList;
    }

    public void setPaqueteSonidoList(List<PaqueteSonido> paqueteSonidoList) {
        this.paqueteSonidoList = paqueteSonidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSonido != null ? idSonido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sonido)) {
            return false;
        }
        Sonido other = (Sonido) object;
        if ((this.idSonido == null && other.idSonido != null) || (this.idSonido != null && !this.idSonido.equals(other.idSonido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.Sonido[ idSonido=" + idSonido + " ]";
    }
    
}
