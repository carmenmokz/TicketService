/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Tiquete;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Luis Mora
 */
public class Controller {
    public static ArrayList<Tiquete> listaTiquetes = new ArrayList<Tiquete>();
    
    
    
    
    
    //---------------------------------
    public void enviarcorreo(){}
    
    public void GestionarTiquete(){}
    
    public Tiquete transformarATiquete(String type, String file) throws SAXException, ParserConfigurationException {
        
        XML xmlFile = new XML(file);
        
        switch (type) {
            case "sendC":
                return xmlFile.transformarTiqueteConsulta();
            case "sendRP":
                return xmlFile.transformarTiqueteRevisionProyecto();
            case "sendRE":
                return xmlFile.transformarTiqueteReclamoEvaluacion();
            default:
                throw new IllegalArgumentException("Tipo inexistente");
        }
    }
    
}
