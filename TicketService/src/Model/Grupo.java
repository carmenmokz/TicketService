/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Profesor;

/**
 *
 * @author Monserrath
 */
public class Grupo {
    public int numGrupo;
    public int codigoCurso;
    public String nombreProfesor;
    public int notificaciones;

    public Grupo(int numGrupo, int codigoCurso, String nombreProfesor, int notificaciones) {
        this.numGrupo = numGrupo;
        this.codigoCurso = codigoCurso;
        this.nombreProfesor = nombreProfesor;
        this.notificaciones = notificaciones;
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
