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
public class Profesor {
    private String nombreCompleto;
    private String correo;
    private String password;
    private String codigoCurso;

    public Profesor(String nombreCompleto, String correo, String password, String codigoCurso) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.password = password;
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public String getcodigoCurso() {
        return codigoCurso;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setcodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    
}
