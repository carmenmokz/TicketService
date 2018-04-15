/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.util.Collections;
import Model.Tiquete;

/**
 *
 * @author Monserrath
 */
public class OrdenamientoTipo implements OrdenamientoStrategy{

    @Override
    public void ordenar() {
       Collections.sort(Controller.listaTiquetes, (Tiquete t1, Tiquete t2) -> t1.getTipoTiquete().compareTo(t2.getTipoTiquete()));
    }
   
}
