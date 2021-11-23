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
@Table(name = "key_vault")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KeyVault.findAll", query = "SELECT k FROM KeyVault k"),
    @NamedQuery(name = "KeyVault.findByIdKeyVault", query = "SELECT k FROM KeyVault k WHERE k.idKeyVault = :idKeyVault"),
    @NamedQuery(name = "KeyVault.findBySecretKey", query = "SELECT k FROM KeyVault k WHERE k.secretKey = :secretKey")})
public class KeyVault implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_key_vault")
    private Integer idKeyVault;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "secret_key")
    private String secretKey;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secretKey")
    private List<Sonido> sonidoList;

    public KeyVault() {
    }

    public KeyVault(Integer idKeyVault) {
        this.idKeyVault = idKeyVault;
    }

    public KeyVault(Integer idKeyVault, String secretKey) {
        this.idKeyVault = idKeyVault;
        this.secretKey = secretKey;
    }

    public Integer getIdKeyVault() {
        return idKeyVault;
    }

    public void setIdKeyVault(Integer idKeyVault) {
        this.idKeyVault = idKeyVault;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
        hash += (idKeyVault != null ? idKeyVault.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeyVault)) {
            return false;
        }
        KeyVault other = (KeyVault) object;
        if ((this.idKeyVault == null && other.idKeyVault != null) || (this.idKeyVault != null && !this.idKeyVault.equals(other.idKeyVault))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.KeyVault[ idKeyVault=" + idKeyVault + " ]";
    }
    
}
