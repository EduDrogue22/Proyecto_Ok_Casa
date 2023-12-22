/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PagoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "servletAgregarPago", urlPatterns = {"/servletAgregarPago"})
public class servletAgregarPago extends HttpServlet {

    int total_pagar_servlet = 0;

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
            out.println("<title>Servlet servletAgregarPago</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAgregarPago at " + request.getContextPath() + "</h1>");
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
    protected void doGet2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("pago", total_pagar_servlet);
        request.getRequestDispatcher("pago.jsp").forward(request, response);
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
        PagoDAO dao = new PagoDAO();
        System.out.println("ENTRO A POST");
        try {
            HttpSession sesion = request.getSession();
            String rut_usuario = (String) sesion.getAttribute("user_rut");
            //System.out.println("rut usarui sesion "+ rut_usuario);
            String rut = rut_usuario;
            String banco = request.getParameter("txtBanco");
            String historiales_precio = request.getParameter("txtHistorialPrecio");
            //int monto = dao.descuento(rut, dao.buscar_historial_rut(rut).get((dao.buscar_historial_rut(rut).size()-1)).getMonto_post_descuento());
            int monto = Integer.parseInt(request.getParameter("txtMontoPago"));
            if (!"".equals(historiales_precio)) {
                if (dao.informacionWebpay(rut).getRut() != null && dao.informacionWebpay(rut).getNBanco().equals(banco)) {
                    if (dao.informacionWebpay(rut).getSaldo() >= monto) {
                        if (dao.atualizarSaldoWebpay(rut, monto)) {
                            if (dao.agregarPago(banco, historiales_precio)) {
                                //request.setAttribute("txtRut",rut );
                                request.setAttribute("msj", "PAGO REALIZADO CON EXITO");
                                //request.setAttribute("monto", dao.descuento(rut, monto));
                                //request.setAttribute("total_pagar_servlet", dao.descuento(rut, monto));
                                request.getRequestDispatcher("pago.jsp").forward(request, response);

                            } else {
                                request.setAttribute("err", "SALDO INSUFICUENTE PARA PAGAR");
                                request.getRequestDispatcher("pago.jsp").forward(request, response);
                            }
                        } else {
                            request.setAttribute("err", "Saldo no actualizado en su cuenta webpay");
                            request.getRequestDispatcher("pago.jsp").forward(request, response);
                        }

                    } else {
                        request.setAttribute("err", "Saldo insuficiente en su cuenta");
                        request.getRequestDispatcher("pago.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("err", "Error, Seleccione banco al que pertenezca");
                    request.getRequestDispatcher("pago.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("err", "Error, Seleccione Inspecciones a pagar");
                request.getRequestDispatcher("pago.jsp").forward(request, response);
            }
            //System.out.println("prosear pago "+ dao.procesarPago(monto, monto_pagar));
        } catch (Exception e) {
            request.setAttribute("err", "Pago NO Registrado en doPost" + e.getMessage());
            request.getRequestDispatcher("pago.jsp").forward(request, response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession sesion = request.getSession();
            String rut_usuario = (String) sesion.getAttribute("user_rut");
            //System.out.println("rut usarui sesion "+ rut_usuario);
            String rut = rut_usuario;
            PagoDAO dao = new PagoDAO();
            if (dao.cliente_con_credito(rut)) {
                request.setAttribute("msj", "Usted posee descuentos por parte de Banco estado");
                request.getRequestDispatcher("pago.jsp").forward(request, response);
            } else {
                request.setAttribute("msj", "Usted NO posee descuentos por parte de Banco estado");
                request.getRequestDispatcher("pago.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("err", "Pago NO Registrado exception" + e.getMessage());
            request.getRequestDispatcher("pago.jsp").forward(request, response);

        }
    }

    /**
     * protected void doGet(HttpServletRequest request, HttpServletResponse
     * response) throws ServletException, IOException { try { HttpSession sesion
     * = request.getSession(); String rut_usuario = (String)
     * sesion.getAttribute("user_rut"); //System.out.println("rut usarui sesion
     * "+ rut_usuario); String rut = rut_usuario; PagoDAO dao = new PagoDAO();
     * if (dao.buscar_historial_rut(rut) != null) { request.setAttribute("msj",
     * "TOTAL A PAGAR " + dao.descuento(rut,
     * dao.buscar_historial_rut(rut).get((dao.buscar_historial_rut(rut).size()-1)).getMonto_post_descuento())
     * + " Por favor ingrese su banco y monto a pagar");
     * request.getRequestDispatcher("pago.jsp").forward(request, response); }
     * else { request.setAttribute("err", "Pago NO Registrado");
     * request.getRequestDispatcher("pago.jsp").forward(request, response); } }
     * catch (Exception e) { request.setAttribute("err", "Pago NO Registrado
     * exception" + e.getMessage());
     * request.getRequestDispatcher("pago.jsp").forward(request, response);
     *
     * }
     * }
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public int getServletInfoPago() {
        return total_pagar_servlet;
    }// </editor-fold>

}
