/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Model;

import Model.Tiquete;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Monserrath
 */
public class TiqueteConsulta extends Tiquete{
    
    private String duracion;
    private String detalles;
    private String credenciales;
    private String asunto;
    private String tipoTiquete;
    
    /*
    public TiqueteConsulta(Date fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete);
    }
    */

    public TiqueteConsulta(String duracion, String detalles, String credenciales, String asunto, String tipoTiquete, LocalDateTime fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete, int grupo) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete, grupo);
        this.duracion = duracion;
        this.detalles = detalles;
        this.credenciales = credenciales;
        this.asunto = asunto;
        this.tipoTiquete = tipoTiquete;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getCredenciales() {
        return credenciales;
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

    public void setCredencias(String credenciales) {
        this.credenciales = credenciales;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }
    
    
}
