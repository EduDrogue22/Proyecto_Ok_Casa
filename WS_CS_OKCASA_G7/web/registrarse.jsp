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
        <title>Inicio</title>
    </head>

    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center" style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%" />
            <h1 style="color: cadetblue;  background-color: antiquewhite">OkCasa</h1>

        </div>
        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2 style="color: black">Registrate</h2>
            <br>
            <form action="servletRegistrarUsuario" method="POST">
                <div>
                <input type="text" placeholder="Rut" name="Rut">
                </div>
                <br>
                <div>
                    <input type="text" placeholder="Nombre Completo" name="Nombre">
                </div>
                <br>
                <div>
                    <input type="text" placeholder="Usuario" name="Usuario">
                </div>
                <br>
                <div>
                    <input type="password" placeholder="Contraseña" name="Contrasenia">
                </div>
                <br>
                <div class="text-center">
                    <input type="submit" name="btnGuardar" value="Guardar" class="btn btn-info">
                    <a href="index.jsp" class="btn btn-primary" role="button">Volver a Inicio</a>
                </div>
                <c:if test="${msj!=null}">
                                        <div class="alert alert-success">${msj}</div>
                                    </c:if>
                                    <c:if test="${err!=null}">
                                        <div class="alert alert-danger">${err}</div>
                                    </c:if>
                <br>
                
            </form>
            
        </div>

    </body>

</html>