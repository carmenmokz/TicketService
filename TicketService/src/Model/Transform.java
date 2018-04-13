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
public abstract class Transform {
    abstract public void transformarProperties(String file, String id);
    
    abstract public void transformarATiquete(String file);
}
