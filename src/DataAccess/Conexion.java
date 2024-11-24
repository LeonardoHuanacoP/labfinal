/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Estudiante
 */
public class Conexion {
    
     private static String URI = "jdbc:mysql://10.144.176.69:3307/lab";
     private static String user = "root";
     private static String pass = "root";
    
    
    public static Connection getConnection() {
        try{
        Connection connection = DriverManager.getConnection(URI, user, pass);
        return connection;
        }catch(Exception e){
             System.err.println(e.getMessage());
        }
        return null;
        
        
    }
}
