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
public class UsuarioVO {


    private Integer idUsuario;

    private String passwdUsuario;
 
    private String facebookuserID;
  
    private int usuarioActivo;
 
    private int correoConfirmado;
   
    private String tokenConfirmarCorreo;
    
    private String emailInfoUsuario;
    
    private int idRolUsuario;
    
    private String firebaseToken;
    
    private String idDevice;
   

    public UsuarioVO() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPasswdUsuario() {
        return passwdUsuario;
    }

    public void setPasswdUsuario(String passwdUsuario) {
        this.passwdUsuario = passwdUsuario;
    }

    public String getFacebookuserID() {
        return facebookuserID;
    }

    public void setFacebookuserID(String facebookuserID) {
        this.facebookuserID = facebookuserID;
    }

    public int getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(int usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public int getCorreoConfirmado() {
        return correoConfirmado;
    }

    public void setCorreoConfirmado(int correoConfirmado) {
        this.correoConfirmado = correoConfirmado;
    }

    public String getTokenConfirmarCorreo() {
        return tokenConfirmarCorreo;
    }

    public void setTokenConfirmarCorreo(String tokenConfirmarCorreo) {
        this.tokenConfirmarCorreo = tokenConfirmarCorreo;
    }

    public String getEmailInfoUsuario() {
        return emailInfoUsuario;
    }

    public void setEmailInfoUsuario(String emailInfoUsuario) {
        this.emailInfoUsuario = emailInfoUsuario;
    }

    public int getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(int  idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    /**
     * @return the firebaseToken
     */
    public String getFirebaseToken() {
        return firebaseToken;
    }

    /**
     * @param firebaseToken the firebaseToken to set
     */
    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }
    
    
    
}
