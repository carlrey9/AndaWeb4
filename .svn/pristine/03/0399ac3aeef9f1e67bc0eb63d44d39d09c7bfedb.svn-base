/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.facade;

import com.hubionics.anda.web.entity.Paquete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hubio
 */
@Stateless
public class PaqueteFacade extends AbstractFacade<Paquete> {

    @PersistenceContext(unitName = "AndaWeb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaqueteFacade() {
        super(Paquete.class);
    }
    
    public Paquete findActive(int packID) {
        try {
            Query q = getEntityManager().createQuery("SELECT p FROM Paquete p WHERE p.idPaquete = :idpa AND p.paqueteActivo = 1");
            q.setParameter("idpa", packID);
            return (Paquete) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public Paquete findByGoogle_inAppPurchaseID(String GoogleInAppPurchaseID) {
        try {
            Query q = getEntityManager().createQuery("SELECT p FROM Paquete p WHERE p.idinappPurchasegoogle = :giappid");
            q.setParameter("giappid", GoogleInAppPurchaseID);
            return (Paquete) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
