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


    public Profesor(String nombreCompleto, String correo, String password) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.password = password;
    }

    public Profesor() {
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

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
