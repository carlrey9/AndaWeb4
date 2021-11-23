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

public class KeyVaultVO {


  
    private Integer idKeyVault;
  
    private String secretKey;
 
    public KeyVaultVO() {
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
    
}
