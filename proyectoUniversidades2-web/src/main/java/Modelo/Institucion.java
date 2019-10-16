/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class Institucion {
    
    private int id;
    
    private String nombre;
    
    private String extension;
    
    private String escudo;
    
    private List<Programa> programas;
    
    private Date fundacion;

    public Institucion() {
    }

    public Institucion(String nombre, String extension, String escudo, Date fundacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
        this.fundacion = fundacion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public List<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(List<Programa> diplomados) {
        this.programas = programas;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }
        
}
