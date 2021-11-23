/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity.vo;

import com.hubionics.anda.web.entity.*;
import java.util.Date;


/**
 *
 * @author hubio
 */

public class ComprasLogVO  {


    private Integer idcomprasLog;

    private String descripcionComprasLog;


    private Date fechaComprasLog;

    private Usuario idUsuario;

    public ComprasLogVO() {
    }

    public ComprasLogVO(Integer idcomprasLog) {
        this.idcomprasLog = idcomprasLog;
    }

    public ComprasLogVO(Integer idcomprasLog, Date fechaComprasLog) {
        this.idcomprasLog = idcomprasLog;
        this.fechaComprasLog = fechaComprasLog;
    }

    public Integer getIdcomprasLog() {
        return idcomprasLog;
    }

    public void setIdcomprasLog(Integer idcomprasLog) {
        this.idcomprasLog = idcomprasLog;
    }

    public String getDescripcionComprasLog() {
        return descripcionComprasLog;
    }

    public void setDescripcionComprasLog(String descripcionComprasLog) {
        this.descripcionComprasLog = descripcionComprasLog;
    }

    public Date getFechaComprasLog() {
        return fechaComprasLog;
    }

    public void setFechaComprasLog(Date fechaComprasLog) {
        this.fechaComprasLog = fechaComprasLog;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
