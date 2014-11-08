<%-- 
    Document   : BuscarPais
    Created on : 27/07/2014, 02:17:27 PM
    Author     : home
--%>

<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="entidades.Pais"%>
<%@page import="entidadesDAO.PaisDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file = "cabecera.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Pais</title>
    </head>
    <body>
        <%
            Integer id = 0;
            if (request.getParameter("id") != null) {
                id = Integer.parseInt(request.getParameter("id"));
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
        <h1>Buscar Pais</h1>
        <form action="PaisControlador" method="post">
            <table frame="box">
                <tr>
                    <th>Id:</th>
                    <td>
                        <c:if test="${pais.idPais != 0}"> ${pais.idPais} </c:if>
                        <c:if test="${pais.idPais == 0}"> n/a </c:if>
                        <input name="paisId" value="${pais.idPais}" type="hidden" />
                    </td>
                </tr>
                <tr>
                    <th>Nombre Pais:</th>
                    <td><input name="paisNombre" value="${pais.descriPais}" type="text" /></td>
                </tr>                 
            </table>
            <input type="submit" value="Buscar" name="searchPaises" />
        </form>
<%@include file = "pie.jsp"%>
