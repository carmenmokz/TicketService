/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.DAOUsuario.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luis Mora
 */
public class DAOTiquete {
    static Connection connection;
    
    public DAOTiquete(){
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
    
    //INSERTAR TIQUETE
    public void crear(String codigoTiqueteInsertar, String tiqueteInsertar, String fileInsertar) throws SQLException{
        Statement st = connection.createStatement();
        st.executeUpdate("INSERT INTO Tiquete " +
                         "   (codigoTiquete, " +
                         "   tiquete, " +
                         "   [file])\n" +
                         "VALUES " +
                         "   ('" + codigoTiqueteInsertar + "' , " +
                         "   '" + tiqueteInsertar + "', " +
                         "   " + fileInsertar + ")");
    }
    
    //ACTUALIZAR TIQUETES
    public void actualizar(int num, String codigoT) throws SQLException{
        Statement st = connection.createStatement();
        st.executeQuery("UPDATE Tiquete\n" +
                        "SET respondido = '" + 1 + "'\n" +
                        "WHERE codigoTiquete = " + codigoT + ";");
        
    }
    
    //MOSTRAR LOS TIQUETES
    //RETORNA NOMBRE DEL ARCHIVO XML PARA CREAR LOS TIQUETES
    public String leer(String loginMail, String password) throws SQLException{
        Statement st = connection.createStatement();
        ResultSet rs;
        rs = st.executeQuery("SELECT correo, password FROM Tiquete");
        String login;
        String pwd;
        while(rs.next()){
            login = rs.getString("correo");
            pwd = rs.getString("password");
            if(login.equals(loginMail) && pwd.equals(password)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
