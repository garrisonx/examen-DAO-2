<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form action="modificarContinente.do" method="POST">
          <input type="hidden" name="idContinente" value="${Continente.idContinente}"/>
          Nombre: <input type="text" name="nombre" size="50" value="${Continente.nombre}" /><br/>
          Total Paises  <input type="text" name="totalPaises" value="${Continente.totalPaises}" size="100"/></br>
          Heroe Historico:  <input type="text" name="heroeHistorico" value="${Continente.heroeHistorico}"/><br/>
          <input type="submit" value="Modificar"/>
        </form>
    </body>
</html>