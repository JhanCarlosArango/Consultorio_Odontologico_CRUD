<%-- 
    Document   : Verusuario
    Created on : 18/01/2024, 9:35:07 a. m.
    Author     : parko
--%>

<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>

<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
    <p class="mb-4"> Todos los Usuarios del Sistema.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Rol</th>
                            <th style="width: 210px">Accion</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Rol</th>
                            <th style="width: 110px">Accion</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <% List<Usuario> lista = (List) request.getSession().getAttribute("listusuario");

                            if (lista != null && !lista.isEmpty()) {
                                for (Usuario elem : lista) {
                        %>
                        <tr>
                            <td><%= elem.getId_usuario()%></td>
                            <td><%= elem.getNom_Usuario()%></td>
                            <td><%= elem.getRol()%></td>
                            
                            <td style= "display: flex;width: 100 px">
                                <form name="eliminar" action="SV_EliminarU" method="POST">
                                    <button type="submit" class ="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 15px">
                                        <i class="fas fa-trash-alt"></i>
                                        Eliminar
                                    </button>
                                    <input type="hidden" name="id" value="<%=elem.getId_usuario()%>"> <!-- guardo l id en un campo oculto para enviarlo al sevlet-->
                                </form>
                                <form name="eliminar" action="SV_EditarU" method="GET">
                                    <button type="submit" class ="btn btn-primary btn-user btn-block" style="background-color: green; margin-left:15px">
                                        <i class="fas fa-pencil-alt"></i>
                                        Editar
                                    </button>
                                    <input type="hidden" name="id" value="<%=elem.getId_usuario()%>"> <!-- guardo l id en un campo oculto para enviarlo al sevlet-->
                                </form>
                            </td>
                        </tr>
                        <%
                                   
                                }
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