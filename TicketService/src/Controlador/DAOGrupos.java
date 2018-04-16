/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.DAOTiquete.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author carme
 */
public class DAOGrupos {
    static Connection connection;
    
    public DAOGrupos(){
        OpenConnection();
    }
    
    public static Connection OpenConnection(){
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Tickets;user=sa;password=bulletproof");
            if (connection != null) {
                System.out.println("Connected to Database");
                return connection;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    //RETORNAR GRUPOS QUE DA UN PROFESOR
    public ArrayList<String> mostrarGrupos(String correo) throws SQLException{
        ArrayList<String> grupos = new ArrayList<String>();
        
        Statement st = connection.createStatement();
        ResultSet rs;
        rs = st.executeQuery("SELECT idGrupo\n" +
                            "FROM Grupo inner join Usuario on (grupo.idProfesor=Usuario.correo)\n" +
                            "WHERE idProfesor='"+correo+"'");
        String grupo;
        while(rs.next()){
            grupo = rs.getString("idGrupo");
            grupos.add(grupo);
        }
        return grupos;
    }
    
}
