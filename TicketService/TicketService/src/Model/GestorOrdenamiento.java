/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Monserrath
 */
public class GestorOrdenamiento {
    private OrdenamientoStrategy ordenamientoStrategy;
    
    public GestorOrdenamiento (){
        
    }

    public OrdenamientoStrategy getOrdenamientoStrategy() {
        return ordenamientoStrategy;
    }

    public void setOrdenamientoStrategy(OrdenamientoStrategy ordenamientoStrategy) {
        this.ordenamientoStrategy = ordenamientoStrategy;
    }
    
    public void ordenan(){
        ordenamientoStrategy.ordenar();
    }
        
}
