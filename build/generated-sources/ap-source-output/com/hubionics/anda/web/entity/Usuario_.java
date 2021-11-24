package com.hubionics.anda.web.entity;

import com.hubionics.anda.web.entity.AndaRequirements;
import com.hubionics.anda.web.entity.CodigosActivacion;
import com.hubionics.anda.web.entity.ComprasLog;
import com.hubionics.anda.web.entity.InformacionUsuario;
import com.hubionics.anda.web.entity.Invoice;
import com.hubionics.anda.web.entity.Metricasanda;
import com.hubionics.anda.web.entity.RolUsuario;
import com.hubionics.anda.web.entity.UsuarioDatosMedicos;
import com.hubionics.anda.web.entity.UsuarioLog;
import com.hubionics.anda.web.entity.UsuarioPaquete;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-24T10:00:34")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, InformacionUsuario> informacionUsuarioList;
    public static volatile ListAttribute<Usuario, UsuarioDatosMedicos> usuarioDatosMedicosList;
    public static volatile SingularAttribute<Usuario, Date> fechaCreacionUsuario;
    public static volatile SingularAttribute<Usuario, Date> usuarioLastLogin;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile ListAttribute<Usuario, UsuarioPaquete> usuarioPaqueteList;
    public static volatile ListAttribute<Usuario, Metricasanda> metricasandaList;
    public static volatile ListAttribute<Usuario, AndaRequirements> andaRequirementsList;
    public static volatile SingularAttribute<Usuario, RolUsuario> idRolUsuario;
    public static volatile SingularAttribute<Usuario, String> idDevice;
    public static volatile ListAttribute<Usuario, ComprasLog> comprasLogList;
    public static volatile SingularAttribute<Usuario, String> facebookuserID;
    public static volatile SingularAttribute<Usuario, String> emailInfoUsuario;
    public static volatile ListAttribute<Usuario, Invoice> invoiceList;
    public static volatile ListAttribute<Usuario, CodigosActivacion> codigosActivacionList;
    public static volatile SingularAttribute<Usuario, Integer> correoConfirmado;
    public static volatile SingularAttribute<Usuario, String> firebaseToken;
    public static volatile ListAttribute<Usuario, UsuarioLog> usuarioLogList;
    public static volatile SingularAttribute<Usuario, Integer> usuarioActivo;
    public static volatile SingularAttribute<Usuario, String> tokenRecuperarContrasena;
    public static volatile SingularAttribute<Usuario, String> tokenConfirmarCorreo;
    public static volatile SingularAttribute<Usuario, String> passwdUsuario;

}