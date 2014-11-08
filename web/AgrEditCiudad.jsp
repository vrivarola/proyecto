<%-- 
    Document   : AgrEditCiudad
    Created on : 10-abr-2014, 10:33:10
    Author     : Victor Rivarola
--%>

<%@page import="entidadesDAO.CiudadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML">
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Book Store Template, Free CSS Template, TemplateMo.com</title>
        <meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com" />
        <meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com" />
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
        <title>Lista de Autores</title>
    </head>

<%@include file = "cabecera.jsp"%>
<div class="templatemo_content_left_section"> 
    <%
        Integer id = 0;
        if (request.getParameter("id") != null) {
            id = Integer.parseInt(request.getParameter("id"));
        }
        CiudadDAO um = new CiudadDAO();
        Ciudad ciudad = null;
        if (id > 0) {
            ciudad = um.buscarPorID(id);
        } else {
            ciudad = new Ciudad();
        }
        pageContext.setAttribute("ciudad", ciudad);
    %>
    <h1>Agregar / Editar Ciudad</h1>
    <form action="CiudadControlador" method="post">
        <table frame="box">
            <tr>
                <th>Id:</th>
                <td>
                    <c:if test="${ciudad.idCiudad != 0}"> ${ciudad.idCiudad} </c:if>
                    <c:if test="${ciudad.idCiudad == 0}"> n/a </c:if>
                    <input name="ciudadId" value="${ciudad.idCiudad}" type="hidden" />
                </td>
            </tr>
            <tr>
                <th>Nombre Cliente:</th>
                <td><input name="ciudadNombre" value="${ciudad.descriCiudad}" type="text" /></td>
            </tr>                
        </table>
        <input type="submit" value="Guardar y volver" name="saveCiudad" />
        <input type="submit" value="Guardar y agregar" name="saveAddCiudad" />
    </form>
</div>
<%@include file = "pie.jsp"%>
