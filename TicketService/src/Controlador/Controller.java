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

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Model.Profesor;

/**
 *
 * @author Luis Mora
 */
public class Controller {
    public static ArrayList<Tiquete> listaTiquetes = new ArrayList<Tiquete>();
    public static Profesor profeActual = new Profesor();
    
    //---------------------------------
    public void enviarcorreo(String correo, String asunto, String cuerpo) throws AddressException, MessagingException{
        
        String host = "smtp.gmail.com";
        String user = "Mint Eye Ticket";
        String pass = "elizabeth3rd";
        String to = correo; //CAMBIAR POR EL ESTUDIANTE QUE VA A RECIBIR LA RESPUESTA DEL TIQUETE
        String from = "minteyeticket@gmail.com"; //MANDA CORREO
        String subject = asunto; //ASUNTO DEL CORREO
        String messageText = cuerpo; //MENSAJE QUE VA EN EL CORREO
        boolean sessionDebug = false;
        
        //Set properties
        Properties props = System.getProperties();
        
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.required","true");
        
        //Java Security
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        
        Session mailSession = Session.getDefaultInstance(props, null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(from));
        InternetAddress[] address = {new InternetAddress(to)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(messageText);
        
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(host, from, pass);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
        System.out.println("Mensaje enviado exitosamente!");
    }
    
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
