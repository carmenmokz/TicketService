/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author Monserrath
 */
public class Grupo {
    
    private int numGrupo;
    private int codigoCurso;
    private String nombreProfesor;
    private String IDGrupo;
    int notificaciones;

    
    //Esas dos clases estan puestas ahi de manera temporal, pero se utikizan
    //esas para representar las que usaran en de manera global :3
    public Grupo(int numGrupo, int codigoCurso, String nombreProfesor, String IDGrupo ,int notificaciones) {
        Profesor profe = new Profesor("Diego Mora", "rico@gmail.com", "123zukulencia");
        Curso curs = new Curso(123, "AP", 3);
        this.numGrupo = numGrupo;
        this.codigoCurso = curs.getCodigo();
        this.nombreProfesor = profe.getNombreCompleto();
        this.IDGrupo = IDGrupo;
        this.notificaciones = notificaciones;
    }

    public String getIDGrupo() {
        return IDGrupo;
    }

    public void setIDGrupo(String IDGrupo) {
        this.IDGrupo = IDGrupo;
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public int getNotificaciones() {
        return notificaciones;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setNotificaciones(int notificaciones) {
        this.notificaciones = notificaciones;
    }
    
    
}
