/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.facade;
import com.hubionics.anda.web.entity.AndaRequirements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author hubio
 */
@Stateless
public class AndaRequirementsFacade extends AbstractFacade<AndaRequirements> {

    @PersistenceContext(unitName = "AndaWeb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AndaRequirementsFacade() {
        super(AndaRequirements.class);
    }
    
}
