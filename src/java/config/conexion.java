package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Arias
 */
public class conexion {
    Connection conexion = null;
    String url = "jdbc:postgresql://ec2-54-163-34-107.compute-1.amazonaws.com/dbi2k4cd2fl7gv";
    String usuario = "qndzyzyjexawej";
    String clave = "161c9ac2941f9b3d134376722e7517df301eb49831ec5019499643b65b4a7501";
    Statement sentencia = null;
    
    public Connection getConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,usuario,clave);
            return conexion;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida"+e,"conexion",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
