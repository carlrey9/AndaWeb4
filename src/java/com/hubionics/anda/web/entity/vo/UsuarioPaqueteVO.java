/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity.vo;
import java.util.Date;

/**
 * Created by hubio on 23/11/2017.
 */

public class UsuarioPaqueteVO {

    private int vigenciaPaquete;

    private Date ultimoPago;

    private int idPaquete;

    public UsuarioPaqueteVO() {
    }

    public int getVigenciaPaquete() {
        return vigenciaPaquete;
    }

    public void setVigenciaPaquete(int vigenciaPaquete) {
        this.vigenciaPaquete = vigenciaPaquete;
    }

    public Date getUltimoPago() {
        return ultimoPago;
    }

    public void setUltimoPago(Date ultimoPago) {
        this.ultimoPago = ultimoPago;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

}
