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
    protected int numGrupo;
    protected int codigoCurso;
    protected String Tconsulta;
    protected String TReclamoE;
    protected String TRevisionP;
    protected String nombreProfesor;
    
    public int notificaciones;

    public Grupo(int numGrupo, int codigoCurso, String Tconsulta, String TReclamoE, String TRevisionP, String nombreProfesor, int notificaciones) {
        this.numGrupo = numGrupo;
        this.codigoCurso = codigoCurso;
        this.Tconsulta = Tconsulta;
        this.TReclamoE = TReclamoE;
        this.TRevisionP = TRevisionP;
        this.nombreProfesor = nombreProfesor;
        this.notificaciones = notificaciones;
    }

    public String getTconsulta() {
        return Tconsulta;
    }

    public String getTReclamoE() {
        return TReclamoE;
    }

    public String getTRevisionP() {
        return TRevisionP;
    }

    public void setTconsulta(String Tconsulta) {
        this.Tconsulta = Tconsulta;
    }

    public void setTReclamoE(String TReclamoE) {
        this.TReclamoE = TReclamoE;
    }

    public void setTRevisionP(String TRevisionP) {
        this.TRevisionP = TRevisionP;
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
