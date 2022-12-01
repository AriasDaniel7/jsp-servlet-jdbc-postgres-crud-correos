/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Daniel Arias
 */
public class correosDAO {
    protected Connection conexion;
    
    public correosDAO(){
        conexion con = new conexion();
        this.conexion = con.getConexion();
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<correo> listarProductos(){
        PreparedStatement ps;
        ResultSet rs;
        
        ArrayList<correo> lista = new ArrayList<>();
        
        try {
            ps = this.conexion.prepareStatement("SELECT cod,nombre,correo FROM usuarios");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("cod");
                String nombre = rs.getString("nombre").intern();
                String correo = rs.getString("correo").intern();
                
                correo cor = new correo(id, nombre, correo);
                lista.add(cor);
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(correo correo){
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("INSERT INTO usuarios(nombre,correo) VALUES (?,?)");
            ps.setString(1,correo.getNombre());
            ps.setString(2,correo.getCorreo());;
            ps.execute();
            
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
