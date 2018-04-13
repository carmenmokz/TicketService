/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketservice;

import Model.DAOUsuario;

/**
 *
 * @author Monserrath
 */
public class TicketService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAOUsuario con = new DAOUsuario();
        con.OpenConnection();
        
    }
    
}
