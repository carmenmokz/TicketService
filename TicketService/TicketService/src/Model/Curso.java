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
public class Curso {
    private int codigo;
    private String nombre;
    private int cantiCredi;

    public Curso(int codigo, String nombre, int cantiCredi) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantiCredi = cantiCredi;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantiCredi() {
        return cantiCredi;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantiCredi(int cantiCredi) {
        this.cantiCredi = cantiCredi;
    }
    
    
    
    
}
