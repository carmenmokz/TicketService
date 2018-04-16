/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controller;
import Controlador.DAOUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carme
 */
public class DTOGUI{
    
    private String correo;
    private String password;
    private final DAOUsuario usuario = new DAOUsuario();

    public DTOGUI(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean logIn(){
        try {
            return usuario.leer(correo, password)== true;
        } catch (SQLException ex) {
            Logger.getLogger(DTOGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public void profActual() throws SQLException{
        ArrayList<String> temp;
        temp = usuario.seleccionarProfesor(correo);
        Controller.profeActual.setNombreCompleto(temp.get(0));
        Controller.profeActual.setCorreo(temp.get(1));
        Controller.profeActual.setPassword(temp.get(2));
        System.out.println(Controller.profeActual.getPassword());
        
    }
}
