<%-- 
    Document   : EliminarCiudad
    Created on : 10-abr-2014, 10:33:10
    Author     : Rodrigo
--%>

<%@page import="entidadesDAO.CiudadDAO"%>
<%@page import="entidades.Ciudad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Eliminar Cliente</title>
<%@include file = "cabecera.jsp"%>

        <%
            Integer id = 0;
            if (request.getParameter("idCiudad")!=null)
            {
                id = Integer.parseInt(request.getParameter("idCiudad"));
            }
            CiudadDAO um = new CiudadDAO();
            Ciudad ciudad = null;
            if(id > 0)
            {
                ciudad = um.buscarPorID(id);
            }
            else
            {
                ciudad = new Ciudad();
            }
            pageContext.setAttribute( "ciudad", ciudad );
        %>
        <h1>Eliminar Ciudad</h1>
           <form action="CiudadControlador" method="post">
               <table frame="box">
                  <tr>
                      <th>Id:</th>
                      <td>
                          <c:if test="${ciudad.idCiudad != 0}"> ${ciudad.idCiudad} </c:if>
                          <c:if test="${ciudad.idCiudad == 0}"> n/a </c:if>
                          <input name="idCiudad" value="${ciudad.idCiudad}" type="hidden" />
                      </td>
                  </tr>
                  <tr>
                      <th>Nombre Ciudad</th>
                      <td>${ciudad.descriCiudad}</td>
                  </tr>                   
              </table>
                  <input type="submit" value="Eliminar" name="deleteCiudad" />
          </form>
<%@include file = "pie.jsp"%>
