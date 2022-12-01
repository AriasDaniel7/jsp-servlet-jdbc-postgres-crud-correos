/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.correo;
import modelo.correosDAO;

/**
 *
 * @author Daniel Arias
 */
@WebServlet(name = "insert", urlPatterns = {"/insert"})
public class insert extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        insertar(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    protected void insertar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        correosDAO correosDAO = new correosDAO();
        String correo = request.getParameter("correo");
        String nombre = request.getParameter("nombre");
        
        correo cor = new correo(0, nombre, correo);
        correosDAO.insertar(cor);
        response.sendRedirect("principal");
    }
}
