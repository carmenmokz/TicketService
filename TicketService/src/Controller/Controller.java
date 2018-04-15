/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.Tiquete;

/**
 *
 * @author carme
 */
public class Controller {
    public static ArrayList <Tiquete> listaTiquetes = new ArrayList<Tiquete>();

    public Controller() {
    }

    public static ArrayList<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public static void setListaTiquetes(ArrayList<Tiquete> listaTiquetes) {
        Controller.listaTiquetes = listaTiquetes;
    }
    
    public void enviarCorreo(){
        
    }
    public void crearTicket(){
        
    }
}
