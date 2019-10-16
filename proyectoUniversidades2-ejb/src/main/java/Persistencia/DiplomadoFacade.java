/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.DiplomadoFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.Diplomado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DAVID
 */
@Stateless
public class DiplomadoFacade extends AbstractFacade<Diplomado> implements DiplomadoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_proyectoUniversidades2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiplomadoFacade() {
        super(Diplomado.class);
    }
    
}
