<%-- 
    Document   : index
    Created on : 01-06-2022, 0:43:31
    Author     : 56975
--%>
<%@page import="Clases.Inspeccion"%>
<%@page import="DAO.HistorialInspeccionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitar Inspeccion</title>
        <script language="javascript" type="text/javascript">
            function validarFechaMenorActual(date) {
                var x = new Date();
                var fecha_aux = date.split("/");
                fecha_aux = date.split("-");
                var fecha = new Date(parseInt(fecha_aux[0]), parseInt(fecha_aux[1] - 1), parseInt(fecha_aux[2]));
                var today = new Date();
                today.setHours(0, 0, 0, 0);
                var aviso = document.getElementById("info");
                console.log("fecha ",fecha);
                console.log("today ",today);
                if (fecha > today){
                    console.log("if ",true);
                    aviso.innerHTML = "";
                    document.getElementById("txtInfo").value = true;}
                else{
                    console.log("if ",false);
                    aviso.innerHTML = "Ingrese un fecha despues de la actual";
                    document.getElementById("txtInfo").value = false;}
            }
        </script>
    </head>

    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%" />
            <h1 style="color: cadetblue; background-color: antiquewhite">Solicitar</h1>

        </div>
        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2 style="color: black">Solicitar Inspección</h2>
            <!--CONECTAR CON HISTORIAL-->
            <form action="servletAgregarHistorialInspeccion" method="POST">


                <!-- <br> Rut
                 <br>
                 <div>
                     <input type="text" placeholder="Rut" name="txtRut" >
                 </div>-->
                <br> Descripcion inspección
                <br>
                <div>
                    <input type="text" placeholder="Descripción" name="txtDescripcion" style="width: 80%; margin: auto; ">
                </div>
                <br> Fecha para inspección
                <div>
                    <input type="date" name="txtfecha"  onclick="validarFechaMenorActual(this.value)">
                    <p class="text-center" id="info" name="info"></p>
                   
                </div>

                <br> Tipo de Inspección
                <div>
                    <jsp:useBean id="cn2" class="DAO.InspeccionDAO" scope="page"></jsp:useBean>
                    <%
                        List<Inspeccion> lista2 = cn2.listarInpecciones();
                    %>

                    <select name="txtTipo_inspeccion">
                        <option >Seleccione Tipo Inspeccion</option>
                        <%
                            for (Inspeccion l : lista2) {
                        %>
                        <option value="<%=l.getId_inspeccion()%>"><%=l.getNombre_inspeccion() + " $" + l.getPrecio()%></option>
                        <%}%>
                    </select>
                </div>
                <br> Equipo Disponible
                <div>

                    <jsp:useBean id="cn" class="DAO.HistorialInspeccionDAO" scope="page"></jsp:useBean>
                    <%
                        List<String> lista = cn.equiposDisponibles();
                    %>

                    <select name="txtnombre_equipo">
                        <option >Seleccione Equipo</option>
                        <%
                            for (int i = 0; i < lista.size(); i++) {
                        %>
                        <option value="<%=lista.get(i)%>"><%=lista.get(i)%></option>
                        <%}%>

                    </select>
                </div>
                 <div style="visibility: hidden">txtInfo <input  name="txtInfo" type="text" id="txtInfo" /></div>
                <div class="text-center">
                    <input type="submit" name="btnGuardar" value="Solicitar Inspeccion" class="btn btn-success">
                </div>
                
                <br>
                <c:if test="${msj!=null}">
                    <div class="alert alert-success">${msj}</div>
                </c:if>
                <c:if test="${err!=null}">
                    <div class="alert alert-danger">${err}</div>
                </c:if>
            </form>
        </div>

    </body>

</html>