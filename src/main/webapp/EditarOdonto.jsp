<%@page import="Logica.Odontologo"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>
<div class="container-fluid">

    <h1>Editar Odontologo</h1>
</div>

<form class="user" action="SV_Editar" method="POST">


    <%
        Odontologo obj = (Odontologo) request.getSession().getAttribute("odonto");
    %>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI" value="<%= obj.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="nombre"
                   placeholder="Nombre" value="<%= obj.getNombre()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="apellido"
                   placeholder="Apellido" value="<%= obj.getApellido()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telefono"
                   placeholder="Telefono" value="<%= obj.getTelefono()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direccion"
                   placeholder="Direccion" value="<%= obj.getDirecion()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="fechanas"
                   placeholder="Fecha de Nacimineto" value="<%= obj.getFech_nac()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name ="especialidad"
                   placeholder="Especialidad"value="<%= obj.getEspecialidad()%>" >
        </div>
    </div>


    <button type="submit" class="btn btn-primary btn-user btn-block">
        Guardar Cambios
    </button>
</form>

<%@include file="/Componentes/footer.jsp" %>