<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>
<div class="container-fluid">

    <h1>Agregar Odontologos</h1>
    <p>Este apartado es para Agregar los odontologos al sistema</p>
</div>
<form class="user" action="SV_Odonto" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telefono"
                   placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direccion"
                   placeholder="Direccion">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="fechanas"
                   placeholder="Fecha de Nacimineto">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name ="especialidad"
                   placeholder="Especialidad">
        </div>
    </div>
    <!--<!-- Aqui va lo faltante para tenimar el registro del odontologo -->
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Agregar Odontologo
    </button>
</form>

<%@include file="/Componentes/footer.jsp" %>