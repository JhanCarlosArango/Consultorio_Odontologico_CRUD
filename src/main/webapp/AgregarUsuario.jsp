<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>
<div class="container-fluid">

    <h1>Agregar Usuarios</h1>
    <p>Este apartado es para Agregar los Diferentes usuarios del sistema</p>
</div>
<form class="user" action="SV_Usuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="username" name="username"
                   placeholder="Nombre Usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contra" name="contra"
                   placeholder="Contraseña">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol">
        </div>
    </div>

    <button type="submit" class="btn btn-primary btn-user btn-block">
        Crear Usuario
    </button>>
</form>

<%@include file="/Componentes/footer.jsp" %>