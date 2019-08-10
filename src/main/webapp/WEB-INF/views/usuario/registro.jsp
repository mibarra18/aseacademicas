<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="row cabecera">
	<div class="col-md-4">
		<img src="../resources/imagenes/ut.jpeg" class="img-fluid"
			alt="Responsive image">
	</div>
	<div class="col-md-8">
		<h1>Asesorias Academicas UTNG</h1>
	</div>
</div>

<h6></h6>
<h2 class="recuperar">Registro de nuevo usuario</h2>

<form:form method="POST" modelAttribute="usuario" action="/integradora/usuario/add">
	   <center> <table>
	    <tr>
			<td><label for="idUsuario">Número de control: </label></td>
			<td><form:input path="idUsuario" id="idUsuario" /></td>
			<td><form:errors path="idUsuario" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="correo">Correo: </label></td>
			<td><form:input path="correo" id="correo" /></td>
			<td><form:errors path="correo" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="username">Username: </label></td>
			<td><form:input path="username" id="username" /></td>
			<td><form:errors path="username" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="nombre">Nombre(s): </label></td>
			<td><form:input path="nombre" id="nombre" /></td>
			<td><form:errors path="nombre" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="apellidoP">Apellido Paterno: </label></td>
			<td><form:input path="apellidoP" id="apellidoP" /></td>
			<td><form:errors path="apellidoP" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="apellidoM">Apellido Materno: </label></td>
			<td><form:input path="apellidoM" id="apellidoM" /></td>
			<td><form:errors path="apellidoM" cssClass="error" /></td>
		</tr>
	
			<tr>
			<td><label for="contrasena">Contraseña: </label></td>
			<td><form:input path="contrasena" id="contrasena" /></td>
			<td><form:errors path="contrasena" cssClass="error" /></td>
		</tr>
		
		<tr>
			<td><label for="idGrupo">Grupo: </label></td>
			<td><form:select path="idGrupo" items="${grupos}" itemLabel="nombre" itemValue="idGrupo"/></td>
		</tr>
		
	
		<tr>
			<td><label for="idTipoUsuario">Tipo de usuario: </label></td>
			<td><form:select path="" items="${tipoUsuarios}" itemLabel="tipo" itemValue="idTipoUsuario" /></td>
		</tr>
		<tr>
		<td colspan="3">
		<input type="submit" value="Registrar"/>
	  </td>
	  </tr>
</table> </center> 
	
</form:form>

<br />
<br />

