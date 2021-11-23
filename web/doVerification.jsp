<%-- 
    Document   : doVerification
    Created on : 31/01/2018, 11:48:19 AM
    Author     : hubio
--%>
<%@page import="com.hubionics.anda.web.controller.RecuperarContrasenaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="/AndaWeb4/resources/style/style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Verificaci&oacute;n Correo - Anda Basic</title>
    </head>
    <body>
        <div class="container body-colordark">
            <div class="header-bg">
                <div class="left">
                    <img class="logo-head" width="150" height="150" src="/AndaWeb4/resources/img/andalogo.png" />
                </div>
            </div>
            <div style="min-height: 300px">
                <div class="page-header ">
                    <h1 class="bold-titulo">Verificación de cuenta</h1>
                </div>
                <%
                    RecuperarContrasenaController recuperarContrasenaController = new RecuperarContrasenaController();

                    int valueReturn = recuperarContrasenaController.verifyNewPasswd(
                            request.getParameter("tokenpass"), request.getParameter("pwd"), request.getParameter("confirmpwd"));
                    switch (valueReturn) {
                        case 0:
                            out.print("<p class=\"bg-danger tamano-info\">No se pudo verificar la cuenta, envíanos un correo a <a href=\"mailto:info@hubionics.com\">info@hubioncs.com</a> con tus datos para ayudarte.</p>");
                            break;
                        case 1:
                            out.print("<p class=\"bg-danger tamano-info\">Token inválido, env&iacute;anos un correo a <a href=\"mailto:info@hubionics.com\">info@hubioncs.com</a> con tus datos para ayudarte.</p>");
                            break;
                        case 2:
                            out.print("<p class=\"bg-danger tamano-info\">Los campos no coinciden.</p>");
                            break;
                        case 3:
                            out.print("<p class=\"bg-danger tamano-info\">La contrase&ntilde;a no puede ser igual a la antigua.</p>");
                            break;
                        case 4:
                            out.print("<p class=\"bg-success tamano-info\">Contrase&ntilde;a cambiada satisfactoriamente.</p>");
                            break;
                        default:
                            out.print("<p class=\"bg-danger tamano-info\">Error general, intenta de nuevo más tarde.</p>");
                    }

                %>

            </div>

            <div class="footer-bg" >
                <div class="text-center">

                    <img class="logo-footer" width="250" height="75" src="/AndaWeb4/resources/img/footerinfo.png" />
                    <br>
                    Anda Basic by Human Bionics SAS &copy; 2018 &copy; Todos los derechos reservados. 
                </div>
            </div>
        </div>
    </body>
</html>
