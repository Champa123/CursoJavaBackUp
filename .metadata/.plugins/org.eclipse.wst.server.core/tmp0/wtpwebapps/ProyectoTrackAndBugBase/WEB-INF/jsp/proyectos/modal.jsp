<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="container">
  <h2>Proyecto</h2>
 
  <!-- Modal -->

    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">${proyecto.nombre}</h4>
        </div>
        <div class="modal-body">
           <table class="table table-striped table-bordered table-hover">
           		<tr>
           		<th>Id</th>
           		<th>Descripcion</th>
           		<th>Fecha de inicio</th>
				<th>Fecha de fin</th>
           		<th>Usuario Principal</th>
           		<th>Horas Asignadas</th>
           		<th>Horas Disponibles</th>
           		</tr>
           		<tr>
           			<td>${proyecto.id}</td>
           			<td>${proyecto.descripcion}</td>
           			<td><fmt:formatDate value="${proyecto.fechaInicio}" pattern="yyyy-MM-dd" /></td>
           			<td><fmt:formatDate value="${proyecto.fechaFin}" pattern="yyyy-MM-dd" /></td>
           			<td>${proyecto.usuarioPrincipal.nombreCompleto}</td>
           			<td>${proyecto.horasAsignadas}</td>
           			<td>${proyecto.horasAsignadas - proyecto.sumaHorasTareas}</td>
           		</tr>
           </table>
           <h4 class="modal-subtitle">Usuarios</h4>
            <table class="table table-striped table-bordered table-hover">
           		<tr>
           		<th>Id</th>
           		<th>Nombre</th>
           		<th>Fecha de inicio</th>
				</tr>
				
				<c:forEach items="${usuarios}" var="u">
				<tr>
				<td>${u.id}</td>
				<td>${u.nombreCompleto}</td>
				<td>${u.fechaAlta}</td>
				</tr>
				</c:forEach>
				</table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
 