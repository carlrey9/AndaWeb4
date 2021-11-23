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
public class InvoiceVO {

    private int estadoCompra;

    private String googleOrderId;

    private Integer idInvoice;

    private Date fechaRealizadoInvoice;

    private long totalInvoice;

    private Usuario idUsuario;

    public InvoiceVO() {
    }

    public InvoiceVO(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public InvoiceVO(Integer idInvoice, Date fechaRealizadoInvoice, long totalInvoice) {
        this.idInvoice = idInvoice;
        this.fechaRealizadoInvoice = fechaRealizadoInvoice;
        this.totalInvoice = totalInvoice;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Date getFechaRealizadoInvoice() {
        return fechaRealizadoInvoice;
    }

    public void setFechaRealizadoInvoice(Date fechaRealizadoInvoice) {
        this.fechaRealizadoInvoice = fechaRealizadoInvoice;
    }

    public long getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(long totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getGoogleOrderId() {
        return googleOrderId;
    }

    public void setGoogleOrderId(String googleOrderId) {
        this.googleOrderId = googleOrderId;
    }

    /**
     * @return the estadoCompra
     */
    public int getEstadoCompra() {
        return estadoCompra;
    }

    /**
     * @param estadoCompra the estadoCompra to set
     */
    public void setEstadoCompra(int estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

}
