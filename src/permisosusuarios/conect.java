/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permisosusuarios;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante-11
 */
public class conect {
    Connection conectar = null;
    String BaseDeDatos ="basePermisos";
    String Usuario = "root";
    String Contraseña ="";
    String url = "jdbc:mysql://localhost:3306/"+BaseDeDatos+"?useUnicode=true&characterEncoding=utf8";
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, Usuario, Contraseña);
            
        } catch (ClassNotFoundException | SQLException e) { 
            JOptionPane.showMessageDialog(null, "Sin Conexion" + e, "conexion",
            JOptionPane.INFORMATION_MESSAGE);
        }
        return conectar;
    }
}
