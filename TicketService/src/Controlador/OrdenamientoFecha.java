/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Controlador.OrdenamientoStrategy;
import java.util.Collections;
import Controlador.Controller;
import Model.Tiquete;

/**
 *
 * @author Monserrath
 */
public class OrdenamientoFecha implements OrdenamientoStrategy {
    
    @Override
    public void ordenar() {
        Collections.sort(Controller.listaTiquetes, (Tiquete t1, Tiquete t2) -> t1.getFecha().compareTo(t2.getFecha()));
    }
    
}
