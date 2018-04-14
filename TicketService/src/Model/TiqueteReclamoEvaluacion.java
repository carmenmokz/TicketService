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
public class TiqueteReclamoEvaluacion extends Tiquete {
    
    private String detallesResolucion;
    private String archivoAdjunto;
    private String tipoPrueba;
    private String detalleReclamo;
    private String nombreArchivo;


    public TiqueteReclamoEvaluacion(String detallesResolucion, String archivoAdjunto, String tipoPrueba, String detalleReclamo, String nombreArchivo, LocalDateTime fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete, int grupo) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete, grupo);
        this.detallesResolucion = detallesResolucion;
        this.archivoAdjunto = archivoAdjunto;
        this.tipoPrueba = tipoPrueba;
        this.detalleReclamo = detalleReclamo;
        this.nombreArchivo = nombreArchivo;
    }

    

    public String getDetallesResolucion() {
        return detallesResolucion;
    }

    public String getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public String getDetalleReclamo() {
        return detalleReclamo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setDetallesResolucion(String detallesResolucion) {
        this.detallesResolucion = detallesResolucion;
    }

    public void setArchivoAdjunto(String archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public void setDetalleReclamo(String detalleReclamo) {
        this.detalleReclamo = detalleReclamo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
    
}
