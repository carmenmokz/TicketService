/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author carme
 */
public class DAOUsuario {
    static Connection connection;
    
    public static Connection OpenConnection(){
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;databseName=Tickets;user=sa;password=bulletproof");
            if (connection != null) {
                System.out.println("Connected to Database");
                return connection;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
}
