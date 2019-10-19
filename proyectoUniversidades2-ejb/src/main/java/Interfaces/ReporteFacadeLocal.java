/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Reporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DAVID
 */
@Local
public interface ReporteFacadeLocal {

    void create(Reporte reporte);

    void edit(Reporte reporte);

    void remove(Reporte reporte);

    Reporte find(Object id);

    List<Reporte> findAll();

    List<Reporte> findRange(int[] range);

    int count();
    
    List<Reporte> findReporte();
    
}
