/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.facade;

import com.hubionics.anda.web.entity.Usuario;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hubio
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "AndaWeb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Usuario findCorreoElectronico(String emailInfoUsuario) {
        try {
            Query q = getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.emailInfoUsuario = :mail");
            q.setParameter("mail", emailInfoUsuario);
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Usuario> findIdDevice(String idDeviceInfoUsuario) {
        try {
            Query q = getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.idDevice = :idDevice");
            q.setParameter("idDevice", idDeviceInfoUsuario);
            return  q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public Usuario findByFacebookID(String idFb) {
        try {
            Query q = getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.facebookuserID = :userfb");
            q.setParameter("userfb", idFb);
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Usuario findByTokenActivar(String tokenCorreo) {
        try {
            Query q = getEntityManager().createQuery("SELECT us FROM Usuario us WHERE us.tokenConfirmarCorreo = :tokenUSer");
            q.setParameter("tokenUSer", tokenCorreo);
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    public Usuario findByTokenRecuperar(String tokenCorreo) {
        try {
            Query q = getEntityManager().createQuery("SELECT us FROM Usuario us WHERE us.tokenRecuperarContrasena = :tokenUSer");
            q.setParameter("tokenUSer", tokenCorreo);
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
