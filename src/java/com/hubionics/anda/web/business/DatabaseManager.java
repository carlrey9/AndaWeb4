/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.business;

import com.hmb.humanbionics.andabasic.vo.CompraGoogleVO;
import com.hubionics.anda.web.api.ErroresRespuesta;
import com.hubionics.anda.web.api.Respuesta;
import com.hubionics.anda.web.entity.AndaRequirements;
import com.hubionics.anda.web.entity.Paquete;
import com.hubionics.anda.web.entity.CodigosActivacion;
import com.hubionics.anda.web.entity.Sonido;
import com.hubionics.anda.web.entity.Usuario;
import com.hubionics.anda.web.entity.UsuarioPaquete;
import com.hubionics.anda.web.entity.AppInfoPromo;
import com.hubionics.anda.web.entity.Appdata;
import com.hubionics.anda.web.entity.ComprasLog;
import com.hubionics.anda.web.entity.Invoice;
import com.hubionics.anda.web.entity.InvoicePaquete;
import com.hubionics.anda.web.entity.InformacionUsuario;
import com.hubionics.anda.web.entity.KeyVault;
import com.hubionics.anda.web.entity.Metricasanda;
import com.hubionics.anda.web.entity.SubCategoriaSonido;
import com.hubionics.anda.web.entity.TempoSonido;
import com.hubionics.anda.web.entity.UsuarioDatosMedicos;
import com.hubionics.anda.web.entity.UsuarioLog;
import com.hubionics.anda.web.entity.vo.AppInfoPromoVO;
import com.hubionics.anda.web.entity.vo.AppVO;
import com.hubionics.anda.web.entity.vo.AppdataVO;
import com.hubionics.anda.web.entity.vo.CodigosActivacionVO;
import com.hubionics.anda.web.entity.vo.ComprasLogVO;
import com.hubionics.anda.web.entity.vo.DatosMedicosChartVo;
import com.hubionics.anda.web.entity.vo.DatosMedicosVo;
import com.hubionics.anda.web.entity.vo.InformacionUsuarioVO;
import com.hubionics.anda.web.entity.vo.InvoiceVO;
import com.hubionics.anda.web.entity.vo.KeyVaultVO;
import com.hubionics.anda.web.entity.vo.MetricsVO;
import com.hubionics.anda.web.entity.vo.ReportVO;
import com.hubionics.anda.web.entity.vo.SonidoVO;
import com.hubionics.anda.web.entity.vo.SubCategoriaSonidoVO;
import com.hubionics.anda.web.entity.vo.TempoSonidoVO;
import com.hubionics.anda.web.entity.vo.TiempoRestanteVO;
import com.hubionics.anda.web.entity.vo.UsuarioCodesVO;
import com.hubionics.anda.web.entity.vo.UsuarioVO;
import com.hubionics.anda.web.facade.AndaRequirementsFacade;
import com.hubionics.anda.web.facade.AppInfoPromoFacade;
import com.hubionics.anda.web.facade.AppdataFacade;
import com.hubionics.anda.web.facade.PaqueteFacade;
import com.hubionics.anda.web.facade.RolUsuarioFacade;
import com.hubionics.anda.web.facade.SonidoFacade;
import com.hubionics.anda.web.facade.UsuarioFacade;
import com.hubionics.anda.web.facade.UsuarioPaqueteFacade;
import com.hubionics.anda.web.facade.CodigosActivacionFacade;
import com.hubionics.anda.web.facade.ComprasLogFacade;
import com.hubionics.anda.web.facade.InformacionUsuarioFacade;
import com.hubionics.anda.web.facade.InvoiceFacade;
import com.hubionics.anda.web.facade.InvoicePaqueteFacade;
import com.hubionics.anda.web.facade.KeyVaultFacade;
import com.hubionics.anda.web.facade.MetricasandaFacade;
import com.hubionics.anda.web.facade.SubCategoriaSonidoFacade;
import com.hubionics.anda.web.facade.TempoSonidoFacade;
import com.hubionics.anda.web.facade.UsuarioDatosMedicosFacade;
import com.hubionics.anda.web.facade.UsuarioLogFacade;
import com.hubionics.anda.web.util.EnviarMail;
import com.hubionics.anda.web.util.HashEncryption;
import com.hubionics.anda.web.util.RandomString;
import com.hubionics.anda.web.util.SendNotification;
import com.hubionics.anda.web.util.Util;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author hubio
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.NEVER)
public class DatabaseManager {

    @EJB
    SonidoFacade sonidoFacade;

    @EJB
    RolUsuarioFacade rolUsuarioFacade;

    @EJB
    UsuarioFacade usuarioFacade;

    @EJB
    UsuarioPaqueteFacade usuarioPaqueteFacade;

    @EJB
    PaqueteFacade paqueteFacade;

    @EJB
    AppdataFacade appdataFacade;

    @EJB
    CodigosActivacionFacade codigosActivacionFacade;

    @EJB
    UsuarioLogFacade usuarioLogFacade;

    @EJB
    InformacionUsuarioFacade informacionUsuarioFacade;

    @EJB
    AppInfoPromoFacade appInfoPromoFacade;

    @EJB
    InvoiceFacade invoiceFacade;

    @EJB
    InvoicePaqueteFacade invoicePaqueteFacade;

    @EJB
    KeyVaultFacade keyVaultFacade;

    @EJB
    SubCategoriaSonidoFacade subCategoriaSonidoFacade;

    @EJB
    TempoSonidoFacade tempoSonidoFacade;

    @EJB
    ComprasLogFacade comprasLogFacade;

    @EJB
    AndaRequirementsFacade andaRequirementsFacade;

    @EJB
    MetricasandaFacade metricasandaFacade;

    @EJB
    UsuarioDatosMedicosFacade usuarioDatosMedicosFacade;

    public Respuesta saveMetrics(MetricsVO metricsVO) {
        try {
            Usuario u = usuarioFacade.find(metricsVO.getUserID());

            
            if (u != null) {
                Metricasanda metricasanda = new Metricasanda();
                metricasanda.setDescripcionMetrica(metricsVO.getMetricDescription());
                metricasanda.setFechaMetrica(new Date());
                metricasanda.setIdUsuario(u);
                metricasanda.setTipoMetrica(metricsVO.getMetricType());
                metricasandaFacade.create(metricasanda);

                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.SAVE_METRICS_ERROR_2);
            }
        } catch (Exception e) {
            return Util.getError(ErroresRespuesta.SAVE_METRICS_ERROR_1);
        }
    }
    

    public Respuesta getSonidos() {

        try {
            List<Sonido> sonidos = sonidoFacade.findAll();
            List<SonidoVO> sonidoVOs = new ArrayList<>();
            for (Sonido sonido : sonidos) {
                SonidoVO sonidoVO = new SonidoVO();

                sonidoVO.setUrlSonido(sonido.getUrlSonido());
                sonidoVO.setUrlIcono(sonido.getUrlIcono());
                sonidoVO.setUrlIconoInactivo(sonido.getUrlIconoInactivo());
                sonidoVO.setSecretKey(sonido.getSecretKey().getSecretKey());
                sonidoVO.setIdTempoSonido(sonido.getIdTempoSonido().getIdTempoSonido());
                sonidoVO.setIdSubcategoria(sonido.getIdSubcategoria().getIdSubCategoriaSonido());
                sonidoVO.setNombreArchivo(sonido.getNombreArchivo());

                sonidoVOs.add(sonidoVO);
            }
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(sonidoVOs).build();
        } catch (Exception e) {
            return Util.getError(ErroresRespuesta.LISTA_SONIDOS_ERROR);
        }
    }

    public Respuesta getSubcategoriasSonidos() {
        try {
            List<SubCategoriaSonido> subCategoriaSonidos = subCategoriaSonidoFacade.findAll();
            List<SubCategoriaSonidoVO> subCategoriaSonidoVOs = new ArrayList<>();
            for (SubCategoriaSonido subCategoriaSonido : subCategoriaSonidos) {
                SubCategoriaSonidoVO subCategoriaSonidoVO = new SubCategoriaSonidoVO();

                subCategoriaSonidoVO.setIdSubCategoriaSonido(subCategoriaSonido.getIdSubCategoriaSonido());
                subCategoriaSonidoVO.setDescSubCategoriaSonido(subCategoriaSonido.getDescSubCategoriaSonido());
                subCategoriaSonidoVO.setUrlIconSubCategoriaSonido(subCategoriaSonido.getUrlIconSubCategoriaSonido());

                subCategoriaSonidoVOs.add(subCategoriaSonidoVO);
            }
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(subCategoriaSonidoVOs).build();
        } catch (Exception e) {
            return Util.getError(ErroresRespuesta.LISTA_SUBCATEGORIA_ERROR);
        }
    }

    public Respuesta getTempoSonidos() {
        try {
            List<TempoSonido> tempoSonidos = tempoSonidoFacade.findAll();
            List<TempoSonidoVO> tempoSonidoVOs = new ArrayList<>();
            for (TempoSonido tempoSonido : tempoSonidos) {
                TempoSonidoVO tempoSonidoVO = new TempoSonidoVO();

                tempoSonidoVO.setIdTempoSonido(tempoSonido.getIdTempoSonido());
                tempoSonidoVO.setTheTempoSonido(tempoSonido.getTheTempoSonido());
                tempoSonidoVO.setUrlIconoTempoSonido(tempoSonido.getUrlIconoTempoSonido());

                tempoSonidoVOs.add(tempoSonidoVO);
            }
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(tempoSonidoVOs).build();
        } catch (Exception e) {
            return Util.getError(ErroresRespuesta.LISTA_TEMPOS_ERROR);
        }
    }

    public Respuesta registrarUsuario(UsuarioVO usuarioVO) {
        try {
            Usuario usuarioVerifyMail = usuarioFacade.findCorreoElectronico(usuarioVO.getEmailInfoUsuario());

            if (usuarioVerifyMail != null) {
                return Util.getError(ErroresRespuesta.ERROR_CREACION_USUARIO_2);
            } else {
                Usuario usuario = new Usuario();

                if (usuarioVO.getPasswdUsuario() != null && usuarioVO.getPasswdUsuario().length() <= 25) {//TODO REMOVE COLLINS
                    usuarioVO.setPasswdUsuario(HashEncryption.getHashedTry2(usuarioVO.getPasswdUsuario()));
                }
                usuario.setPasswdUsuario(usuarioVO.getPasswdUsuario());
                String tokenCorreo = new RandomString(128).nextString();
                usuario.setTokenConfirmarCorreo(tokenCorreo);
                if (usuarioVO.getFacebookuserID() != null) {
                    usuario.setFacebookuserID(usuarioVO.getFacebookuserID());
                    usuario.setCorreoConfirmado(1);//TODO CONFIRMAR CORREO DESPUES DE IR AL LINK
                } else {

                    usuario.setCorreoConfirmado(0);//TODO CONFIRMAR CORREO DESPUES DE IR AL LINK
                }

                usuario.setIdRolUsuario(rolUsuarioFacade.find(3)); // ROL USUARIO por defecto
                usuario.setUsuarioActivo(1); // USUARIO ACTIVO
                usuario.setEmailInfoUsuario(usuarioVO.getEmailInfoUsuario());
                usuario.setIdDevice(usuarioVO.getIdDevice());
                
                usuario.setFechaCreacionUsuario(new Date());

                usuarioFacade.create(usuario);

                InformacionUsuario informacionUsuario = new InformacionUsuario();
                informacionUsuario.setNombresInfoUsuario("Nombres");
                informacionUsuario.setApellidosInfoUsuario("Apellidos");
                informacionUsuario.setGeneroInfoUsuario(1);
                informacionUsuario.setIdUsuario(usuario);

                informacionUsuarioFacade.create(informacionUsuario);

                UsuarioPaquete usuarioPaquete = new UsuarioPaquete();
                Paquete paquete = paqueteFacade.find(2); //PAQUETE ESTANDAR PARA REGISTRO
                usuarioPaquete.setVigenciaPaquete(paquete.getVigenciaPaquete());
                usuarioPaquete.setIdPaquete(paquete);
                usuarioPaquete.setIdUsuario(usuario);
                usuarioPaquete.setUltimoPago(new Date());

                usuarioPaqueteFacade.create(usuarioPaquete);

                if (usuarioVO.getFacebookuserID() == null) {
                    String correoContenido = "<img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/headcorreo.png\"/>"
                            + "<br/><br/><h1>Bienvenido a ANDA</h1>"
                            + "<br/><br/><h2> Gracias por registrarte.</h2>"
                            + "<br/><br/> Sigue este link para activar tu cuenta:"
                            + "<br/> <a href=\"https://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "\">https://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "</a>"
                            + "<br/><br/> Si no puedes visitar el link copia y pega este texto en el navegador."
                            + "<br/>https://www.humanbionics.co.uk:55411/AndaWeb4/api/v1/activarCuenta.jsp?t=" + tokenCorreo + ""
                            + "<br/><br/><img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/piefirmacorreo.png\"/>";
                    new EnviarMail().sendwithMessage("Registro: Nuevo Usuario", correoContenido, usuarioVO.getEmailInfoUsuario());
                }
                SendNotification.newUserRegistered();
                return new Respuesta.Builder().status(Respuesta.SUCCESS)
                        .data("")
                        .build();
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.ERROR_CREACION_USUARIO_1)
                    .build();
        }
    }

        public Respuesta autenticarUsuario(UsuarioVO usuarioVO) {
        try {
            Usuario usuario = usuarioFacade.findCorreoElectronico(usuarioVO.getEmailInfoUsuario());

            if (usuario != null) {
                if (usuarioVO.getPasswdUsuario() != null && usuarioVO.getPasswdUsuario().length() <= 25) {//TODO REMOVE COLLINS
                    usuarioVO.setPasswdUsuario(HashEncryption.getHashedTry2(usuarioVO.getPasswdUsuario()));
                }

                if (usuarioVO.getPasswdUsuario() != null && usuarioVO.getPasswdUsuario().equals(usuario.getPasswdUsuario())) {
                    UsuarioVO usuarioVO1 = new UsuarioVO();
                    usuarioVO1.setIdUsuario(usuario.getIdUsuario());
                    usuarioVO1.setUsuarioActivo(usuario.getUsuarioActivo());
                    usuarioVO1.setCorreoConfirmado(usuario.getCorreoConfirmado());
                    usuarioVO1.setEmailInfoUsuario(usuario.getEmailInfoUsuario());
                    usuarioVO1.setIdRolUsuario(usuario.getIdRolUsuario().getIdRolUsuario());

                    /* UsuarioLog usuarioLog = new UsuarioLog();
                    usuarioLog.setConceptoUsuarioLog("Usuario Inicio Sesion");
                    usuarioLog.setIdUsuarioFk(usuario);
                    usuarioLog.setDateEventoUsuarioLog(new Date());
                    usuarioLogFacade.create(usuarioLog);*/
                    return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(usuarioVO1).build();
                } else if (usuarioVO.getFacebookuserID() != null && usuario.getFacebookuserID().equals(usuarioVO.getFacebookuserID())) {
                    UsuarioVO usuarioVO1 = new UsuarioVO();
                    usuarioVO1.setIdUsuario(usuario.getIdUsuario());
                    usuarioVO1.setUsuarioActivo(usuario.getUsuarioActivo());
                    usuarioVO1.setIdRolUsuario(usuario.getIdRolUsuario().getIdRolUsuario());
                    usuarioVO1.setCorreoConfirmado(usuario.getCorreoConfirmado());
                    usuarioVO1.setEmailInfoUsuario(usuario.getEmailInfoUsuario());

                    /* UsuarioLog usuarioLog = new UsuarioLog();
                    usuarioLog.setConceptoUsuarioLog("Usuario Inicio Sesion con facebook");
                    usuarioLog.setIdUsuarioFk(usuario);
                    usuarioLog.setDateEventoUsuarioLog(new Date());
                    usuarioLogFacade.create(usuarioLog);*/
                    return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(usuarioVO1).build();
                } else {
                    return Util.getError(ErroresRespuesta.AUTENTICACION_ERROR_3);
                }
            } else {
                return Util.getError(ErroresRespuesta.AUTENTICACION_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.AUTENTICACION_ERROR)
                    .build();
        }

    }

    public Respuesta getVigenciaPaqueteUsuario(UsuarioVO usuarioVO) {
        try {
            if (usuarioVO.getIdUsuario() != null && usuarioVO.getIdUsuario() != 0) {
                Usuario usuario = usuarioFacade.find(usuarioVO.getIdUsuario());
                if (usuario != null) {
                    List<UsuarioPaquete> usuarioPaquetes = usuario.getUsuarioPaqueteList();
                    if (usuarioPaquetes != null && !usuarioPaquetes.isEmpty()) {
                        Date dateHoy = new Date();
                        long tiempoTotalRestante = 0;
                        for (UsuarioPaquete usuarioPaquete : usuarioPaquetes) {
                            Date dateUltimoPago = usuarioPaquete.getUltimoPago();
                            long diff = dateHoy.getTime() - dateUltimoPago.getTime();
                            long tiempoRestante = usuarioPaquete.getVigenciaPaquete() - TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                            if (tiempoRestante > 0) {
                                tiempoTotalRestante += tiempoRestante;
                            }
                        }
                        TiempoRestanteVO tiempoRestanteVO = new TiempoRestanteVO();
                        tiempoRestanteVO.setTiempoRestante(tiempoTotalRestante);

                        return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(tiempoRestanteVO).build();
                    } else {

                        return Util.getError(ErroresRespuesta.GET_VIGENCIA_PAQUETE_ERROR_4);

                    }
                } else {

                    return Util.getError(ErroresRespuesta.GET_VIGENCIA_PAQUETE_ERROR_3);
                }
            } else {

                return Util.getError(ErroresRespuesta.GET_VIGENCIA_PAQUETE_ERROR_2);
            }

        } catch (Exception e) {

            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_VIGENCIA_PAQUETE_ERROR_1)
                    .build();
        }
    }
    
    
    
    public Respuesta getidDevice(UsuarioVO usuarioVO) {
        try {
            List<Usuario> usuarios = usuarioFacade.findAll();
            String idDevice = "no devices with this idDevice";
            if(usuarios != null){
                for(int i = 0; i < usuarios.size();i++){
                    Usuario usuarioTemp = usuarios.get(i);
                    if(usuarioTemp.getIdDevice() == usuarioVO.getIdDevice()){
                        idDevice = usuarioTemp.getIdDevice();
                    }   
            
                }
            }
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(idDevice).build();
      
        } catch (Exception e) {

            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_ID_DEVICE_ERROR_1)
                    .build();
        }
    }
    
    
    

    public Respuesta getVersionApp() {
        try {
            List<Appdata> appdatas = appdataFacade.findAll();
            List<AppdataVO> appdataVOs = new ArrayList<>();
            for (Appdata appdata : appdatas) {
                AppdataVO appdataVO = new AppdataVO();
                appdataVO.setIdappData(appdata.getIdappData());
                appdataVO.setVersionappData(appdata.getVersionappData());
                appdataVOs.add(appdataVO);
            }

            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(appdataVOs).build();

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_VERSION_APP_ERROR)
                    .build();
        }
    }

    public Respuesta getVersionAppV2() {
        try {

            Appdata appdata = appdataFacade.find(1); //Default appdata

            AppdataVO appdataVO = new AppdataVO();
            appdataVO.setIdappData(appdata.getIdappData());
            appdataVO.setVersionappData(appdata.getVersionappData());
            appdataVO.setVersionappDataDev(appdata.getVersionappDataDev());
            appdataVO.setVersionappDatabeta(appdata.getVersionappDatabeta());

            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(appdataVO).build();
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_VERSION_APP_ERROR)
                    .build();
        }
    }

    public Respuesta redimirCode(CodigosActivacionVO codigosActivacionVO) {

        try {

            CodigosActivacion codigosActivacion = codigosActivacionFacade.findByCodigoActivacion(codigosActivacionVO.getCodigoActivacion());

            if (codigosActivacion != null) {

                if (codigosActivacion.getCodigoIsRedeemed() != 1) {

                    UsuarioPaquete up = new UsuarioPaquete();
                    Paquete p = paqueteFacade.find(codigosActivacion.getIdPaquete().getIdPaquete());

                    if (p != null) {
                        Usuario u = usuarioFacade.find(codigosActivacionVO.getIdUsuario());
                        if (u != null) {
                            Date date = new Date();
                            up.setIdPaquete(p);
                            up.setIdUsuario(u);
                            up.setUltimoPago(date);
                            up.setVigenciaPaquete(p.getVigenciaPaquete());
                            usuarioPaqueteFacade.create(up);

                            codigosActivacion.setCodigoIsRedeemed(1);
                            codigosActivacion.setFechaActivacion(date);
                            codigosActivacion.setIdUsuario(u);
                            codigosActivacionFacade.edit(codigosActivacion);

                            UsuarioLog usuarioLog = new UsuarioLog();
                            usuarioLog.setConceptoUsuarioLog("Usuario registro codigo " + codigosActivacionVO.getCodigoActivacion());
                            usuarioLog.setIdUsuarioFk(u);
                            usuarioLog.setDateEventoUsuarioLog(new Date());
                            usuarioLogFacade.create(usuarioLog);

                            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
                        } else {
                            return Util.getError(ErroresRespuesta.CODIGOACT_ERROR_5);
                        }

                    } else {
                        return Util.getError(ErroresRespuesta.CODIGOACT_ERROR_4);
                    }

                } else {
                    return Util.getError(ErroresRespuesta.CODIGOACT_ERROR_3);
                }

            } else {
                return Util.getError(ErroresRespuesta.CODIGOACT_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.CODIGOACT_ERROR_1)
                    .build();
        }
    }

    public Respuesta getInfoUsuario(UsuarioVO usuarioVO) {

        try {
            Usuario u = usuarioFacade.find(usuarioVO.getIdUsuario());
            if (u != null) {
                InformacionUsuario iu = informacionUsuarioFacade.findByIdUsuario(u);
                if (iu != null) {
                    InformacionUsuarioVO informacionUsuarioVO = new InformacionUsuarioVO();

                    informacionUsuarioVO.setNombresInfoUsuario(iu.getNombresInfoUsuario());
                    informacionUsuarioVO.setApellidosInfoUsuario(iu.getApellidosInfoUsuario());

                    if (iu.getFechaNacInfoUsuario() != null) {
                        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                        String s = formatter.format(iu.getFechaNacInfoUsuario());
                        informacionUsuarioVO.setFechaNacInfoUsuario(s);
                    } else {
                        informacionUsuarioVO.setFechaNacInfoUsuario(null);
                    }

                    informacionUsuarioVO.setPaisInfoUsuario(iu.getPaisInfoUsuario());
                    informacionUsuarioVO.setDptoInfoUsuario(iu.getDptoInfoUsuario());
                    informacionUsuarioVO.setCiudadInfoUsuario(iu.getCiudadInfoUsuario());
                    informacionUsuarioVO.setDireccionInfoUsuario(iu.getDireccionInfoUsuario());
                    informacionUsuarioVO.setTelefonoInfoUsuario(iu.getTelefonoInfoUsuario());
                    informacionUsuarioVO.setGeneroInfoUsuario(iu.getGeneroInfoUsuario());
                    informacionUsuarioVO.setCorreoElectronico(u.getEmailInfoUsuario());
                    informacionUsuarioVO.setIdUsuario(u.getIdUsuario());

                    List<UsuarioPaquete> usuarioPaquetes = u.getUsuarioPaqueteList();
                    if (usuarioPaquetes != null && !usuarioPaquetes.isEmpty()) {
                        Date dateHoy = new Date();
                        long tiempoTotalRestante = 0;
                        for (UsuarioPaquete usuarioPaquete : usuarioPaquetes) {
                            Date dateUltimoPago = usuarioPaquete.getUltimoPago();
                            long diff = dateHoy.getTime() - dateUltimoPago.getTime();
                            long tiempoRestante = usuarioPaquete.getVigenciaPaquete() - TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                            if (tiempoRestante > 0) {
                                tiempoTotalRestante += tiempoRestante;
                            }
                        }
                        informacionUsuarioVO.setFechaLimitePaquete(tiempoTotalRestante);
                    } else {
                        informacionUsuarioVO.setFechaLimitePaquete(0);
                    }

                    return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(informacionUsuarioVO).build();
                } else {
                    return Util.getError(ErroresRespuesta.INFOUSUARIO_ERROR_3);
                }

            } else {
                return Util.getError(ErroresRespuesta.INFOUSUARIO_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.INFOUSUARIO_ERROR_1)
                    .build();
        }

    }

    public Respuesta updateInfoUsuario(InformacionUsuarioVO informacionUsuarioVO) {
        try {
            Usuario u = usuarioFacade.find(informacionUsuarioVO.getIdUsuario());
            if (u != null) {

                InformacionUsuario iu = informacionUsuarioFacade.findByIdUsuario(u);
                if (iu == null) {
                    InformacionUsuario iunew = new InformacionUsuario();
                    iunew.setNombresInfoUsuario(informacionUsuarioVO.getNombresInfoUsuario());
                    iunew.setApellidosInfoUsuario(informacionUsuarioVO.getApellidosInfoUsuario());

                    if (informacionUsuarioVO.getFechaNacInfoUsuario() != null) {
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                        Date date = format.parse(informacionUsuarioVO.getFechaNacInfoUsuario());
                        iunew.setFechaNacInfoUsuario(date);
                    } else {
                        iunew.setFechaNacInfoUsuario(null);
                    }

                    iunew.setPaisInfoUsuario(informacionUsuarioVO.getPaisInfoUsuario());
                    iunew.setDptoInfoUsuario(informacionUsuarioVO.getDptoInfoUsuario());
                    iunew.setCiudadInfoUsuario(informacionUsuarioVO.getCiudadInfoUsuario());
                    iunew.setDireccionInfoUsuario(informacionUsuarioVO.getDireccionInfoUsuario());
                    iunew.setTelefonoInfoUsuario(informacionUsuarioVO.getTelefonoInfoUsuario());
                    iunew.setGeneroInfoUsuario(informacionUsuarioVO.getGeneroInfoUsuario());
                    iunew.setIdUsuario(u);

                    informacionUsuarioFacade.create(iunew);

                    UsuarioLog usuarioLog = new UsuarioLog();
                    usuarioLog.setConceptoUsuarioLog("Usuario subio informacion por primera vez");
                    usuarioLog.setIdUsuarioFk(u);
                    usuarioLog.setDateEventoUsuarioLog(new Date());
                    usuarioLogFacade.create(usuarioLog);

                    InformacionUsuario iuReturn = informacionUsuarioFacade.findByIdUsuario(u);
                    if (iuReturn != null) {
                        /*
                        InformacionUsuarioVO informacionUsuarioVOReturn = new InformacionUsuarioVO();

                        informacionUsuarioVOReturn.setNombresInfoUsuario(iuReturn.getNombresInfoUsuario());
                        informacionUsuarioVOReturn.setApellidosInfoUsuario(iuReturn.getApellidosInfoUsuario());
                        if (iuReturn.getFechaNacInfoUsuario() != null) {
                            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                            String s = formatter.format(iuReturn.getFechaNacInfoUsuario());
                            informacionUsuarioVOReturn.setFechaNacInfoUsuario(s);
                        } else {
                            informacionUsuarioVOReturn.setFechaNacInfoUsuario(null);
                        }
                        informacionUsuarioVOReturn.setPaisInfoUsuario(iuReturn.getPaisInfoUsuario());
                        informacionUsuarioVOReturn.setDptoInfoUsuario(iuReturn.getDptoInfoUsuario());
                        informacionUsuarioVOReturn.setCiudadInfoUsuario(iuReturn.getCiudadInfoUsuario());
                        informacionUsuarioVOReturn.setDireccionInfoUsuario(iuReturn.getDireccionInfoUsuario());
                        informacionUsuarioVOReturn.setTelefonoInfoUsuario(iuReturn.getTelefonoInfoUsuario());
                        informacionUsuarioVOReturn.setGeneroInfoUsuario(iuReturn.getGeneroInfoUsuario());
                        informacionUsuarioVOReturn.setCorreoElectronico(u.getEmailInfoUsuario());
                        informacionUsuarioVOReturn.setIdUsuario(u.getIdUsuario());

                        List<UsuarioPaquete> usuarioPaquetes = u.getUsuarioPaqueteList();
                        if (usuarioPaquetes != null && !usuarioPaquetes.isEmpty()) {
                            Date dateHoy = new Date();
                            long tiempoTotalRestante = 0;
                            for (UsuarioPaquete usuarioPaquete : usuarioPaquetes) {
                                Date dateUltimoPago = usuarioPaquete.getUltimoPago();
                                long diff = dateHoy.getTime() - dateUltimoPago.getTime();
                                long tiempoRestante = usuarioPaquete.getVigenciaPaquete() - TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                                if (tiempoRestante > 0) {
                                    tiempoTotalRestante += tiempoRestante;
                                }
                            }
                            informacionUsuarioVOReturn.setFechaLimitePaquete(tiempoTotalRestante);
                        } else {
                            informacionUsuarioVOReturn.setFechaLimitePaquete(0);
                        }*/
                        UsuarioVO usuVO = new UsuarioVO();
                        usuVO.setIdUsuario(informacionUsuarioVO.getIdUsuario());
                        return getInfoUsuario(usuVO);
                    } else {
                        return Util.getError(ErroresRespuesta.INFOUSUARIOEDIT_ERROR_3);
                    }
                } else {

                    iu.setNombresInfoUsuario(informacionUsuarioVO.getNombresInfoUsuario());
                    iu.setApellidosInfoUsuario(informacionUsuarioVO.getApellidosInfoUsuario());
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                    Date date = format.parse(informacionUsuarioVO.getFechaNacInfoUsuario());
                    iu.setFechaNacInfoUsuario(date);
                    iu.setPaisInfoUsuario(informacionUsuarioVO.getPaisInfoUsuario());
                    iu.setDptoInfoUsuario(informacionUsuarioVO.getDptoInfoUsuario());
                    iu.setCiudadInfoUsuario(informacionUsuarioVO.getCiudadInfoUsuario());
                    iu.setDireccionInfoUsuario(informacionUsuarioVO.getDireccionInfoUsuario());
                    iu.setTelefonoInfoUsuario(informacionUsuarioVO.getTelefonoInfoUsuario());
                    iu.setGeneroInfoUsuario(informacionUsuarioVO.getGeneroInfoUsuario());

                    informacionUsuarioFacade.edit(iu);

                    UsuarioLog usuarioLog = new UsuarioLog();
                    usuarioLog.setConceptoUsuarioLog("Usuario modifico informacion");
                    usuarioLog.setIdUsuarioFk(u);
                    usuarioLog.setDateEventoUsuarioLog(new Date());
                    usuarioLogFacade.create(usuarioLog);

                    InformacionUsuario iuReturn = informacionUsuarioFacade.findByIdUsuario(u);
                    if (iuReturn != null) {
                        /*  InformacionUsuarioVO informacionUsuarioVOReturn = new InformacionUsuarioVO();

                        informacionUsuarioVOReturn.setNombresInfoUsuario(iuReturn.getNombresInfoUsuario());
                        informacionUsuarioVOReturn.setApellidosInfoUsuario(iuReturn.getApellidosInfoUsuario());

                        if (iuReturn.getFechaNacInfoUsuario() != null) {
                            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                            String s = formatter.format(iuReturn.getFechaNacInfoUsuario());
                            informacionUsuarioVOReturn.setFechaNacInfoUsuario(s);
                        } else {
                            informacionUsuarioVOReturn.setFechaNacInfoUsuario(null);
                        }
                        informacionUsuarioVOReturn.setPaisInfoUsuario(iuReturn.getPaisInfoUsuario());
                        informacionUsuarioVOReturn.setDptoInfoUsuario(iuReturn.getDptoInfoUsuario());
                        informacionUsuarioVOReturn.setCiudadInfoUsuario(iuReturn.getCiudadInfoUsuario());
                        informacionUsuarioVOReturn.setDireccionInfoUsuario(iuReturn.getDireccionInfoUsuario());
                        informacionUsuarioVOReturn.setTelefonoInfoUsuario(iuReturn.getTelefonoInfoUsuario());
                        informacionUsuarioVOReturn.setGeneroInfoUsuario(iuReturn.getGeneroInfoUsuario());
                        informacionUsuarioVOReturn.setCorreoElectronico(u.getEmailInfoUsuario());
                        informacionUsuarioVOReturn.setIdUsuario(u.getIdUsuario());

                        List<UsuarioPaquete> usuarioPaquetes = u.getUsuarioPaqueteList();
                        if (usuarioPaquetes != null && !usuarioPaquetes.isEmpty()) {
                            Date dateHoy = new Date();
                            long tiempoTotalRestante = 0;
                            for (UsuarioPaquete usuarioPaquete : usuarioPaquetes) {
                                Date dateUltimoPago = usuarioPaquete.getUltimoPago();
                                long diff = dateHoy.getTime() - dateUltimoPago.getTime();
                                long tiempoRestante = usuarioPaquete.getVigenciaPaquete() - TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                                if (tiempoRestante > 0) {
                                    tiempoTotalRestante += tiempoRestante;
                                }
                            }
                            informacionUsuarioVOReturn.setFechaLimitePaquete(tiempoTotalRestante);
                        } else {
                            informacionUsuarioVOReturn.setFechaLimitePaquete(0);
                        }*/

                        UsuarioVO usuVO = new UsuarioVO();
                        usuVO.setIdUsuario(informacionUsuarioVO.getIdUsuario());
                        return getInfoUsuario(usuVO);
                    } else {
                        return Util.getError(ErroresRespuesta.INFOUSUARIOEDIT_ERROR_3);
                    }

                }

            } else {
                return Util.getError(ErroresRespuesta.INFOUSUARIOEDIT_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.INFOUSUARIOEDIT_ERROR_1)
                    .build();
        }
    }

    public Respuesta crearCodigos(UsuarioCodesVO usuarioCodesVO) {
        try {
            Usuario usuario = usuarioFacade.find(usuarioCodesVO.getIdUsuario());

            if (usuario != null && usuario.getIdRolUsuario().getIdRolUsuario() < 3 && usuario.getIdRolUsuario().getIdRolUsuario() != 2) {

                int cant = usuarioCodesVO.getCantidad();
                int tamanoString = usuarioCodesVO.getTamanoStringAGenerar();
                int paquete = usuarioCodesVO.getPaquete();
                if (cant <= 0) {
                    cant = 1;
                }
                if (tamanoString <= 0) {
                    tamanoString = 13;
                }
                if (paquete <= 0) {
                    paquete = 3;
                }
                for (int i = 1; i <= cant; i++) {
                    CodigosActivacion ca = new CodigosActivacion();
                    ca.setCodigoActivacion(new RandomString(tamanoString).nextString());
                    ca.setIdPaquete(paqueteFacade.find(paquete));
                    ca.setCodigoIsRedeemed(0);
                    codigosActivacionFacade.create(ca);
                }
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.CREARCODES_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.CREARCODES_ERROR_1)
                    .build();
        }

    }

    public Respuesta enviarMailPrueba() {

        try {
            /*        List<Usuario> usuarios = usuarioFacade.findAll();
            Date date = new Date();
            for (Usuario usuario : usuarios) {
                UsuarioPaquete up = new UsuarioPaquete();
                up.setIdPaquete(paqueteFacade.find(2));
                up.setIdUsuario(usuario);
                up.setVigenciaPaquete(2);
                up.setUltimoPago(date);
                usuarioPaqueteFacade.create(up);
            }*/
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("SUCCESS!").build();
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.ENVIAR_MAIL_PRUEBA_ERROR_1)
                    .build();
        }
    }

    public int verificarTokenCorreo(String tokenCorreo) {
        try {
            Usuario usuario = usuarioFacade.findByTokenActivar(tokenCorreo);

            if (usuario != null) {
                if (usuario.getCorreoConfirmado() == 0) {
                    usuario.setCorreoConfirmado(1);
                    usuarioFacade.edit(usuario);
                    return 3; // Usuario Activado Correctamente.
                } else {
                    return 2; //Usuario ya activo correo
                }
            } else {
                return 1; //Token no figura
            }
        } catch (Exception e) {
            return 0; //Error general
        }

    }

    public Respuesta reenviarCorreoVerificacion(UsuarioVO usuarioVO) {
        try {
            Usuario u = usuarioFacade.findCorreoElectronico(usuarioVO.getEmailInfoUsuario());

            if (u != null) {
                String tokenCorreo = u.getTokenConfirmarCorreo();
                String correoContenido = "<img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/headcorreo.png\"/>"
                        + "<br/><br/><h1>Bienvenido a ANDA</h1>"
                        + "<br/><br/><h2> Gracias por registrarte.</h2>"
                        + "<br/><br/> Sigue este link para activar tu cuenta:"
                        + "<br/> <a href=\"https://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "\">https://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "</a>"
                        + "<br/><br/> Si no puedes visitar el link copia y pega este texto en el navegador."
                        + "<br/><p style=\"font-size: 10px;\">https://www.humanbionics.co.uk:55411/AndaWeb4/api/v1/activarCuenta.jsp?t=" + tokenCorreo + "</p>"
                        + "<br/><br/><img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/piefirmacorreo.png\"/>";
                new EnviarMail().sendwithMessage("Reenvio de correo: Verificacion", correoContenido, u.getEmailInfoUsuario());
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.REENVIARCORREOTOKEN_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.REENVIARCORREOTOKEN_ERROR_1)
                    .build();
        }
    }

    public Respuesta enviarContrasenaCorreo(UsuarioVO usuarioVO) {
        try {
            Usuario u = usuarioFacade.findCorreoElectronico(usuarioVO.getEmailInfoUsuario());

            if (u != null) {
                u.setTokenRecuperarContrasena(new RandomString(45).nextString());
                usuarioFacade.edit(u);
                String correoContenido = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>"
                        + "<html xmlns=\"http://www.w3.org/1999/xhtml\">"
                        + "<body style=\"margin:0;padding:0;\">"
                        + "<img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/headcorreo.png\"/>"
                        + "<br/><br/><h1>Recuperaci&oacute;n de contrase&ntilde;a</h1>"
                        + "<br/><br/>Se ha enviado esta informaci&oacute;n a tu correo, si no has sido tu ignora este mensaje."
                        + "<br/><br/>"
                        + "<br/><br/>Usuario:"
                        + "<br/><br/>" + u.getEmailInfoUsuario() + ""
                        + "<br/><br/>Link de recuperaci&oacute;n de Contrase&ntilde;a: "
                        + "<br/> <a href=\"https://www.humanbionics.co.uk:55411/AndaWeb4/recuperarContrasena.jsp?t=" + u.getTokenRecuperarContrasena() + "\">https://www.humanbionics.co.uk:55411/AndaWeb4/recuperarContrasena.jsp?t=" + u.getTokenRecuperarContrasena() + " </a>"
                        + "<br/><br/><img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/piefirmacorreo.png\"/>"
                        + "</body>"
                        + "</html>";
                new EnviarMail().sendwithMessage("Recuperación de Contraseña: Usuario", correoContenido, u.getEmailInfoUsuario());
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.ENVIARCONTRASENA_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.ENVIARCONTRASENA_ERROR_1)
                    .build();
        }
    }

    public Paquete getPaquete(int packID) {
        return paqueteFacade.findActive(packID);
    }

    public Respuesta getInfoPromo() {
        try {

            AppInfoPromo aip = appInfoPromoFacade.find(1);

            if (aip != null) {

                AppInfoPromoVO aipvo = new AppInfoPromoVO();

                aipvo.setDescInfoPromo(aip.getDescInfoPromo());
                aipvo.setPromoActiva(aip.getPromoActiva());
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(aipvo).build();
            } else {
                return Util.getError(ErroresRespuesta.GETINFOPROMO_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GETINFOPROMO_ERROR_1)
                    .build();
        }
    }

    public Respuesta registrarCompraGoogle(CompraGoogleVO compraGoogleVO) {

        try {

            Usuario u = usuarioFacade.find(compraGoogleVO.getIdUsuario());

            if (u != null) {

                Paquete p = paqueteFacade.findByGoogle_inAppPurchaseID(compraGoogleVO.getGoogleIdInAppPurchase());

                if (p != null) {
                    Date date = new Date();
                    Invoice invoice = new Invoice();
                    invoice.setFechaRealizadoInvoice(date);
                    invoice.setGoogleOrderId(compraGoogleVO.getGoogleOrderID());
                    invoice.setIdUsuario(u);
                    invoice.setEstadoCompra(4); // 0 pendiente 1 procesando 2 cancelado 3 reembolsado 4 pagado
                    invoice.setTotalInvoice(p.getPrecioPaquete());

                    invoiceFacade.create(invoice);

                    InvoicePaquete invoicePaquete = new InvoicePaquete();
                    invoicePaquete.setIdInvoice(invoice);
                    invoicePaquete.setIdPaquete(p);
                    invoicePaquete.setPrecioPaquete(p.getPrecioPaquete());
                    invoicePaquete.setVigenciaPaquete(p.getVigenciaPaquete());

                    invoicePaqueteFacade.create(invoicePaquete);

                    UsuarioPaquete usuarioPaquete = new UsuarioPaquete();
                    usuarioPaquete.setIdUsuario(u);
                    usuarioPaquete.setIdPaquete(p);
                    usuarioPaquete.setUltimoPago(date);
                    usuarioPaquete.setVigenciaPaquete(p.getVigenciaPaquete());

                    usuarioPaqueteFacade.create(usuarioPaquete);

                    ComprasLog comprasLog = new ComprasLog();
                    comprasLog.setDescripcionComprasLog("Compra Efectiva desde Google");
                    comprasLog.setFechaComprasLog(new Date());
                    comprasLog.setIdUsuario(u);

                    comprasLogFacade.create(comprasLog);

                    String correoContenido = "<img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/headcorreo.png\"/>"
                            + "<br/><br/><h1>Gracias.</h1>"
                            + "<br/>Has realizado una compra desde la aplicaci&oacute;n <a href=\"https://play.google.com/store/apps/details?id=com.hmb.humanbionics.andabasic\">Anda Basic</a> de <a href=\"https://www.hubionics.com/\">Human Bionics SAS</a>"
                            + "<br/><br/>"
                            + "<br/><br/><h3>ID de compra: " + compraGoogleVO.getGoogleOrderID() + " -#- ( " + invoice.getIdInvoice() + " )</h3>"
                            + "<br/><h3>Fecha de compra: " + date + "</h3>"
                            + "<br/><br/>Descripci&oacute;n: " + p.getDescPaquete()
                            + "<br/><br/>Item: \"" + p.getTituloPaquete() + "\""
                            + "<br/><br/>Duraci&oacute;n: <b>" + p.getVigenciaPaquete() + " D&iacute;as</b>"
                            + "<br/><br/>"
                            + "<hr>"
                            + "Preguntas? Cont&aacute;ctate con nosotros a <a href=\"mailto:info@hubionics.com\">info@hubionics.com</a>"
                            + "<br/> Human Bionics SAS &copy; 2018 &copy; Todos los derechos reservados. "
                            + "<br/><br/><img src=\"https://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/piefirmacorreo.png\"/>";
                    new EnviarMail().sendwithMessage("Recibo de compra - Anda Basic", correoContenido, u.getEmailInfoUsuario());
                    SendNotification.newPurchaseRegistered();
                    return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
                } else {

                    ComprasLog comprasLog = new ComprasLog();
                    comprasLog.setDescripcionComprasLog("Error: " + ErroresRespuesta.REGISTRAR_COMPRA_GOOGLE_ERROR_2 + " procesando compra con id " + compraGoogleVO.getGoogleIdInAppPurchase());
                    comprasLog.setFechaComprasLog(new Date());
                    comprasLog.setIdUsuario(u);

                    comprasLogFacade.create(comprasLog);
                    SendNotification.newPurchaseError(compraGoogleVO.getGoogleIdInAppPurchase());
                    return Util.getError(ErroresRespuesta.REGISTRAR_COMPRA_GOOGLE_ERROR_3);

                }
            } else {
                ComprasLog comprasLog = new ComprasLog();
                comprasLog.setDescripcionComprasLog("Error: " + ErroresRespuesta.REGISTRAR_COMPRA_GOOGLE_ERROR_2 + "procesando compra con id " + compraGoogleVO.getGoogleIdInAppPurchase());
                comprasLog.setFechaComprasLog(new Date());
                comprasLog.setIdUsuario(u);
                comprasLogFacade.create(comprasLog);
                SendNotification.newPurchaseError(compraGoogleVO.getGoogleIdInAppPurchase());
                return Util.getError(ErroresRespuesta.REGISTRAR_COMPRA_GOOGLE_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.REGISTRAR_COMPRA_GOOGLE_ERROR_1)
                    .build();
        }
    }

    public Respuesta verificarTokenFireBase(UsuarioVO usuarioVO) {

        try {
            Usuario u = usuarioFacade.find(usuarioVO.getIdUsuario());

            if (u != null) {
                if (u.getFirebaseToken() == null || !u.getFirebaseToken().equals(usuarioVO.getFirebaseToken())) {
                    u.setFirebaseToken(usuarioVO.getFirebaseToken());
                    usuarioFacade.edit(u);
                }
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.VERIFICAR_TOKEN_FIREBASE_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.VERIFICAR_TOKEN_FIREBASE_ERROR_1)
                    .build();
        }
    }

    public Respuesta getSonidosKey(/*AppVO appVO*/) {

        //TODO REALIZAR VERIFICACION OBLIGATORIA DE LA PROCEDENCIA DE LA CONSULTA (APP ANDA)
        try {
            KeyVault keyVault = keyVaultFacade.find(1);

            if (keyVault != null) {
                KeyVaultVO keyVaultVO = new KeyVaultVO();
                keyVaultVO.setSecretKey(keyVault.getSecretKey());
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(keyVaultVO).build();
            } else {
                return Util.getError(ErroresRespuesta.GET_SONIDOS_KEY_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_SONIDOS_KEY_ERROR_1)
                    .build();
        }

    }

    public Respuesta updateLastLogin(UsuarioVO usuarioVO) {
        try {
            Usuario u = usuarioFacade.find(usuarioVO.getIdUsuario());

            if (u != null) {

                u.setUsuarioLastLogin(new Date());
                usuarioFacade.edit(u);
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.UPDATE_LAST_LOGIN_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.UPDATE_LAST_LOGIN_ERROR_1)
                    .build();
        }
    }

    public Respuesta sendRequirement(ReportVO reportVO) {
        try {
            Usuario u = usuarioFacade.find(reportVO.getUserID());

            if (u != null) {

                AndaRequirements andaRequirements = new AndaRequirements();

                andaRequirements.setIdUsuario(u);
                andaRequirements.setDescripcionRequirement(reportVO.getRequerimiento());
                andaRequirements.setFechaRequirement(new Date());
                andaRequirements.setEstadoRequirement(0);

                andaRequirementsFacade.create(andaRequirements);
                SendNotification.newRequirement();
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.SEND_REQUIREMENT_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.SEND_REQUIREMENT_ERROR_1)
                    .build();
        }
    }

    public Respuesta sendDatosMedicos(DatosMedicosVo datosMedicosVO) {

        try {
            Usuario u = usuarioFacade.find(datosMedicosVO.getId_usuario());

            if (u != null) {

                UsuarioDatosMedicos usuarioDatosMedicos = new UsuarioDatosMedicos();
                usuarioDatosMedicos.setFechaDato(new Date());
                usuarioDatosMedicos.setIdUsuario(u);

                usuarioDatosMedicos.setPesoDato(datosMedicosVO.getPeso());
                usuarioDatosMedicos.setImcDato(datosMedicosVO.getImc());
                usuarioDatosMedicos.setCircunferenciaPantorrillaDato(datosMedicosVO.getCircun_pantorrilla());
                usuarioDatosMedicos.setPerimetroMusloDato(datosMedicosVO.getPerimetro_muslo());

                usuarioDatosMedicosFacade.create(usuarioDatosMedicos);

                if (datosMedicosVO.getEstatura() != 0) {
                    InformacionUsuario iu = informacionUsuarioFacade.find(u.getIdUsuario());
                    iu.setEstaturaInfoUsuario(datosMedicosVO.getEstatura());
                    informacionUsuarioFacade.edit(iu);
                }

                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("").build();
            } else {
                return Util.getError(ErroresRespuesta.SEND_DATOS_MEDICOS_ERROR_2);
            }

        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.SEND_DATOS_MEDICOS_ERROR_1)
                    .build();
        }
    }

    public Respuesta getDatosMedicos(UsuarioVO usuarioVO) {

        try {
            UsuarioDatosMedicos udm = usuarioDatosMedicosFacade.findByIdUsuarioWhereLastDate(usuarioFacade.find(usuarioVO.getIdUsuario()));

            if (udm != null) {

                DatosMedicosVo datosMedicosVO = new DatosMedicosVo();

                datosMedicosVO.setPeso(udm.getPesoDato());
                datosMedicosVO.setImc(udm.getImcDato());

                InformacionUsuario informacionUsuario = informacionUsuarioFacade.findByIdUsuario(usuarioFacade.find(usuarioVO.getIdUsuario()));

                if (informacionUsuario != null) {
                    datosMedicosVO.setEstatura(informacionUsuario.getEstaturaInfoUsuario());
                }
                datosMedicosVO.setCircun_pantorrilla(udm.getCircunferenciaPantorrillaDato());
                datosMedicosVO.setPerimetro_muslo(udm.getPerimetroMusloDato());
                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(datosMedicosVO).build();
            } else {
                return Util.getError(ErroresRespuesta.GET_DATOS_MEDICOS_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_DATOS_MEDICOS_ERROR_1)
                    .build();
        }
    }

    public int getCuentaByToken(String token) {
        try {
            Usuario usuario = usuarioFacade.findByTokenRecuperar(token);

            if (usuario != null) {

                return 2; //Usuario va a recuperar contrasena

            } else {
                return 1; //Token no figura
            }
        } catch (Exception e) {
            return 0; //Error general
        }
    }

    public int setNewPwd(String token, String pwd1, String pwd2) {
        try {
            Usuario usuario = usuarioFacade.findByTokenRecuperar(token);

            if (usuario != null) {

                if (pwd1.equals(pwd2)) {
                    if (!usuario.getPasswdUsuario().equals(pwd1)) {
                        usuario.setPasswdUsuario(HashEncryption.getHashedTry2(pwd1));
                        usuario.setTokenRecuperarContrasena("");
                        usuarioFacade.edit(usuario);
                        return 4; //password cambiado correctamente
                    } else {
                        return 3; //password no puede ser igual que el anterior
                    }

                } else {
                    return 2; //passwords no coinciden
                }

            } else {
                return 1; //Token no figura
            }
        } catch (Exception e) {
            return 0; //Error general
        }
    }

    public Respuesta getDatosMedicosChart(UsuarioVO usuarioVO) {
        try {
            List<UsuarioDatosMedicos> udm = usuarioDatosMedicosFacade.findByIdUsuario(usuarioVO.getIdUsuario());

            if (udm != null) {
                List<DatosMedicosChartVo> chartVOs = new ArrayList<>();
                for (UsuarioDatosMedicos udm1 : udm) {
                    DatosMedicosChartVo datosMedicosChartVO = new DatosMedicosChartVo();

                    datosMedicosChartVO.setFechaDato(udm1.getFechaDato());
                    datosMedicosChartVO.setPesoDato(udm1.getPesoDato());
                    datosMedicosChartVO.setImcDato(udm1.getImcDato());
                    datosMedicosChartVO.setCircunferenciaPantorrillaDato(udm1.getCircunferenciaPantorrillaDato());
                    datosMedicosChartVO.setPerimetroMusloDato(udm1.getPerimetroMusloDato());

                    chartVOs.add(datosMedicosChartVO);
                }

                return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data(chartVOs).build();
            } else {
                return Util.getError(ErroresRespuesta.GET_DATOS_MEDICOS_CHART_ERROR_2);
            }
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.GET_DATOS_MEDICOS_CHART_ERROR_1)
                    .build();
        }
    }
}
