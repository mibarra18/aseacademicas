<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!-- 
	Descripción:	Proyecto integradora.
	Autor:		Equipo "Asesorias academicas".
	Fecha:		Mayo-Agosto.	
 -->
<!DOCTYPE html> 
<html lang="es">
	<head>
		<meta charset="UTF-8">
	    <title><tiles:getAsString name="title"/></title> <!-- Es un título dinámico --> 
	    <meta name="viewport" content="with=device-width, initial-scale=1,shrink-to-fit=no">
	    <link href="<c:url value='/resources/css/bootstrap.min.css' />"  rel="stylesheet">
	    <link href="<c:url value='/resources/css/miestilo.css' />"  rel="stylesheet">
	</head>
<body>

	<div class="container">
		<!-- Inicio de Sección de header -->
		<div class="row">
			<div class="col-md-12">
	            
			</div>
		</div>
		<!-- Fin de Sección de header -->
		
		<!-- Inicio de Sección de body -->
		<div class="row">
				<tiles:insertAttribute name="body" />
		</div>
		<!-- Fin de Sección de Body -->

		<!-- Inicio de Sección de Footer -->
		<div class="row">
			<div class="col-md-12">
	            <tiles:insertAttribute name="pie" />
			</div>
		</div>
		<!-- Fin de Sección de Body -->
	</div>

	<!-- Script javaScript -->
	<script src="<c:url value='/resources/js/jquery-3.4.1.min.js' />"></script>
	<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
</body>
</html>