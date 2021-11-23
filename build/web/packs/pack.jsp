<%-- 
    Document   : pack
    Created on : 9/01/2018, 12:23:46 PM
    Author     : hubio
--%>
<%@page import="com.hubionics.anda.web.entity.Paquete"%>
<%@page import="com.hubionics.anda.web.controller.MostrarPackController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    MostrarPackController mpc = new MostrarPackController();
    Paquete pack = mpc.getPack(Integer.parseInt(request.getParameter("id")));
    if (pack != null) {


%>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="/AndaWeb4/resources/style/style.css"/>
        <title><% out.print(pack.getTituloPaquete()); %> - Anda Basic</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container">
            <div class="text-center" id="containerimg">
                <div class="text-center">
                    <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                        <input type="hidden" name="cmd" value="_s-xclick" /> 
                        <input type="hidden" name="hosted_button_id" value="<% out.print(pack.getUrlPagoPaquete()); %>" />
                        <input type="image"  src="https://image.jimcdn.com/app/cms/image/transf/none/path/s3b9877d328d1f85c/image/i409bc359f50f110f/version/1513202300/image.png"
                               width="206" height="58" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet." />
                        <img alt="" border="0" src="https://www.paypalobjects.com/es_ES/i/scr/pixel.gif" width="1" height="1"  style="
                             margin-top: 16px;"/>
                    </form>
                </div>
                <div  class="image-container"  style="
                      margin-top: 15px;">
                    <img  class="img-responsive" width="325" height="580" alt="" src="<% out.print(pack.getUrlImgPaquete()); %> "/>
                </div>

            </div>
        </div>
    </body>
</html>
<%
} else {
%>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="/AndaWeb4/resources/style/style.css"/>
        <title>No se encontro el paquete solicitado - Anda Basic</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container">
            <h1>No se encontro el paquete solicitado</h1>
        </div>
    </body>
</html>
<%
    }
%>