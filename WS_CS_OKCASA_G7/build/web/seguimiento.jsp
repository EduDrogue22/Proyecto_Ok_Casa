<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="Clases.Seguimiento"%>
<%@page import="DAO.SeguimientoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguimiento Inspección</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue ; background-color: antiquewhite">Seguimiento</h1>
        </div>
        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2>Mi Seguimiento</h2>
            <form action="servletSeguimiento"  method="post">
                <table class="table table">
                    <!--<tr>
                        <td>Rut</td>
                        <td><input type="text" name="txtRut" class="form-control" placeholder="Rut" required></td>
                    </tr>-->
                    <tr>
                        <td>Consultar Seguimiento</td>
                        <td><input type="submit" name="btnConsultar" value="Consultar" class="btn btn-success"></td>
                    </tr>
                </table>

                <c:if test="${msj!=null}"> 
                    <table class="table table-hover text-center" >
                        <thead>
                            <tr>
                                <th>ID HISTORIAL</th>
                                <th>ESTADO</th> 
                            </tr>


                        </thead>
                        <c:forEach  var="item" items="${msj}">
                            <tr>
                                <td><c:out value="${item.getId_historial()}"/></td>
                                <td><c:if test="${item.getEstado_seguimiento() == 'F'}">Finalizado</c:if>
                                    <c:if test="${item.getEstado_seguimiento() == 'P'}">Progreso</c:if>
                                    <c:if test="${item.getEstado_seguimiento() == 'R'}">Revision</c:if></td>

                                </tr>
                        </c:forEach> 
                    </table>
                </c:if>
                <c:if test="${err!=null}">
                    <div class="alert alert-danger">${err}</div>
                </c:if>
                </div>
                </body>
                </html>