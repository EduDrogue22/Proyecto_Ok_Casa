/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ContraseniaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.WSLOGIN;
import ws.WSLOGIN_Service;

/**
 *
 * @author Tiare
 */
@WebServlet(name = "servletContrasenia", urlPatterns = {"/servletContrasenia"})
public class servletContrasenia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletContrasenia</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletContrasenia at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ContraseniaDAO dao = new ContraseniaDAO();
        try {
            String usuario = request.getParameter("txtUsuario");
            String pass = request.getParameter("txtContrasena");
            if(dao.cambiarContrasenia(usuario, pass)){
                request.setAttribute("msj", "Contraseña Modificada con exito");
                request.getRequestDispatcher("contraseña.jsp").forward(request, response);
            }
            else {
                request.setAttribute("err", "Contraseña NO Modificada");
                request.getRequestDispatcher("contraseña.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("err", "Contraseña NO Modificada exception" + e.getMessage());
            request.getRequestDispatcher("contraseña.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
