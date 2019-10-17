/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.DiplomadoFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.Diplomado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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

    @Override
    public List<Diplomado> findNombre() {
               TypedQuery<Diplomado> consulta = em.createNamedQuery("traerDiplomados", Diplomado.class);
        return consulta.getResultList();
    }

    @Override
    public Diplomado findIdDiplomados(String nombre) {
        TypedQuery<Diplomado> consulta = em.createNamedQuery("traerIdDiplomados", Diplomado.class);
        consulta.setParameter("nombre", nombre);
        return consulta.getSingleResult();
    }
    
}
