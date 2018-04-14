/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Monserrath
 */
public class Tiquete {

protected LocalDateTime fecha;
protected String carneEstudiante;
protected String nombreEstudiante;
protected String correoEstudiante;
protected int IDTiquete;
protected int grupo;

<<<<<<< HEAD
    public Tiquete(LocalDateTime fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete, int grupo) {
        this.fecha = fecha;
=======
    public Tiquete(String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        this.fecha = LocalDateTime.now();
>>>>>>> master
        this.carneEstudiante = carneEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.IDTiquete = IDTiquete;
        this.grupo = grupo;
    }

    public LocalDateTime getFecha() {
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
    
    public int getGrupo(){
        return grupo;
    }

    public void setFecha() {
        LocalDateTime now = LocalDateTime.now();
        this.fecha = now;
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
    
    public void setGrupo(int grupo){
        this.grupo = grupo;
    }
      
}
