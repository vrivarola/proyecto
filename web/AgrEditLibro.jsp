<%-- 
    Document   : AgrEditAutor
    Created on : 29/07/2014, 08:47:14 PM
    Author     : Victor Rivarola
--%>
<%@page import="entidadesDAO.LibroDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*" %>
<%@page import="java.util.*" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar / Editar Libros</title>
    </head>
    <body>
<%
            Integer id = 0;
            if (request.getParameter("id")!=null)
            {
                id = Integer.parseInt(request.getParameter("id"));
            }
            LibroDAO um = new LibroDAO();
            Autor autor = null;
            if(id > 0)
            {
                autor = um.buscarPorID(id);
            }
            else
            {
                autor = new Autor();
            }
            pageContext.setAttribute( "autor", autor );        
        %>
        <title>Agregar / Editar Autor</title>
        <form action="AutorControlador" method="post">
               <table frame="box">
                  <%--<tr>
                       <th>Id:</th>
                      <td>
                          <c:if test="${autor.idAutor != 0}"> ${autor.idAutor} </c:if>
                          <c:if test="${autor.idAutor == 0}"> n/a </c:if>
                          <input name="autorId" value="${autor.idAutor}" type="hidden" />
                      </td>
                  </tr>--%>
                  <tr>
                      <th>Nombre Autor:</th>
                      <td><input name="autorNombre" value="${autor.nombreAutor}" type="text" /></td>
                  </tr>
                  <tr>
                      <th>Apellido:</th>
                      <td><input name="autorApellido" value="${autor.descriAutor}" type="text" /></td>
                  </tr>
                  <!--<tr>
                      <th>Nacionalidad:</th>
                      <td><input name="autorPais" value="${autor.pais}" type="text" /></td>
                  </tr>-->
              </table>
                  <input type="submit" value="Guardar y volver" name="saveAutor" />
                  <input type="submit" value="Guardar y agregar" name="saveAddAutor" />
          </form>
    </body>
</html>

