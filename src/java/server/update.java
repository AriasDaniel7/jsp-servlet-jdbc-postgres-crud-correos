/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.correo;
import modelo.correosDAO;

/**
 *
 * @author Daniel Arias
 */
@WebServlet(name = "update", urlPatterns = {"/update"})
public class update extends HttpServlet {
private correosDAO correosDAO;
    
    @Override
    public void init() {
        correosDAO = new correosDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        actualizar(request, response);
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
    
    protected void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        
        correo cor = new correo(id, nombre, correo);
        correosDAO.actualizar(cor);
        response.sendRedirect("principal");
    }
}
