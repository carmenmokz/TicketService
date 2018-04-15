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
public class TiqueteRevisionProyecto extends Tiquete{
    
    private String lugar;
    private String comentario;
    private String descripcion;
    private String nombreArchivo;

    public TiqueteRevisionProyecto(String lugar, String comentario, String descripcion, String nombreArchivo, LocalDateTime fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete, int grupo) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete, grupo);

        this.lugar = lugar;
        this.comentario = comentario;
        this.descripcion = descripcion;
        this.nombreArchivo = nombreArchivo;
        this.tipoTiquete = "TiqueteRP";
    }

    

    public String getLugar() {
        return lugar;
    }

    public String getComentario() {
        return comentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
    
    

    
}
