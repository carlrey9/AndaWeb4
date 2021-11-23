/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.entity.vo;

/**
 *
 * @author hubio
 */
public class UsuarioCodesVO {

    private Integer idUsuario;
    private int cantidad;
    private int tamanoStringAGenerar;
    private int paquete;

    public UsuarioCodesVO() {
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tamanoStringAGenerar
     */
    public int getTamanoStringAGenerar() {
        return tamanoStringAGenerar;
    }

    /**
     * @param tamanoStringAGenerar the tamanoStringAGenerar to set
     */
    public void setTamanoStringAGenerar(int tamanoStringAGenerar) {
        this.tamanoStringAGenerar = tamanoStringAGenerar;
    }

    /**
     * @return the paquete
     */
    public int getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(int paquete) {
        this.paquete = paquete;
    }

}
