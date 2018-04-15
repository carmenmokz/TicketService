/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.util.Collections;
import Model.Tiquete;
//importar la lista


/**
 *
 * @author Monserrath
 */
public class OrdenamientoEstudiante implements OrdenamientoStrategy{

    @Override
    public void ordenar() {
        //Ese list, es la lista que se va a comparar, nadamas que aqui todavia no existe
        //bueno, tecnicamente XD.
        Collections.sort(Controller.listaTiquetes, (Tiquete t1, Tiquete t2) -> t1.getNombreEstudiante().compareTo(t2.getNombreEstudiante()));
    }
}
