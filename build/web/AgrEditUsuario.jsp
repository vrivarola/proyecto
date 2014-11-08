<%-- 
    Document   : AgrEditUsuario
    Created on : 20/07/2014, 02:09:41 PM
    Author     : home
--%>
<%@page import="entidadesDAO.UsuarioDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entidades.*" %>
<%@page import="java.util.*" %>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@include file = "cabecera.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar / Editar Usuario</title>
    </head>
    <body>
        <%
            Integer id = 0;
            if (request.getParameter("id") != null) {
                id = Integer.parseInt(request.getParameter("id"));
            }
            UsuarioDAO um = new UsuarioDAO();
            Usuario usuario = null;
            if (id > 0) {
                usuario = um.buscarPorID(id);
            } else {
                usuario = new Usuario();
            }
            pageContext.setAttribute("usuario", usuario);
        %>
        <h1> Agregar / Editar Ciudad</h1>
        <img src="./GetFotoAutor?id=<%=usuario.getIdUsuario()%>" alt=""/>
        <form action="UsuarioControlador" method="post">
            <table frame="box">
                <tr>
                    <th>Id:</th>
                    <td>
                        <c:if test="${usuario.idUsuario != 0}"> ${Usuario.idUsuario} </c:if>
                        <c:if test="${usuario.idUsuario == 0}"> n/a </c:if>
                        <input name="usuarioId" value="${usuario.idUsuario}" type="hidden" />
                    </td>
                    </tr>
                    <tr>
                        <th>Nombre Usuario:</th>
                        <td><input name="usuarioNombre" value="${usuario.nombreUsu}" type="text"/></td>
                    </tr>
            </table>
                    <input type="submit" value="Guardar y volver" name="saveUsuario"/>
                    <input type="submit" value="Guardar y agregar" name="saveaddUsuario"
        </form>
<%@include file = "pie.jsp"%>
