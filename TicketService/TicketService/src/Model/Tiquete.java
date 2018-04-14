/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Monserrath
 */
public class Tiquete {

protected LocalDateTime fecha;
protected String carneEstudiante;
protected String nombreEstudiante;
protected String correoEstudiante;
protected String IDGrupo;
protected int IDTiquete;


    public Tiquete(String carneEstudiante, String nombreEstudiante, String correoEstudiante,String IDGrupo , int IDTiquete) {
        
        //lo mismo, lo cree, aqui de manera temporal
        //Grupo group = new Grupo(123, 456, "zukulento", "zukuencio", 1);
                
        this.fecha = LocalDateTime.now();
        this.carneEstudiante = carneEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.IDTiquete = IDTiquete;
        this.IDGrupo = IDGrupo;
    }

    public String getIDGrupo() {
        return IDGrupo;
    }

    public void setIDGrupo(String IDGrupo) {
        this.IDGrupo = IDGrupo;
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
    
}
