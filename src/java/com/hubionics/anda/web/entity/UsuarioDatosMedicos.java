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
@Table(name = "usuario_datos_medicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioDatosMedicos.findAll", query = "SELECT u FROM UsuarioDatosMedicos u"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByIdusuarioDatosMedicos", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.idusuarioDatosMedicos = :idusuarioDatosMedicos"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByFechaDato", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.fechaDato = :fechaDato"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByImcDato", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.imcDato = :imcDato"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByPesoDato", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.pesoDato = :pesoDato"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByCircunferenciaPantorrillaDato", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.circunferenciaPantorrillaDato = :circunferenciaPantorrillaDato"),
    @NamedQuery(name = "UsuarioDatosMedicos.findByPerimetroMusloDato", query = "SELECT u FROM UsuarioDatosMedicos u WHERE u.perimetroMusloDato = :perimetroMusloDato")})
public class UsuarioDatosMedicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario_datos_medicos")
    private Integer idusuarioDatosMedicos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_dato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "imc_dato")
    private Double imcDato;
    @Column(name = "peso_dato")
    private Double pesoDato;
    @Column(name = "circunferencia_pantorrilla_dato")
    private Integer circunferenciaPantorrillaDato;
    @Column(name = "perimetro_muslo_dato")
    private Integer perimetroMusloDato;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public UsuarioDatosMedicos() {
    }

    public UsuarioDatosMedicos(Integer idusuarioDatosMedicos) {
        this.idusuarioDatosMedicos = idusuarioDatosMedicos;
    }

    public UsuarioDatosMedicos(Integer idusuarioDatosMedicos, Date fechaDato) {
        this.idusuarioDatosMedicos = idusuarioDatosMedicos;
        this.fechaDato = fechaDato;
    }

    public Integer getIdusuarioDatosMedicos() {
        return idusuarioDatosMedicos;
    }

    public void setIdusuarioDatosMedicos(Integer idusuarioDatosMedicos) {
        this.idusuarioDatosMedicos = idusuarioDatosMedicos;
    }

    public Date getFechaDato() {
        return fechaDato;
    }

    public void setFechaDato(Date fechaDato) {
        this.fechaDato = fechaDato;
    }

    public Double getImcDato() {
        return imcDato;
    }

    public void setImcDato(Double imcDato) {
        this.imcDato = imcDato;
    }

    public Double getPesoDato() {
        return pesoDato;
    }

    public void setPesoDato(Double pesoDato) {
        this.pesoDato = pesoDato;
    }

    public Integer getCircunferenciaPantorrillaDato() {
        return circunferenciaPantorrillaDato;
    }

    public void setCircunferenciaPantorrillaDato(Integer circunferenciaPantorrillaDato) {
        this.circunferenciaPantorrillaDato = circunferenciaPantorrillaDato;
    }

    public Integer getPerimetroMusloDato() {
        return perimetroMusloDato;
    }

    public void setPerimetroMusloDato(Integer perimetroMusloDato) {
        this.perimetroMusloDato = perimetroMusloDato;
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
        hash += (idusuarioDatosMedicos != null ? idusuarioDatosMedicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDatosMedicos)) {
            return false;
        }
        UsuarioDatosMedicos other = (UsuarioDatosMedicos) object;
        if ((this.idusuarioDatosMedicos == null && other.idusuarioDatosMedicos != null) || (this.idusuarioDatosMedicos != null && !this.idusuarioDatosMedicos.equals(other.idusuarioDatosMedicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.UsuarioDatosMedicos[ idusuarioDatosMedicos=" + idusuarioDatosMedicos + " ]";
    }
    
}
