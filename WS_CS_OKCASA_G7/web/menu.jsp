<%-- 
    Document   : menu
    Created on : 01-06-2022, 19:24:40
    Author     : 56975
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title></title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp">OkCasa</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Inicio</a></li>




                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <c:if test="${username==null}">
                        <li><a href="iniciarsesion.jsp"><span class="glyphicon glyphicon-log-in"></span> Iniciar Sesión</a></li>
                        </c:if>
                        <c:if test="${username!=null}">
                        <li><a href="historial.jsp">Mi historial</a></li>
                        <li><a href="pago.jsp">Pago</a></li>
                        <li><a href="solicitarinspeccion.jsp">Solicitar</a></li>
                        <li><a href="seguimiento.jsp">Seguimiento</a></li>
                        <a href="servletLogin" class="btn btn-danger">Cerrar Sesión</a>
                        <c:if test="${tipo==1}">
                            <li><a href="gestion.jsp">Gestion</a></li>
                        </c:if>
                    </c:if>
                </ul>
            </div>
        </nav>
    </body>
</html>
