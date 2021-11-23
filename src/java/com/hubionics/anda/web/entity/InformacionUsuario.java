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
@Table(name = "informacion_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionUsuario.findAll", query = "SELECT i FROM InformacionUsuario i"),
    @NamedQuery(name = "InformacionUsuario.findByIdInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.idInfoUsuario = :idInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByNombresInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.nombresInfoUsuario = :nombresInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByApellidosInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.apellidosInfoUsuario = :apellidosInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByDireccionInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.direccionInfoUsuario = :direccionInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByCiudadInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.ciudadInfoUsuario = :ciudadInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByDptoInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.dptoInfoUsuario = :dptoInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByPaisInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.paisInfoUsuario = :paisInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByTelefonoInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.telefonoInfoUsuario = :telefonoInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByGeneroInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.generoInfoUsuario = :generoInfoUsuario"),
    @NamedQuery(name = "InformacionUsuario.findByFechaNacInfoUsuario", query = "SELECT i FROM InformacionUsuario i WHERE i.fechaNacInfoUsuario = :fechaNacInfoUsuario")})
public class InformacionUsuario implements Serializable {

    @Column(name = "estatura_info_usuario")
    private Integer estaturaInfoUsuario;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_info_usuario")
    private Integer idInfoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombres_info_usuario")
    private String nombresInfoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "apellidos_info_usuario")
    private String apellidosInfoUsuario;
    @Size(max = 70)
    @Column(name = "direccion_info_usuario")
    private String direccionInfoUsuario;
    @Size(max = 40)
    @Column(name = "ciudad_info_usuario")
    private String ciudadInfoUsuario;
    @Size(max = 40)
    @Column(name = "dpto_info_usuario")
    private String dptoInfoUsuario;
    @Size(max = 40)
    @Column(name = "pais_info_usuario")
    private String paisInfoUsuario;
    @Size(max = 24)
    @Column(name = "telefono_info_usuario")
    private String telefonoInfoUsuario;
    @Column(name = "genero_info_usuario")
    private Integer generoInfoUsuario;
    @Column(name = "fecha_nac_info_usuario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacInfoUsuario;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public InformacionUsuario() {
    }

    public InformacionUsuario(Integer idInfoUsuario) {
        this.idInfoUsuario = idInfoUsuario;
    }

    public InformacionUsuario(Integer idInfoUsuario, String nombresInfoUsuario, String apellidosInfoUsuario) {
        this.idInfoUsuario = idInfoUsuario;
        this.nombresInfoUsuario = nombresInfoUsuario;
        this.apellidosInfoUsuario = apellidosInfoUsuario;
    }

    public Integer getIdInfoUsuario() {
        return idInfoUsuario;
    }

    public void setIdInfoUsuario(Integer idInfoUsuario) {
        this.idInfoUsuario = idInfoUsuario;
    }

    public String getNombresInfoUsuario() {
        return nombresInfoUsuario;
    }

    public void setNombresInfoUsuario(String nombresInfoUsuario) {
        this.nombresInfoUsuario = nombresInfoUsuario;
    }

    public String getApellidosInfoUsuario() {
        return apellidosInfoUsuario;
    }

    public void setApellidosInfoUsuario(String apellidosInfoUsuario) {
        this.apellidosInfoUsuario = apellidosInfoUsuario;
    }

    public String getDireccionInfoUsuario() {
        return direccionInfoUsuario;
    }

    public void setDireccionInfoUsuario(String direccionInfoUsuario) {
        this.direccionInfoUsuario = direccionInfoUsuario;
    }

    public String getCiudadInfoUsuario() {
        return ciudadInfoUsuario;
    }

    public void setCiudadInfoUsuario(String ciudadInfoUsuario) {
        this.ciudadInfoUsuario = ciudadInfoUsuario;
    }

    public String getDptoInfoUsuario() {
        return dptoInfoUsuario;
    }

    public void setDptoInfoUsuario(String dptoInfoUsuario) {
        this.dptoInfoUsuario = dptoInfoUsuario;
    }

    public String getPaisInfoUsuario() {
        return paisInfoUsuario;
    }

    public void setPaisInfoUsuario(String paisInfoUsuario) {
        this.paisInfoUsuario = paisInfoUsuario;
    }

    public String getTelefonoInfoUsuario() {
        return telefonoInfoUsuario;
    }

    public void setTelefonoInfoUsuario(String telefonoInfoUsuario) {
        this.telefonoInfoUsuario = telefonoInfoUsuario;
    }

    public Integer getGeneroInfoUsuario() {
        return generoInfoUsuario;
    }

    public void setGeneroInfoUsuario(Integer generoInfoUsuario) {
        this.generoInfoUsuario = generoInfoUsuario;
    }

    public Date getFechaNacInfoUsuario() {
        return fechaNacInfoUsuario;
    }

    public void setFechaNacInfoUsuario(Date fechaNacInfoUsuario) {
        this.fechaNacInfoUsuario = fechaNacInfoUsuario;
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
        hash += (idInfoUsuario != null ? idInfoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionUsuario)) {
            return false;
        }
        InformacionUsuario other = (InformacionUsuario) object;
        if ((this.idInfoUsuario == null && other.idInfoUsuario != null) || (this.idInfoUsuario != null && !this.idInfoUsuario.equals(other.idInfoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.InformacionUsuario[ idInfoUsuario=" + idInfoUsuario + " ]";
    }

    public Integer getEstaturaInfoUsuario() {
        return estaturaInfoUsuario;
    }

    public void setEstaturaInfoUsuario(Integer estaturaInfoUsuario) {
        this.estaturaInfoUsuario = estaturaInfoUsuario;
    }
    
}
