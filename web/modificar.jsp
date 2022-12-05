<%-- 
    Document   : modificar
    Created on : 4/12/2022, 04:05:31 PM
    Author     : Daniel Arias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario</title>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <form action="update" method="post">

            <h2>Modificar</h2>
            <div>
                <label for="">Escribe tu nombre</label>
                <input id="nombre" type="text" name="nombre" required="required" value="<c:out value="${correo.nombre}"/>">
            </div>
            <div>
                <label for="">Escribe tu correo</label>
                <input id="correo" type="text" name="correo" required="required" value="<c:out value="${correo.correo}"/>">
            </div>
            <div>
                <input id="cod" type="hidden" name="codigo" required="required" value="<c:out value="${correo.id}"/>">
            </div>
            <button type="submit" id="btn-enviar-datos" class="btn-form"><i class="fas fa-paper-plane"></i>&nbsp;Actualizar</button>

        </form>
        <script src="https://kit.fontawesome.com/f24051bb43.js" crossorigin="anonymous"></script>
    </body>
</html>
