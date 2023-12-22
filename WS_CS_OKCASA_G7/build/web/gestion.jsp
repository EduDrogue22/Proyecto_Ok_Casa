
<!DOCTYPE html>
<html>
    <body>
        <%@include file="menu.jsp" %>
        <div class="jumbotron text-center"
             style="background-image: url('IMG/header.jpg')">
            <img src="IMG/check.png" alt="" width="15%"/>
            <h1 style="color: cadetblue;  background-color: antiquewhite" >Gestionar Inspecciones</h1>
        </div>

        <div class="text-center" style="border: 1px solid black; width: 80%; margin: auto; border-radius: 30% 30% 0% 0%; background-color: antiquewhite">
            <h2 style="color: black">Datos Seguimiento</h2>
            <br>
            <div class="row">
                <!-- Columnas de la izquierda -->
                <!-- Columnas del centro -->
                <div style="margin: aut; text-align:center" >
                    <form action="servletGestionar" method="POST" >
                        <div  style="margin: auto; width: 80%">
                        <table class="table">
                            <tr>
                                <td>Id Seguimiento</td>
                                <td><input type="text" name="txtId" class="form-control" style="width: 80%"
                                           placeholder="Ingrese Id Seguimiento aquí..." required></td>
                            </tr>
                            <tr>
                                <td>Nuevo Estado Los Estado son R - P - F</td>
                                <td><input type="text" name="txtEstado" class="form-control"  style="width: 80%"
                                           placeholder="Ingrese el estado de seguimiento aquí-..." required></td>
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
                                           name="btnLogin" value="Cambiar estado"></div>
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