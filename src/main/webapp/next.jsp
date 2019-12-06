<!DOCTYPE html>
<body background="fondo.jpg">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html lang="es">
    <head>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
    </head>
    <body>
        <font style="color: black;">

        <div class="container">
            <header style="font-weight: bold; color: white;" >
            <h1>JILBERTO MARTINEZ VASQUEZ</h1>
                <h2>${message}</h2>
                Click sobre el link para <strong><a href="/">regresar</a></strong> al menú principal.
            </header>

            <h1 style="color: white;">Lista de productos</h1>

            <div class="starter-template" >
                <table style="font-weight: bold; background-color: lightGray"  class="table table-striped table-hover table-condensed table-bordered">
                    <tr>
                     <th>N. Lista</th>
                     <th>Marca</th>
                     <th>Modelo</th>
                     <th>Descripción</th>
                     <th>Creado en</th>
                     <th>Precio</th>
                    </tr>
                    <c:forEach var="producto" items="${productos}">
                     <tr>
                      <td>${producto.id}</td>
                      <td>${producto.nombre}</td>
                      <td>${producto.modelo}</td>
                      <td>${producto.descripcion}</td>
                      <td>${producto.ciudad}</td>
                      <td>${producto.precio}</td>

                     </tr>
                    </c:forEach>
                </table>
            </div>

<!-- -- >
            <h2>Empleando la rest Api</h2>
            <div class="starter-template">
                <table id="productosTable" class="display">
                   <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Descripcion</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>id</th>
                            <th>nombre</th>
                            <th>descripcion</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
-->

        </div>
        <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
    	<script src="${contextPath}/resources/js/datatable.js"></script>
    </body>

</html>
