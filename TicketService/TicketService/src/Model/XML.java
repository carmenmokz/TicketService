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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author carme
 */
public class XML extends GestorDocumentos{
    public static int id;
    
    @Override
    public void transformarDocumento(String file){
        try {
                File filename =new File(file);
                FileReader reader = new FileReader(filename.getAbsolutePath());
                Properties prop = new Properties();
    		prop.load(reader);
    		
    		//Crea el nombre del archivo xml con el nombre y el id del archivo
                String xmlName = (prop.getProperty("carne")+"-"+id+".xml");
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
                
                Element xmlID = doc.createElement("id");
                xmlID.appendChild(doc.createTextNode(String.valueOf(id)));
                rootElement.appendChild(xmlID);
                id++;
                
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
    
    //INSTANCIA UN OBJETO DE TIPO TIQUETECONSULTA
    public TiqueteConsulta transformarTiqueteConsulta(String file) throws SAXException, ParserConfigurationException{
        try {
            
            File filename =new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename.getAbsolutePath());
            
            String duracion = "";
            
            NodeList detalleSolicitud = doc.getElementsByTagName("detalleSolicitud");
            String detalles = detalleSolicitud.item(0).getFirstChild().getTextContent();
            
            String credenciales = "";
            
            NodeList asuntoConsulta = doc.getElementsByTagName("asunto");
            String asunto = asuntoConsulta.item(0).getFirstChild().getTextContent();
            
            String tipoTiquete = "";
            
            NodeList fechaConsulta = doc.getElementsByTagName("fecha");
            String str = fechaConsulta.item(0).getFirstChild().getTextContent();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
            LocalDateTime fecha = dateTime;
            
            NodeList carne = doc.getElementsByTagName("carne");
            String carneEstudiante = carne.item(0).getFirstChild().getTextContent();
            
            NodeList nombre = doc.getElementsByTagName("nombre");
            String nombreEstudiante = nombre.item(0).getFirstChild().getTextContent();
            
            NodeList correo = doc.getElementsByTagName("correo");
            String correoEstudiante = correo.item(0).getFirstChild().getTextContent();
            
            NodeList ID = doc.getElementsByTagName("id");
            int IDTiquete = Integer.parseInt(ID.item(0).getFirstChild().getTextContent());
          
            NodeList grupoConsulta = doc.getElementsByTagName("grupo");
            String grupo = grupoConsulta.item(0).getFirstChild().getTextContent();
            
            TiqueteConsulta tiquete = new TiqueteConsulta(duracion,detalles,credenciales,asunto,tipoTiquete,carneEstudiante,nombreEstudiante,correoEstudiante,grupo,IDTiquete);
        
            return tiquete;
        } catch (IOException ex) {
    		ex.printStackTrace();
        } 
        return null;
    }
    
    //INSTANCIA UN OBJETO DE TIPO TIQUETEREVISIONPROYECTOS
    public TiqueteRevisionProyecto transformarTiqueteRevisionProyecto(String file) throws ParserConfigurationException, SAXException{
        try {
            
            File filename =new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename.getAbsolutePath());
            
            String lugar = "";
            
            String comentario = "";
            
            NodeList descripcionRevision = doc.getElementsByTagName("descripcion");
            String descripcion = descripcionRevision.item(0).getFirstChild().getTextContent();
            
            NodeList archivo = doc.getElementsByTagName("nombreArchivo");
            String nombreArchivo = archivo.item(0).getFirstChild().getTextContent();
            
            NodeList fechaConsulta = doc.getElementsByTagName("fecha");
            String str = fechaConsulta.item(0).getFirstChild().getTextContent();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
            LocalDateTime fecha = dateTime;
            
            NodeList carne = doc.getElementsByTagName("carne");
            String carneEstudiante = carne.item(0).getFirstChild().getTextContent();
            
            NodeList nombre = doc.getElementsByTagName("nombre");
            String nombreEstudiante = nombre.item(0).getFirstChild().getTextContent();
            
            NodeList correo = doc.getElementsByTagName("correo");
            String correoEstudiante = correo.item(0).getFirstChild().getTextContent();
            
            NodeList ID = doc.getElementsByTagName("id");
            int IDTiquete = Integer.parseInt(ID.item(0).getFirstChild().getTextContent());
          
            NodeList grupoRevision = doc.getElementsByTagName("grupo");
            String grupo = grupoRevision.item(0).getFirstChild().getTextContent();
            
            TiqueteRevisionProyecto tiquete = new TiqueteRevisionProyecto(lugar, comentario, descripcion, nombreArchivo, carneEstudiante, nombreEstudiante, correoEstudiante,grupo,IDTiquete);
            
            return tiquete;
        } catch (IOException ex) {
    		ex.printStackTrace();
        } 
        return null;
    }
    
    //INSTANCIA UN OBJETO DE TIPO TIQUETERECLAMOEVALUACION
    public TiqueteReclamoEvaluacion transformarTiqueteReclamoEvaluacion(String file) throws ParserConfigurationException, SAXException{
        try {
            
            File filename =new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename.getAbsolutePath());
            
            String detallesResolucion = "";
                       
            NodeList archivoAdjuntoReclamo = doc.getElementsByTagName("archivoAdjunto");
            String archivoAdjunto = archivoAdjuntoReclamo.item(0).getFirstChild().getTextContent();
            
            NodeList tipoPruebaReclamo = doc.getElementsByTagName("tipoPrueba");
            String tipoPrueba = tipoPruebaReclamo.item(0).getFirstChild().getTextContent();
            
            NodeList detalleDelReclamo = doc.getElementsByTagName("detalleReclamo");
            String detalleReclamo = detalleDelReclamo.item(0).getFirstChild().getTextContent();
            
            NodeList archivo = doc.getElementsByTagName("nombreArchivo");
            String nombreArchivo = archivo.item(0).getFirstChild().getTextContent();
            
            NodeList fechaConsulta = doc.getElementsByTagName("fecha");
            String str = fechaConsulta.item(0).getFirstChild().getTextContent();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
            LocalDateTime fecha = dateTime;
            NodeList carne = doc.getElementsByTagName("carne");
            String carneEstudiante = carne.item(0).getFirstChild().getTextContent();
            
            NodeList nombre = doc.getElementsByTagName("nombre");
            String nombreEstudiante = nombre.item(0).getFirstChild().getTextContent();
            
            NodeList correo = doc.getElementsByTagName("correo");
            String correoEstudiante = correo.item(0).getFirstChild().getTextContent();
            
            NodeList ID = doc.getElementsByTagName("id");
            int IDTiquete = Integer.parseInt(ID.item(0).getFirstChild().getTextContent());
          
            NodeList grupoReclamo = doc.getElementsByTagName("grupo");
            String grupo = grupoReclamo.item(0).getFirstChild().getTextContent();
            
            TiqueteReclamoEvaluacion tiquete = new TiqueteReclamoEvaluacion(detallesResolucion, archivoAdjunto, tipoPrueba, detalleReclamo, nombreArchivo, carneEstudiante, nombreEstudiante, correoEstudiante, grupo, IDTiquete);
        
            return tiquete;
        } catch (IOException ex) {
    		ex.printStackTrace();
        } 
        return null;
    }

    
    @Override
    public Tiquete transformarATiquete(String type, String file) {
        try {
            switch (type) {
                case "sendC":
                    return transformarTiqueteConsulta(file);
                case "sendRP":
                    return transformarTiqueteRevisionProyecto(file);
                case "sendRE":
                    return transformarTiqueteReclamoEvaluacion(file);
                default:
                    throw new IllegalArgumentException("Tipo inexistente");
            }
        } catch (SAXException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
