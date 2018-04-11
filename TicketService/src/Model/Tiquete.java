/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Monserrath
 */
public class Tiquete {

protected Date fecha;
protected String carneEstudiante;
protected String nombreEstudiante;
protected String correoEstudiante;
protected int IDTiquete;

    public Tiquete(Date fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        this.fecha = fecha;
        this.carneEstudiante = carneEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.IDTiquete = IDTiquete;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCarneEstudiante() {
        return carneEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public int getIDTiquete() {
        return IDTiquete;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCarneEstudiante(String carneEstudiante) {
        this.carneEstudiante = carneEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public void setIDTiquete(int IDTiquete) {
        this.IDTiquete = IDTiquete;
    }
      
}
