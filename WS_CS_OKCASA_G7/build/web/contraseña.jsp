<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar Contraseña</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center"
             style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite" >Cambiar contraseña</h1>
        </div>

        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2 style="color: black">Datos Usuario</h2>
            <br>
            <div class="row">
                <!-- Columnas de la izquierda -->
                <!-- Columnas del centro -->
                <div style="margin: aut; text-align:center" >
                    <form action="servletContrasenia" method="POST" >
                        <div  style="margin: auto; width: 80%">
                        <table class="table">
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="txtUsuario" class="form-control" style="width: 80%"
                                           placeholder="Ingrese usuario aquí..." required></td>
                            </tr>
                            <tr>
                                <td>Nueva Contraseña</td>
                                <td><input type="password" name="txtContrasena" class="form-control"  style="width: 80%"
                                           placeholder="Ingrese su contraseña aquí..." required></td>
                            </tr>
                        </table>
                            </div>
                        <div class="text-center" style="margin: auto; width: 80%">
                            <c:if test="${msj!=null}">
                                        <div class="alert alert-success">${msj}</div>
                                    </c:if>
                                    <c:if test="${err!=null}">
                                        <div class="alert alert-danger">${err}</div>  
                                    </c:if>
                        <input type="submit" class="btn btn-primary" 
                                           name="btnLogin" value="Cambiar Contraseña"></div>
                    </form>
                    <br>
                </div>
                <!-- Columnas de la derecha -->
            </div>
            <div class="text-center">
                <a  href="index.jsp"><input type="submit" class="btn btn-primary" 
                                           name="btnLogin" value="Volver a Inicio"></a>
            </div>
            <br>
        </div>

    </body>
</html>