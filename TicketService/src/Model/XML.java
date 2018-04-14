/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author carme
 */
public class XML extends Transform{
    public static int id;
    
    @Override
    public void transformarProperties(String file){
        try {
                File filename =new File(file);
                FileReader reader = new FileReader(filename.getAbsolutePath());
                Properties prop = new Properties();
    		prop.load(reader);
    		
    		//Crea el nombre del archivo xml con el nombre y el id del archivo
    		
                String xmlName = (prop.getProperty("carne")+"-"+id+".xml");
                id++;
                DocumentBuilderFactory PropertiesFile = DocumentBuilderFactory.newInstance();
                DocumentBuilder XMLBuilder = PropertiesFile.newDocumentBuilder();
                Document doc = XMLBuilder.newDocument();
                
                 //Root
                Element rootElement = doc.createElement("properties");
                doc.appendChild(rootElement);
                
                //Agrega atributos al xml
                Enumeration FileKeys = prop.keys();
                while(FileKeys.hasMoreElements()){
                    String key = (String) FileKeys.nextElement();
                    String value = prop.getProperty(key);
                    System.out.println(key + ": " + value);
                    
                    Element label = doc.createElement(key);
                    label.appendChild(doc.createTextNode(value));
                    rootElement.appendChild(label);
                }
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                
                Element datelabel = doc.createElement("fecha");
                datelabel.appendChild(doc.createTextNode(dtf.format(now).toString()));
                rootElement.appendChild(datelabel);
                
                //Crea el archivo xml
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(xmlName));
                transformer.transform(source, result);


                //Imprime el xml
                //StreamResult consoleResult = new StreamResult(System.out);
                //transformer.transform(source, consoleResult);
                
    	} catch (IOException ex) {
    		ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    };
    

    @Override
    public void transformarATiquete(String file) {
        try {
            
            File filename =new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename.getAbsolutePath());
            
            doc.getElementsByTagName(file)
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
