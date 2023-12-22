<%-- 
    Document   : index
    Created on : 01-06-2022, 0:43:31
    Author     : 56975
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite">Bienvenido a OkCasa</h1>
        </div>
        <div class="jumbotron text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            
            <br>
            <c:if test="${username!=null}">
                <c:if test="${tipo!=0}">
                    <h2>Bienvenido ${username}
                    </h3>
                    <br>
                </c:if>
            </c:if>
            <h3 style="padding-left: 5%; padding-right: 5% ">Nosotros OkCasa somos una empresa que se dedica a la inspección
                de tu nueva casa o departamento, ofreciendo un servicio de calidad
                a todos nuestros clientes, si quieres que inspeccionemos tu nuevo hogar.
                ¡No dudes en solicitar nuestro servicios!.</h3>
            <br>
            <c:if test="${username==null}">
                <a href="registrarse.jsp" class="btn btn-info" role="button">Registrate</a>
            <a href="iniciarsesion.jsp" class="btn btn-primary" role="button">Iniciar Sesión</a>
            </c:if>
            
        </div>
    </body>
</html>
