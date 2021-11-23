/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.api;

import com.hubionics.anda.web.business.AdminDbManager;
import com.hubionics.anda.web.business.DatabaseManager;
import com.hubionics.anda.web.entity.vo.UsuarioCodesVO;
import com.hubionics.anda.web.util.Util;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hubio
 */
@Path("AdminService")
public class AdminService {

    @EJB
    AdminDbManager databaseManager;

    private final boolean autenticado = true;

    @POST
    @Path("crearCodigos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta crearCodigos(UsuarioCodesVO usuarioCodesVO) {
        if (autenticado) {
            return databaseManager.crearCodigos(usuarioCodesVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }
    
    
    @GET
    @Path("enviarMailPrueba")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta enviarMailPrueba() {
        if (autenticado) {
            return databaseManager.enviarMailPrueba();
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

}
