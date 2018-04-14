/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author carme
 */
public class DAOUsuario {
    static Connection connection;
    
    public DAOUsuario(){
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
    
    //VERIFICA QUE EL USUARIO DEL LOGIN EXISTA DENTRO DE LA BASE DE DATOS
    //RETORNA TRUE SI SE ENCUENTRA EN LA BASE DE DATOS
    //RETORNA FALSE SI NO SE ENCUENTRA EN LA BASE DE DATOS
    public boolean leer(String loginMail, String password) throws SQLException{
        Statement st = connection.createStatement();
        ResultSet rs;
        rs = st.executeQuery("SELECT correo, password FROM Usuario");
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
    
    //INSERTA UN NUEVO USUARIO A LA TABLA DE USUARIO DE LA BASE DE DATOS
    public void crear(String nombreCompleto, String password, String correo, String tipoUsuario, int carne) throws SQLException{
        Statement st = connection.createStatement();
        st.executeUpdate("INSERT INTO Usuario " +
                         "   (codigoCurso, " +
                         "   nombreCurso, " +
                         "   creditos, " +
                         "   horasSemanales)\n" +
                         "VALUES " +
                         "   ('" + nombreCompleto + "' , " +
                         "   '" + password + "', " +
                         "   " + correo + ", " +
                         "   " + tipoUsuario + ", " +
                         "   " + carne + ")");
    }
    
    //actualizar
    
    //BORRA ELEMENTO DE LA TABLA USUARIO DE LA BASE DE DATOS SEGUN SU NUMERO DE CARNE
    public void borrar(int carne) throws SQLException{
        Statement st = connection.createStatement();
        st.executeUpdate("DELETE FROM Curso\n" +
                         "WHERE codigoCurso = " + "'" + carne + "'" + ";");
    }
    
}
