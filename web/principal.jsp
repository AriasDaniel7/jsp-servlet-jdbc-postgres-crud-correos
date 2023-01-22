<%-- 
    Document   : principal
    Created on : 30/11/2022, 11:37:55 PM
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
        <form action="insert" method="post">

            <h2>Formulario</h2>
            <div>
                <label for="">Escribe tu nombre</label>
                <input id="nombre" type="text" name="nombre" required="required">
            </div>
            <div>
                <label for="">Escribe tu correo</label>
                <input id="correo" type="text" name="correo" required="required">
            </div>
            <button type="submit" id="btn-enviar-datos" class="btn-form"><i class="fas fa-paper-plane"></i>&nbsp;Enviar
                datos</button>

        </form>
        <br>
        <div class="table-contenedor">
            <p>Usuarios Registrados</p>
            <table id="table-usuarios">
                <thead>
                <th>Nombre</th>
                <th>Correo</th>
                <th style="width: 15px;"></th>
                <th style="width: 50px;"></th>
                </thead>
                <tbody>
                    <c:forEach var="correo" items="${lista}">
                        <tr>
                            <td>
                                <c:out value="${correo.nombre}" />
                            </td>
                            <td>
                                <c:out value="${correo.correo}" />
                            </td>
                            <td>
                                <button type="submit"><a class="link link--modificar" href="modify?id=<c:out value='${correo.id}' />">Modificar</a></button>
                            </td>
                            <td>
                                <button type="submit"><a class="link link--eliminar" href="delete?id=<c:out value='${correo.id}' />">Eliminar</a></button>
                            </td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <script src="https://kit.fontawesome.com/f24051bb43.js" crossorigin="anonymous"></script>
    </body>
</html>
