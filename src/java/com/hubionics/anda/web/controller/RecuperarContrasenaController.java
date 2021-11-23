/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.controller;

import com.hubionics.anda.web.business.DatabaseManager;
import com.hubionics.anda.web.entity.Paquete;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author hubio
 */
public class RecuperarContrasenaController {

    DatabaseManager databaseManager1 = lookupDatabaseManagerBean1();

    public int getCuentaByToken(String token) {

        return databaseManager1.getCuentaByToken(token);

    }
    public int verifyNewPasswd(String token,String pwd1,String pwd2){
        return databaseManager1.setNewPwd(token,pwd1, pwd2);
    }

    private DatabaseManager lookupDatabaseManagerBean1() {
        try {
            Context c = new InitialContext();
            return (DatabaseManager) c.lookup("java:global/AndaWeb4/DatabaseManager!com.hubionics.anda.web.business.DatabaseManager");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }

    }
}
