/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ws.WSLOGIN;
import ws.*;


/**
 *
 * @author Bastian Ahumada
 */
@WebServlet(name = "servletLogin", urlPatterns = {"/servletLogin"})
public class servletLogin extends HttpServlet {

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
            out.println("<title>Servlet servletLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletLogin at " + request.getContextPath() + "</h1>");
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
        request.getSession().invalidate();//Eliminando las variables de sesión
        response.sendRedirect("index.jsp");
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
        try {
            //Capturar las credenciales
            String usuario = request.getParameter("txtUsuario");
            String pass = request.getParameter("txtContrasena");

            //Entregamos las credenciales al WS
            //Instanciamos el usuario del WS
            WSLOGIN_Service servicio = new WSLOGIN_Service();
            WSLOGIN cliente = servicio.getWSLOGINPort();
            //System.out.println("cliente :" + cliente.login("asd", "asd"));

            int tipo = cliente.login(usuario, pass);
            String rut_usuario = "";
            rut_usuario=cliente.rutUsuario(usuario, pass);
            //verificamos si inicia sesión
            if (tipo > 0) {
                //crear una variable de sesión para el usuario y su tipo
                request.getSession().setAttribute("tipo", tipo);
                HttpSession sesion = request.getSession();
                sesion.setAttribute("username", usuario);
                sesion.setAttribute("user_rut", rut_usuario);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.setAttribute("err", "Credenciales incorrectas");
                request.getRequestDispatcher("iniciarsesion.jsp").forward(request, response);

            }

        } catch (Exception e) {
            request.setAttribute("err", "Credenciales incorrectas" + e.getMessage());
            request.getRequestDispatcher("iniciarsesion.jsp").forward(request, response);
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
