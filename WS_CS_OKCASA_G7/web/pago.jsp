<%-- 
    Document   : index
    Created on : 01-06-2022, 0:43:31
    Author     : 56975
--%>

<%@page import="Clases.HistorialPagoAUX"%>
<%@page import="Clases.Bancos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pago</title>
        <script language="javascript" type="text/javascript">
            var total = 0;
            var l = [];
            var l_h_p = []
            var l_precios = [];
            var index = 0;
            function sumar(valor, id_h, precio) {
                total += valor;
                document.getElementById("txtMontoPago").value = total;
                l.push(id_h);
                l_precios.push([id_h,precio]);
                document.getElementById("txtHistorialPrecio").value = l_precios;
                console.log(l_precios);
            }
            function restar(valor, id_h) {
                total -= valor;
                document.getElementById("txtMontoPago").value = total;
                l = l.filter((item) => item !== id_h);
                l_precios = l_precios.filter((item) => item[0] !== id_h);
                document.getElementById("txtHistorialPrecio").value = l_precios;
                console.log(l_precios);
            }
        </script>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite">Pago inspección</h1>
        </div>
        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2>Realizar Pago</h2>
            <form action="servletAgregarPago"  method="get">
                <table class="table table">
                    <!--<tr>
                        <td>Rut</td>
                        <td><input type="text" name="txtRut" class="form-control" placeholder="Rut" required></td>
                    </tr>-->
                    <tr>
                        <td>Consultar Descuento</td>
                        <td><input type="submit" onclick="myFunction()" name="btnConsultar" value="Consultar" class="btn btn-success"></td>
                    </tr>
                </table>
                <script>
                    function myFunction() {
                        alert("Hola!\nSi es Cliente con credito hipotecario en Banco estado\nposee un 50% de descuento.");
                    }
                </script>
            </form>
            <c:if test="${msj!=null}">
                <table class="table table">
                    <form  action="servletAgregarPago" method="POST">
                        <div name="txtTotalPagar" class="alert alert-success">${msj}</div>
                        <tr>
                            <td>
                                <jsp:useBean id="cn3" class="DAO.PagoDAO" scope="page"></jsp:useBean>
                                <%
                                    String rut_usuario = (String) session.getAttribute("user_rut");
                                    List<HistorialPagoAUX> lista3 = cn3.pagar_historial_rut(rut_usuario);
                                    for (HistorialPagoAUX l3 : lista3) {
                                %>
                                <label><input name="id" type="checkbox" id="clt" onclick="if (this.checked)
                                        sumar(<%=l3.getMonto_post_descuento()%>,<%=l3.getId_historial()%>,<%=l3.getMonto_post_descuento()%>);
                                    else
                                        restar(<%=l3.getMonto_post_descuento()%>,<%=l3.getId_historial()%>,<%=l3.getMonto_post_descuento()%>)" value="<%=l3.getId_historial()%>"> <%=l3.getdescripcion()%> ; valor <%=l3.getMonto_post_descuento()%>  </label><br>
                                <%}%></td>
                            
                        <td>
                             
                        </tr>
                        <!--<div style="visibility: hidden">
                            <div>
                            Id historial <input  name="txtIdHistorial" type="text" id="txtIdHistorial" /></div>-->
                        <div style="visibility: hidden">
                            Precios historial <input  name="txtHistorialPrecio" type="text" id="txtHistorialPrecio" /></div>
                        <tr>
                            <td>Rut</td>
                            <td>
                                <%
                                    out.print(rut_usuario);
                                %></td>
                        </tr>
                        <tr>
                            <td>Ingrese Banco </td>
                            <td>
                                <jsp:useBean id="cn2" class="DAO.PagoDAO" scope="page"></jsp:useBean>
                                <%
                                    List<Bancos> lista2 = cn2.listaBancos();
                                %>
                                <select name="txtBanco">
                                    <option >Seleccione Banco</option>
                                    <%
                                        for (Bancos l : lista2) {
                                    %>
                                    <option value="<%=l.getN_bancos()%>"><%=l.getN_bancos()%></option>
                                    <%}%>
                                </select>
                            </td>
                        </tr>

                        <!--<tr>
                            <td>Ingrese su Monto a pagar </td>
                            <td><input type="number" name="txtMontoPago" class="form-control" placeholder="Ingrese su monto aquí" required></td>
                            <td name="txtTotal" style="visibility: hidden">${monto}</td>
                        </tr>-->


                        </table>
                        <input type="submit"  name="btnGuardar" value="Pagar" class="btn btn-success">  
                    </form>
                </c:if>
                <c:if test="${err!=null}">
                    <div class="alert alert-danger">${err}</div>
                </c:if>
        </div>
    </body>

</html>
