<%-- 
    Document   : index
    Created on : 01-06-2022, 0:43:31
    Author     : 56975
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historial</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite">Mi historial</h1>
        </div>
        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2>Mi historial</h2>
            <p>Resultados de la inspección de su hogar.</p>    
            <form action="servletListaHistorial"  method="post">
                <table class="table table-hover">
                    <thead>
                        
                        <!--<tr>
                            <td>Rut</td>
                            <td><input type="text" name="txtRut" class="form-control" placeholder="Rut" required></td>
                        </tr>-->
                        <tr>
                            <td>Consultar Historial</td>
                            <td><input type="submit" name="btnConsultar" value="Consultar" class="btn btn-success"></td>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:if test="${msj!=null}">
                        <table class="table table-hover text-center" >
                            <thead>
                            <tr>
                                <th>id historial</th>
                                <th>Descripción</th> 
                                <th>Fecha</th> 
                            </tr>
                        </thead>
                        <c:forEach  var="item" items="${msj}">
                            <tr>
                                <td><c:out value="${item.getId_historial()}"/></td>
                                <td><c:out value="${item.getDescripcion()}"/></td>
                                <td><c:out value="${item.getFecha_inspeccion()}"/></td>
                            </tr>
                        </c:forEach>
                        </table>
                        </c:if>
                        <c:if test="${err!=null}">
                        <div class="alert alert-danger">${err}</div>
                    </c:if>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
