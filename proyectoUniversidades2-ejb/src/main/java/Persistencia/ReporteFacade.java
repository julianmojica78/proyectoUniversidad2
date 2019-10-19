/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.ReporteFacadeLocal;
import Entity.Reporte;
import Interfaces.AbstractFacade;
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
public class ReporteFacade extends AbstractFacade<Reporte> implements ReporteFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_proyectoUniversidades2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReporteFacade() {
        super(Reporte.class);
    }

    @Override
    public List<Reporte> findReporte() {
                TypedQuery<Reporte> consulta = em.createNamedQuery("traerReporte", Reporte.class);
        return consulta.getResultList();
    }
    
}
