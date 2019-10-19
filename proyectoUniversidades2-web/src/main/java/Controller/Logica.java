/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.*;
import Interfaces.*;
import Modelo.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author DAVID
 */
@Named(value = "logica")
@SessionScoped
public class Logica implements Serializable {

    @EJB
    UniversidadFacadeLocal universidadFacade;

    @EJB
    DiplomadoFacadeLocal diplomadoFacade;

    @EJB
    EstudianteFacadeLocal estudianteFacade;

    @EJB
    ReporteFacadeLocal reporteFacade;    
    
    Usuario usuario = new Usuario();

    Institucion institucion = new Institucion();

    Programa programa = new Programa();

    Universidad universidad;

    Diplomado diplomado;

    Estudiante estudiante;
    
    Reporte reporte;

    Date fechaMin = new Date();

    Date fechaMax = fechaFin();

    String nombreUniversidades;

    String nombreDiplomado;

    String nombreEstudiante;

    private UploadedFile file;

    public Logica() {
    }

    public void guardarUniversidad(Institucion instituto) {

        //if (instituto.getEscudo() != null) {
        //instituto.setEscudo(file.getFileName());
            Universidad universidad = new Universidad(instituto.getNombre(), instituto.getExtension(), instituto.getEscudo(), instituto.getFundacion());
            universidadFacade.create(universidad);
            //institucion = null;
        /*} else {
            FacesMessage message = new FacesMessage("Seleccione una imagen");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }*/
    }

    public void guardarDiplomado(Programa programa,String nombre) {
        Diplomado diplomados = new Diplomado(programa.getNombre(), programa.getFechaInicio(), programa.getFechaFin(), programa.getDescripcion());
        universidad = universidadFacade.findIdUniversidad(nombre);
        diplomados.setUniversidad(universidad);
        diplomadoFacade.create(diplomados);
        //programa = null;
    }

    public void guardaEstudiante(Usuario usuario,String nombre) {
        Estudiante estudiante = new Estudiante(usuario.getNombre(), usuario.getFoto(), usuario.getEdad());
        diplomado = diplomadoFacade.findIdDiplomados(nombre);
        estudiante.setDiplomado(diplomado);
        estudianteFacade.create(estudiante);
        //usuario = null;
    }

    public List<Universidad> listaUniversidades() {
        return universidadFacade.findAll();
    }

    public List<Diplomado> listaDiplomados() {
        return diplomadoFacade.findNombre();
    }

    public List<Universidad> traerUniversidades() {
        return universidadFacade.findNombre();
    }
    
    public List<Reporte> traerReporte() {
        List<Reporte> lista = reporteFacade.findAll();
        return lista;
    }

    public Date fechaFin() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaMin);
        cal.add(Calendar.MONTH, 1);
        fechaMax = cal.getTime();
        return fechaMax;
    }

    public UniversidadFacadeLocal getUniversidadFacade() {
        return universidadFacade;
    }

    public void setUniversidadFacade(UniversidadFacadeLocal universidadFacade) {
        this.universidadFacade = universidadFacade;
    }

    public DiplomadoFacadeLocal getDiplomadoFacade() {
        return diplomadoFacade;
    }

    public void setDiplomadoFacade(DiplomadoFacadeLocal diplomadoFacade) {
        this.diplomadoFacade = diplomadoFacade;
    }

    public EstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    public void setEstudianteFacade(EstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Diplomado getDiplomado() {
        return diplomado;
    }

    public void setDiplomado(Diplomado diplomado) {
        this.diplomado = diplomado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public Date getFechaMin() {
        return fechaMin;
    }

    public void setFechaMin(Date fechaMin) {
        this.fechaMin = fechaMin;
    }

    public Date getFechaMax() {
        return fechaMax;
    }

    public void setFechaMax(Date fechaMax) {
        this.fechaMax = fechaMax;
    }

    public String getNombreUniversidades() {
        return nombreUniversidades;
    }

    public void setNombreUniversidades(String nombreUniversidades) {
        this.nombreUniversidades = nombreUniversidades;
    }

    public String getNombreDiplomado() {
        return nombreDiplomado;
    }

    public void setNombreDiplomado(String nombreDiplomado) {
        this.nombreDiplomado = nombreDiplomado;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        
        
    }

    public ReporteFacadeLocal getReporteFacade() {
        return reporteFacade;
    }

    public void setReporteFacade(ReporteFacadeLocal reporteFacade) {
        this.reporteFacade = reporteFacade;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
}
