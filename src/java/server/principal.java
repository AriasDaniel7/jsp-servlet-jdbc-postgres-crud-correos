/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "principal", urlPatterns = {"/principal"})
public class principal extends HttpServlet {
    private correosDAO correosDAO;
    private ArrayList<correo> listaCorreos;
    
    @Override
    public void init() {
        correosDAO = new correosDAO();
        listaCorreos = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getServletPath();
        listaCorreos = correosDAO.listarProductos();
        request.setAttribute("lista", listaCorreos);
        principal(request, response);
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
    
    protected void principal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
        dispatcher.forward(request, response);
    }

}
