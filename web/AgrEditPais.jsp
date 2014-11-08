<%-- 
    Document   : AgrEditPais
    Created on : 27/07/2014, 12:10:28 PM
    Author     : home
--%>
<%@page import="entidadesDAO.PaisDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file = "cabecera.jsp"%>

<title>Agregar / Editar Pais</title>

        <%
            Integer id = 0;
            if (request.getParameter("id") != null) {
                id = Integer.parseInt(request.getParameter("id"));
            }
            PaisDAO um = new PaisDAO();
            Pais pais = null;
            if (id > 0) {
                pais = new Pais();
            }
            pageContext.setAttribute("pais", pais);

        %>

        <h1>Agregar / Editar Pais</h1>
        <form action="PaisControlador" method="post">
            <table frame ="box">
                <tr>
                    <%--<th>Id:</th> 
                    <td>
                <c:if test="$pais.idPais!=0">${pais.idPais}</c:if>
                <c:if test="${pais.idPais == 0}"> n/a </c:if>
                <input name="paisId" value="${pais.idPais}" type="hidden" />--%>
                </td>
                </tr>
                <tr>
                    <th> Nombre Pais:</th>
                    <td><input name="paisNombre" value="${pais.descriPais}" type="text" /></td>
                </tr>
            </table>
            <input type="submit" value="Guardar y volver" name="savePais" />
            <input type="submit" value="Guardar y agregar" name="saveAddPais" />
        </form>
<%@include file = "pie.jsp" %>
