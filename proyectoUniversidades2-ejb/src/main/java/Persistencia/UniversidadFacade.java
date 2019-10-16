/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.UniversidadFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.Universidad;
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
public class UniversidadFacade extends AbstractFacade<Universidad> implements UniversidadFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_proyectoUniversidades2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniversidadFacade() {
        super(Universidad.class);
    }

    @Override
    public List<Universidad> findNombre() {
        TypedQuery<Universidad> consulta = em.createNamedQuery("traerUniversidades", Universidad.class);
        return consulta.getResultList();
    }

    @Override
    public Universidad findIdUniversidad(String nombre) {
        TypedQuery<Universidad> consulta = em.createNamedQuery("traerIdUniversidad", Universidad.class);
        consulta.setParameter("nombre", nombre);
        return consulta.getSingleResult();
    }

}
