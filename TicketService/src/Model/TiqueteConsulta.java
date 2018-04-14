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
public class TiqueteConsulta extends Tiquete{
    
    private String duracion;
    private String detalles;
    private String credencias;
    private String asunto;
    private String tipoTiquete;
    
    /*
    public TiqueteConsulta(Date fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete);
    }
    */

    public TiqueteConsulta(String duracion, String detalles, String credencias, String asunto, String tipoTiquete, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        super(carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete);
        this.duracion = duracion;
        this.detalles = detalles;
        this.credencias = credencias;
        this.asunto = asunto;
        this.tipoTiquete = tipoTiquete;
    }

    
    public String getDuracion() {
        return duracion;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getCredencias() {
        return credencias;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTipoTiquete() {
        return tipoTiquete;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setCredencias(String credencias) {
        this.credencias = credencias;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }
    
    
}
