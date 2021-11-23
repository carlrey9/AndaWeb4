/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.facade;

import com.hubionics.anda.web.entity.UsuarioPaquete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hubio
 */
@Stateless
public class UsuarioPaqueteFacade extends AbstractFacade<UsuarioPaquete> {

    @PersistenceContext(unitName = "AndaWeb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioPaqueteFacade() {
        super(UsuarioPaquete.class);
    }

    public UsuarioPaquete findByIdUsuario(int idUSuario) {
        try {
            Query q = getEntityManager().createQuery("SELECT u FROM UsuarioPaquete u WHERE u.idUsuario = :id");
            q.setParameter("id", idUSuario);
            return (UsuarioPaquete) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
