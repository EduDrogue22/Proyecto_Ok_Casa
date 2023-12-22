<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center"
             style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite" >Iniciar Sesión</h1>
        </div>

        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2 style="color: black">Iniciar Sesión</h2>
            <div class="row">
                <!-- Columnas de la izquierda -->
                <div class="col-sm-2" ></div>
                <!-- Columnas del centro -->
                <div class="col-sm-8" >
                    <form action="servletLogin" method="POST">
                        <table class="table">
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="txtUsuario" class="form-control"
                                           placeholder="Ingrese usuario aquí..." required></td>
                            </tr>
                            <tr>
                                <td>Contraseña</td>
                                <td><input type="password" name="txtContrasena" class="form-control"
                                           placeholder="Ingrese su contraseña aquí..." required></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" class="btn btn-primary" 
                                           name="btnLogin" value="Iniciar Sesión"></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <c:if test="${msj!=null}">
                                        <div class="alert alert-success">${msj}</div>
                                    </c:if>
                                    <c:if test="${err!=null}">
                                        <div class="alert alert-danger">${err}</div>  
                                    </c:if>

                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                <!-- Columnas de la derecha -->
            </div>
            <div class="text-center">
                ¿Olvidaste tu contraseña?
                <a href="contraseña.jsp">Recuperar Contraseña</a>
            </div>
            <br>

            <div class="text-center">
                ¿No Tienes Usuario?
                <a href="registrarse.jsp">Registrate</a>
            </div>
            <br>
        </div>

    </body>
</html>