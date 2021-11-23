/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.business;

import com.hubionics.anda.web.api.ErroresRespuesta;
import com.hubionics.anda.web.api.Respuesta;
import com.hubionics.anda.web.entity.CodigosActivacion;
import com.hubionics.anda.web.entity.Usuario;
import com.hubionics.anda.web.entity.vo.UsuarioCodesVO;
import com.hubionics.anda.web.facade.CodigosActivacionFacade;
import com.hubionics.anda.web.facade.PaqueteFacade;
import com.hubionics.anda.web.facade.UsuarioFacade;
import com.hubionics.anda.web.util.RandomString;
import com.hubionics.anda.web.util.Util;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class AdminDbManager {

    @EJB
    UsuarioFacade usuarioFacade;

    @EJB
    PaqueteFacade paqueteFacade;

    @EJB
    CodigosActivacionFacade codigosActivacionFacade;

    public Respuesta crearCodigos(UsuarioCodesVO usuarioCodesVO) {
        try {
            Usuario usuario = usuarioFacade.find(usuarioCodesVO.getIdUsuario());

            if (usuario != null && usuario.getIdRolUsuario().getIdRolUsuario() < 3) {

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
            /*    String tokenCorreo = new RandomString(128).nextString();
            String correoContenido = "<img src=\"http://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/headcorreo.png\"/>"
            + "<br/><br/><h1>Bienvenido a ANDA</h1>"
            + "<br/><br/><h2> Gracias por registrarte.</h2>"
            + "<br/><br/> Sigue este link para activar tu cuenta:"
            + "<br/> <a href=\"http://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "\">http://www.humanbionics.co.uk:55411/AndaWeb4/activarCuenta.jsp?t=" + tokenCorreo + "</a>"
            + "<br/><br/> Si no puedes visitar el link copia y pega este texto en el navegador."
            + "<br/>http://www.humanbionics.co.uk:55411/AndaWeb4/api/v1/activarCuenta.jsp?t=" + tokenCorreo + ""
            + "<br/><br/><img src=\"http://www.humanbionics.co.uk:55411/AndaWeb4/resources/img/piefirmacorreo.png\"/>";
            new EnviarMail().sendwithMessage("Registro: Nuevo Usuario", correoContenido, "rokwan@hotmail.com"
            /*usuarioVO.getEmailInfoUsuario());*/
          /*  String FILENAME = "/opt/glassfish4/glassfish/domains/domain1/config/logs/error4.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));

            String content = "This is the content to write into file\n";
            bw.write(content);*/
            // no need to close it.
            //bw.close();
            return new Respuesta.Builder().status(Respuesta.SUCCESS).errorCode(ErroresRespuesta.OK).data("SUCCESS!").build();
        } catch (Exception e) {
            return new Respuesta.Builder().status(Respuesta.ERROR)
                    .errorCode(ErroresRespuesta.ENVIAR_MAIL_PRUEBA_ERROR_1)
                    .build();
        }
    }

}
