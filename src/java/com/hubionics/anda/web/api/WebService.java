/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.api;

import com.hmb.humanbionics.andabasic.vo.CompraGoogleVO;
import com.hubionics.anda.web.business.DatabaseManager;
import com.hubionics.anda.web.entity.vo.AppVO;
import com.hubionics.anda.web.entity.vo.CodigosActivacionVO;
import com.hubionics.anda.web.entity.vo.DatosMedicosVo;
import com.hubionics.anda.web.entity.vo.InformacionUsuarioVO;
import com.hubionics.anda.web.entity.vo.MetricsVO;
import com.hubionics.anda.web.entity.vo.ReportVO;
import com.hubionics.anda.web.entity.vo.UsuarioCodesVO;
import com.hubionics.anda.web.entity.vo.UsuarioVO;
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
@Path("v1")
public class WebService {

    @EJB
    DatabaseManager databaseManager;
    // Change by coding the Authentication
    private final boolean autenticado = true;

    @POST
    @Path("getSonidos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getSonidos() {
        if (autenticado) {
            return databaseManager.getSonidos();
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("registrarUsuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta registrarUsuario(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.registrarUsuario(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("autenticarUsuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta autenticarUsuario(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.autenticarUsuario(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getVigenciaPaquete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getVigenciaPaqueteUsuario(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.getVigenciaPaqueteUsuario(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getVersionApp")
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getVersionApp() {
        if (autenticado) {
            return databaseManager.getVersionApp();
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getVersionAppV2")
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getVersionAppV2() {
        if (autenticado) {
            return databaseManager.getVersionAppV2();
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("redimirCode")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta redimirCode(CodigosActivacionVO codigosActivacionVO) {
        if (autenticado) {
            return databaseManager.redimirCode(codigosActivacionVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getInfoUsuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getInfoUsuario(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.getInfoUsuario(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("updateInfoUsuario")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta updateInfoUsuario(InformacionUsuarioVO informacionUsuarioVO) {
        if (autenticado) {
            return databaseManager.updateInfoUsuario(informacionUsuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("reenviarCorreoVerificacion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta reenviarCorreoVerificacion(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.reenviarCorreoVerificacion(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("enviarContrasenaCorreo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta enviarContrasenaCorreo(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.enviarContrasenaCorreo(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getInfoPromo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getInfoPromo() {
        if (autenticado) {
            return databaseManager.getInfoPromo();
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("registrarCompraGoogle")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta registrarCompraGoogle(CompraGoogleVO compraGoogleVO) {
        if (autenticado) {
            return databaseManager.registrarCompraGoogle(compraGoogleVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("verificarTokenFireBase")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta verificarTokenFireBase(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.verificarTokenFireBase(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getSonidosKey")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getSonidosKey(/*AppVO appVO*/) {

        if (autenticado) {
            return databaseManager.getSonidosKey(/*appVO*/);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getSubcategoriaSonidos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getSubcategoriasSonidos(/*AppVO appVO*/) {

        if (autenticado) {
            return databaseManager.getSubcategoriasSonidos(/*appVO*/);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getTempoSonidos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getTempoSonidos(/*AppVO appVO*/) {

        if (autenticado) {
            return databaseManager.getTempoSonidos(/*appVO*/);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("metrics")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta saveMetrics(MetricsVO metricsVO) {

        if (autenticado) {
            return databaseManager.saveMetrics(metricsVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("updateLastLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta updateLastLogin(UsuarioVO usuarioVO) {

        if (autenticado) {
            return databaseManager.updateLastLogin(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("sendRequirement")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta sendRequirement(ReportVO reportVO) {

        if (autenticado) {
            return databaseManager.sendRequirement(reportVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

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

    @POST
    @Path("sendDatosMedicos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta sendDatosMedicos(DatosMedicosVo datosMedicosVO) {
        if (autenticado) {
            return databaseManager.sendDatosMedicos(datosMedicosVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

    @POST
    @Path("getDatosMedicos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getDatosMedicos(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.getDatosMedicos(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }
    @POST
    @Path("getDatosMedicosChart")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getDatosMedicosChart(UsuarioVO usuarioVO) {
        if (autenticado) {
            return databaseManager.getDatosMedicosChart(usuarioVO);
        } else {
            return Util.getError(ErroresRespuesta.NO_AUTENTICADO);
        }
    }

}
