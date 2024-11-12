<%-- 
    Document   : AgregarUsuario
    Created on : 5/01/2024, 3:59:17 p. m.
    Author     : parko
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>
<div class="container-fluid">

    <h1>Agregar Usuarios</h1>
    <p>Este apartado es para Agregar los Diferentes usuarios del sistema</p>

</div>
<%
    Usuario usu = (Usuario) request.getSession().getAttribute("editar");
%>
<form class="user" action="SV_EditarU" method="POST">

    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="username" name="usernamee"
                   placeholder="Nombre Usuario" value="<%= usu.getNom_Usuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contra" name="contraa"
                   placeholder="Contraseña" value="<%= usu.getPassword()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="roll"
                   placeholder="Rol" value="<%= usu.getRol()%>">
        </div>
    </div>

    <button type="submit" class="btn btn-primary btn-user btn-block">
        Guardar Cambios
    </button>
</form>

<%@include file="/Componentes/footer.jsp" %>