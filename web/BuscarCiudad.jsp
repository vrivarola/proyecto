<%-- 
    Document   : BuscarCliente
    Created on : 10-abr-2014, 10:33:10
    Author     : Rodrigo
--%>

<%@page import="entidadesDAO.CiudadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file = "cabecera.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Buscar Ciudad</title>
</head>
<body>
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
    <h1>Buscar Ciudad</h1>
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
                <th>Nombre Ciudad:</th>
                <td><input name="ciudadNombre" value="${ciudad.descriCiudad}" type="text" /></td>
            </tr>                 
        </table>
        <input type="submit" value="Buscar" name="searchCiudades" />
    </form>
<%@include file = "pie.jsp"%>