/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.controller;

import com.hubionics.anda.web.business.DatabaseManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author hubio
 */
public class VerificarCorreoController {

    DatabaseManager databaseManager1 = lookupDatabaseManagerBean1();

    public int verificarCorreo(String token) {
        
        return databaseManager1.verificarTokenCorreo(token);
        
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
