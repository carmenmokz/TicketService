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
    public int codCurso;
    public String nombreProfesor;
    public String notificaciones;

    public Grupo(int numGrupo, int codCurso, String nombreProfesor, String notificaciones) {
        this.numGrupo = numGrupo;
        this.codCurso = codCurso;
        this.nombreProfesor = nombreProfesor;
        this.notificaciones = notificaciones;
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getNotificaciones() {
        return notificaciones;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }
    
    
}
