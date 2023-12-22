/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.HistorialInspeccionDAO;
import DAO.InspeccionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tiare
 */
@WebServlet(name = "servletAgregarHistorialInspeccion", urlPatterns = {"/servletAgregarHistorialInspeccion"})
public class servletAgregarHistorialInspeccion extends HttpServlet {

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
            out.println("<title>Servlet servletAgregarHistorialInspeccion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAgregarHistorialInspeccion at " + request.getContextPath() + "</h1>");
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
        try {
            HttpSession sesion = request.getSession();
            String rut_usuario = (String) sesion.getAttribute("user_rut");
            String rut = rut_usuario;
            String descripcion = request.getParameter("txtDescripcion");
            String fecha = request.getParameter("txtfecha");
            String tipo_inspeccion = request.getParameter("txtTipo_inspeccion");
            String equipo = request.getParameter("txtnombre_equipo");
            String info_fecha = request.getParameter("txtInfo");
            HistorialInspeccionDAO dao = new HistorialInspeccionDAO();
            if (info_fecha.equals("true")) {
                if (dao.agregarHistorialInspeccion(rut, descripcion, fecha, equipo, tipo_inspeccion)) {
                    request.setAttribute("msj", "Solicitud ingresada con exito" + info_fecha);
                    request.getRequestDispatcher("solicitarinspeccion.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Solicitud NO Registrada" + " rut " + rut + " descripcion " + descripcion + " fecha " + fecha + " tipo_inspeccion " + tipo_inspeccion + " equipo " + equipo);
                    request.getRequestDispatcher("solicitarinspeccion.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("err", "Solicitud NO Registrada, ingrese una fecha valida mayor a la de hoy");
                request.getRequestDispatcher("solicitarinspeccion.jsp").forward(request, response);
            }

        } catch (Exception e) {
            request.setAttribute("err", "Solicitud NO Registrado " + e.getMessage());
            request.getRequestDispatcher("solicitarinspeccion.jsp").forward(request, response);
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
