<%@page import="java.util.List"%>
<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>

<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Odotologos</h1>
    <p class="mb-4"> Todos los Odontologos del Sistema.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Odontologos</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>Fecha Nacimiento</th>
                            <th>Especialidad</th>
                            <th style="width: 210px">Accion</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>Fecha Nacimiento</th>
                            <th>Especialidad</th>
                            <th style="width: 110px">Accion</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <%
                            List<Odontologo> listodonto = (List) request.getSession().getAttribute("Odonto");
                            if (listodonto != null && !listodonto.isEmpty()) {
                                for (Odontologo obj : listodonto) {
                                    System.out.println(obj.getApellido());
                        %>
                        <tr>
                            <td><%= obj.getId()%></td>
                            <td><%= obj.getDni()%></td>
                            <td><%= obj.getNombre()%></td>
                            <td><%= obj.getApellido()%></td>
                            <td><%= obj.getTelefono()%></td>
                            <td><%= obj.getDirecion()%></td>
                            <td><%= obj.getFech_nac()%></td>
                            <td><%= obj.getEspecialidad()%></td>
                            <td style= "display: flex;width: 100 px">
                                <form name="eliminar" action="SV_Eliminar" method="POST">
                                    <button type="submit" class ="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 15px">
                                        <i class="fas fa-trash-alt"></i>
                                        Eliminar
                                    </button>
                                    <input type="hidden" name="id" value="<%= obj.getId()%>"> <!-- guardo l id en un campo oculto para enviarlo al sevlet-->
                                </form>
                                <form name="editar" action="SV_Editar" method="GET">
                                    <button type="submit" class ="btn btn-primary btn-user btn-block" style="background-color: green; margin-left:15px">
                                        <i class="fas fa-pencil-alt"></i>
                                        Editar
                                    </button>
                                    <input type="hidden" name="id" value="<%= obj.getId()%>"> <!-- guardo l id en un campo oculto para enviarlo al sevlet-->
                                </form>
                            </td>
                        </tr>

                        <%                            }
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
<%@include file="/Componentes/footer.jsp" %>