<%-- 
    Document   : index
    Created on : 4/01/2024, 1:21:59 p. m.
    Author     : parko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/Componentes/header.jsp" %>
<%@include file="/Componentes/Body_P_Mitad.jsp" %>
<%@include file="/Componentes/Body_Final.jsp" %>
<div class="container-fluid">
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Odontólogos</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                        </tr>
                    </thead>

                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- Contenedor para los enlaces -->
    <div class="d-flex justify-content-between">
        <a class="collapse-item" href="#" data-toggle="modal" data-target="#agregarHorarioModal">Agregar Nuevo Horario</a>
        <a class="collapse-item" href="#" data-toggle="modal" data-target="#agregarTurnoModal">Agregar Nuevo Turno</a>
    </div>
</div>

<!-- Modal para agregar nuevo horario -->
<div class="modal fade" id="agregarHorarioModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Agregar Nuevo Horario</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="SV_Horario" method="POST" >
                    <select class="custom-select" id="amPmInicio" name="amPmInicio">
                        <!-- codigo java para traer los odontologos sin horaios -->
                        <option value="AM">AM</option>
                    </select>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="horaInicio">Hora Inicio:</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="horaInicio" name="horaInicio">
                                <div class="input-group-append">
                                    <select class="custom-select" id="amPmInicio" name="amPmInicio">
                                        <option value="AM">AM</option>
                                        <option value="PM">PM</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="form-group col-md-6">
                            <label for="horaFin">Hora Fin:</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="horaFin" name="horaFin">
                                <div class="input-group-append">
                                    <select class="custom-select" id="amPmFin" name="amPmFin">
                                        <option value="AM">AM</option>
                                        <option value="PM">PM</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary" >Guardar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- Modal para agregar nuevo turno -->
<div class="modal fade" id="agregarTurnoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Agregar Nuevo Turno</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">

                <form>

                    <div class="form-group col">
                        <label for="hora">Hora:</label>
                        <input type="text" class="form-control" id="hora" name="hora">
                    </div>


                    <button type="submit" class="btn btn-primary">Guardar</button>
                </form>
            </div>
        </div>
    </div>
</div>

<%@include file="/Componentes/footer.jsp" %>