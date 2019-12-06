<!DOCTYPE html>

<body background="19.jpg">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html lang="es">
    <head>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
    <

    <font style="text-align: left; color: black; font-weight: bold;" size="5"> 
        
    </head>
    <body>
        <div class="container">
            <header>
                <h2 style="font-weight: bold;">${message}</h2>
                Click sobre el link <strong><a href="productos">Productos</a></strong> para ver los datos de productos.
                <br>
                Click sobre el link <strong><a href="personas">Personas</a></strong> para ver los datos de personas.
                <br>
                Click sobre el link <strong><a href="papelerias">Papeleria</a></strong> para ver los datos de papelería.
                <br>
                Click sobre el link <strong><a href="telefonos">Telefonia</a></strong> para ver los datos de telefonia.
                <br>
                Click sobre el link <strong><a href="electronicos">Electronicos</a></strong> para ver los datos de electronicos.

            </header>


        </div>
        <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
    	<script src="${contextPath}/resources/js/datatable.js"></script>
    </body>

</html>
