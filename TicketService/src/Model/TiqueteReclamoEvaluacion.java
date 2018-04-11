/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Tiquete;
import java.util.Date;

/**
 *
 * @author Monserrath
 */
public class TiqueteReclamoEvaluacion extends Tiquete {
    
    private String detallesResolucion;
    private String archivoAdjunto;
    private String tipoPrueba;
    private String detalleReclame;
    private String nombreArchivo;

    public TiqueteReclamoEvaluacion(String detallesResolucion, String archivoAdjunto, String tipoPrueba, String detalleReclame, String nombreArchivo, Date fecha, String carneEstudiante, String nombreEstudiante, String correoEstudiante, int IDTiquete) {
        super(fecha, carneEstudiante, nombreEstudiante, correoEstudiante, IDTiquete);
        this.detallesResolucion = detallesResolucion;
        this.archivoAdjunto = archivoAdjunto;
        this.tipoPrueba = tipoPrueba;
        this.detalleReclame = detalleReclame;
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

    public String getDetalleReclame() {
        return detalleReclame;
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

    public void setDetalleReclame(String detalleReclame) {
        this.detalleReclame = detalleReclame;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
    
}
