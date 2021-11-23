/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.facade;

import com.hubionics.anda.web.entity.Usuario;
import com.hubionics.anda.web.entity.UsuarioDatosMedicos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hubio
 */
@Stateless
public class UsuarioDatosMedicosFacade extends AbstractFacade<UsuarioDatosMedicos> {

    @PersistenceContext(unitName = "AndaWeb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDatosMedicosFacade() {
        super(UsuarioDatosMedicos.class);
    }

    public UsuarioDatosMedicos findByIdUsuarioWhereLastDate(Usuario IDusuario) {
        try {

            Query q = getEntityManager().createQuery("SELECT UDM FROM UsuarioDatosMedicos UDM WHERE UDM.idUsuario = :idUsu ORDER BY UDM.fechaDato DESC");
            q.setParameter("idUsu", IDusuario);
            q.setMaxResults(1);
            return (UsuarioDatosMedicos) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    public List<UsuarioDatosMedicos> findByIdUsuario(int IDusuario){
        try {
            Query q = getEntityManager().createQuery("SELECT udmm FROM UsuarioDatosMedicos udmm WHERE udmm.idUsuario.idUsuario = :idUsu");
            q.setParameter("idUsu", IDusuario);
            return  q.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
