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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hubio
 */
@Entity
@Table(name = "appdata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appdata.findAll", query = "SELECT a FROM Appdata a"),
    @NamedQuery(name = "Appdata.findByIdappData", query = "SELECT a FROM Appdata a WHERE a.idappData = :idappData"),
    @NamedQuery(name = "Appdata.findByVersionappData", query = "SELECT a FROM Appdata a WHERE a.versionappData = :versionappData"),
    @NamedQuery(name = "Appdata.findByVersionappDataDev", query = "SELECT a FROM Appdata a WHERE a.versionappDataDev = :versionappDataDev"),
    @NamedQuery(name = "Appdata.findByVersionappDatabeta", query = "SELECT a FROM Appdata a WHERE a.versionappDatabeta = :versionappDatabeta")})
public class Appdata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_appData")
    private Integer idappData;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "version_appData")
    private String versionappData;
    @Size(max = 45)
    @Column(name = "version_appData_Dev")
    private String versionappDataDev;
    @Size(max = 45)
    @Column(name = "version_appData_beta")
    private String versionappDatabeta;

    public Appdata() {
    }

    public Appdata(Integer idappData) {
        this.idappData = idappData;
    }

    public Appdata(Integer idappData, String versionappData) {
        this.idappData = idappData;
        this.versionappData = versionappData;
    }

    public Integer getIdappData() {
        return idappData;
    }

    public void setIdappData(Integer idappData) {
        this.idappData = idappData;
    }

    public String getVersionappData() {
        return versionappData;
    }

    public void setVersionappData(String versionappData) {
        this.versionappData = versionappData;
    }

    public String getVersionappDataDev() {
        return versionappDataDev;
    }

    public void setVersionappDataDev(String versionappDataDev) {
        this.versionappDataDev = versionappDataDev;
    }

    public String getVersionappDatabeta() {
        return versionappDatabeta;
    }

    public void setVersionappDatabeta(String versionappDatabeta) {
        this.versionappDatabeta = versionappDatabeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idappData != null ? idappData.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appdata)) {
            return false;
        }
        Appdata other = (Appdata) object;
        if ((this.idappData == null && other.idappData != null) || (this.idappData != null && !this.idappData.equals(other.idappData))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hubionics.anda.web.entity.Appdata[ idappData=" + idappData + " ]";
    }
    
}
