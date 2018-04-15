/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Luis Mora
 */
public class DTO {
    
    private String tipoTiquete;
    private String nombreProperties;
    private String nombrePDF;
    private String nombreZIP;
    
    public DTO(String tipoTiquete, String nombreProperties, String nombrePDF, String nombreZIP) {
        this.tipoTiquete = tipoTiquete;
        this.nombreProperties = nombreProperties;
        this.nombrePDF = nombrePDF;
        this.nombreZIP = nombreZIP;
    }
    public DTO(String tipoTiquete, String nombreProperties, String nombrePDF) {
        this.tipoTiquete = tipoTiquete;
        this.nombreProperties = nombreProperties;
        this.nombrePDF = nombrePDF;
    }
    public DTO(String tipoTiquete, String nombreProperties,String nombreZIP,int dummy) {
        this.tipoTiquete = tipoTiquete;
        this.nombreProperties = nombreProperties;
        this.nombreZIP = nombreZIP;
    }

    public String getTipoTiquete() {
        return tipoTiquete;
    }

    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }

    public String getNombreProperties() {
        return nombreProperties;
    }

    public void setNombreProperties(String nombreProperties) {
        this.nombreProperties = nombreProperties;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public String getNombreZIP() {
        return nombreZIP;
    }

    public void setNombreZIP(String nombreZIP) {
        this.nombreZIP = nombreZIP;
    }
    
    
}
