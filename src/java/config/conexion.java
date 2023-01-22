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
    String url = "jdbc:postgresql://dpg-cf6qu81gp3jnt5g4981g-a.oregon-postgres.render.com/correos";
    String usuario = "correos_user";
    String clave = "OIEsVEyeWFdHe6xV07MNEj3M9QYV72yM";
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
