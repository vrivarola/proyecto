<%-- 
    Document   : buscarAutor
    Created on : 30/07/2014, 01:11:22 AM
    Author     : home
--%>
<%@page import="entidadesDAO.AutorDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*" %>
<%@page import="java.util.*" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file = "cabecera.jsp"%>

<%
    Integer id = 0;
    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }
    AutorDAO um = new AutorDAO();
    Autor autor = null;
    if (id > 0) {
        autor = um.buscarPorID(id);
    } else {
        autor = new Autor();
    }
    pageContext.setAttribute("autor", autor);
%>
<h1>Buscar Autor</h1>
<form action="AutorControlador" method="post">
    <table frame="box">
        <tr>
            <th>Id:</th>
            <td>
                <c:if test="${autor.idAutor != 0}"> ${autor.idAutor} </c:if>
                <c:if test="${autor.idAutor == 0}"> no existe </c:if>
                <input name="autorId" value="${autor.idAutor}" type="hidden" />
            </td>
        </tr>
        <tr>
            <th>Nombre Autor:</th>
            <td><input name="autorNombre" value="${autor.descriAutor}" type="text" /></td>
        </tr>                
    </table>
    <input type="submit" value="Buscar" name="searchAutor" />
    <%--<input type="submit" value="Guardar y agregar" name="saveAddAutor" /> --%>
</form>
<%@include file = "pie.jsp"%>
