<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
    Document   : universidades
    Created on : Dec 7, 2010, 8:22:05 AM
    Author     : Garrison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <body>
        <h1>Formulario</h1>
        <form action="crearContinente.do" method="POST">
          Nombre: <input type="text" name="nombre" size="50" /><br/>
          Total Paises  <input type="text" name="totalPaises" size="100"/></br>
          Heroe Historico:  <input type="text" name="heroeHistorico" /><br/>
          <input type="submit" value="crear"/>
        </form>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Total Paises</th>
                    <th>Heroe Historico</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${Continentes}" var="Continente">
                <tr>
                    <td>${Continente.nombre}</td>
                    <td>${Continente.totalPaises}</td>
                    <td>${Continente.heroeHistorico}</td>
                    <td><a href="findContinente.do?idContinente=${Continente.idContinente}">Modificar</a></td>
                    <td><a href="eliminarContinente.do?idContinente=${Continente.idContinente}">Eliminar</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>
