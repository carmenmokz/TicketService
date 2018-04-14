/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author carme
 */
public abstract class GestorDocumentos {
    
    protected String file;
    
    public GestorDocumentos(String file){
        this.file = file;
    }
    
    abstract public void transformarDocumento(String file);
    
    abstract public Tiquete transformarATiquete(String type);
}
