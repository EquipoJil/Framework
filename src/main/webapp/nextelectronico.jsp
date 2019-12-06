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
            <header style="font-weight: bold; color: white;">
                <h1>HERMILA INTZIN LOPEZ</h1>
                <strong><a href="/">Regresar</a></strong> al menú principal.
            </header>

            <h1 style="color: white;">Lista de Electronicos</h1>

            <div class="starter-template">
                <table style="font-weight: bold; background-color: lightGray"  class="table table-striped table-hover table-condensed table-bordered">
                    <tr>
                     <th>Id</th>
                     <th>Nombre</th>
                     <th>Marca</th>
                     <th>Modelo</th>
                     <th>Descripción</th>

                    </tr>
                    <c:forEach var="electronico" items="${electronicos}">
                     <tr>
                      <td>${electronico.id}</td>
                      <td>${electronico.nombre}</td>
                      <td>${electronico.marca}</td>
                      <td>${electronico.modelo}</td>
                      <td>${electronico.descripcion}</td>

                     </tr>
                    </c:forEach>
                </table>
            </div>

        </div>
        <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

    </body>

</html>
