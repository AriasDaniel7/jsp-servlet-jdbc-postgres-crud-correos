/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel Arias
 */
public class prueba {
    public static void main(String[] args) {
        correosDAO cor = new correosDAO();
        int id = cor.mostrarCorreo("sss");
        correo c = new correo(id, "rubert1","ssss");
        System.out.println(cor.actualizar(c));
        System.out.println(id);
    }
}
