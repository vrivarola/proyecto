<%-- 
    Document   : EliminarPais
    Created on : 27/07/2014, 02:33:11 PM
    Author     : home
--%>

<%@page import="entidadesDAO.PaisDAO"%>
<%@page import="entidades.Pais"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file = "cabecera.jsp"%>

<%
    Integer id = 0;
    if (request.getParameter("idPais") != null) {
        id = Integer.parseInt(request.getParameter("idPais"));
    }
    PaisDAO um = new PaisDAO();
    Pais pais = null;
    if (id > 0) {
        pais = um.buscarPorID(id);
    } else {
        pais = new Pais();
    }
    pageContext.setAttribute("pais", pais);
%>
<h1>Eliminar Pais</h1>
<form action="PaisControlador" method="post">
    <table frame="box">
        <tr>
            <th>Id:</th>
            <td>
                <c:if test="${pais.idPais != 0}"> ${pais.idPais} </c:if>
                <c:if test="${pais.idPais == 0}"> n/a </c:if>
                <input name="idPais" value="${pais.idPais}" type="hidden" />
            </td>
        </tr>
        <tr>
            <th>Nombre Pais</th>
            <td>${pais.descriPais}</td>
        </tr>                   
    </table>
    <input type="submit" value="Eliminar" name="deletePais" />
</form>
<%@include file = "pie.jsp"%>

