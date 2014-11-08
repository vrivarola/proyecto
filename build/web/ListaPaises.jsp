<%-- 
    Document   : ListaPaises
    Created on : 27/07/2014, 02:20:35 PM
    Author     : home
--%><%@page import="java.util.List"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="entidades.Pais"%>
<%@page import="entidadesDAO.PaisDAO"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Book Store Template, Free CSS Template, TemplateMo.com</title>
        <meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com" />
        <meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com" />
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
        <title> Lista de paises</title>
    </head>

        <%
            int porPagina = 0;
            int pagina = 0;
            int totalPaises = 0;
            int totalPaginas = 0;
            String mensajeError = "No se encontraron paises para visualizar";
            boolean norecords = false;
            boolean verTodos = false;

            if (request.getParameter("porPagina")!=null)
            {
                porPagina = Integer.parseInt(request.getParameter("porPagina"));
            }
            else
                porPagina = 8;
            if (request.getParameter("pagina")!=null)
            {
                pagina = Integer.parseInt(request.getParameter("pagina"));
            }
            if(request.getParameter("norecords")!=null)
            {
                mensajeError = (String)session.getAttribute("mess");
                norecords = true;
            }

            List<Pais> listaPaises = (List<Pais>) session.getAttribute("listaPaises");
            if((listaPaises == null)&&!norecords)
            {
                PaisDAO cm = new PaisDAO();
                listaPaises = cm.list();

                if(listaPaises.size()>0)
                {
                    session.setAttribute("listaPaises", listaPaises);
                }
            }
            if(!norecords)
            {
                totalPaises = listaPaises.size();
                if(porPagina == 0) {
                    porPagina = totalPaises;
                    verTodos = true;
                }
                totalPaginas = (int) (totalPaises / porPagina) - 1;

                if(totalPaises % porPagina > 0)
                    totalPaginas = totalPaginas + 1;
            }

            int hasta = (pagina + 1)*porPagina;
            int desde = pagina * porPagina;

            if(totalPaises <= hasta)
                hasta = totalPaises;

            List<Pais> paisesPagina = listaPaises.subList(desde, hasta);

            if(hasta==totalPaises)
                pageContext.setAttribute("paisesPagina", listaPaises);
            else
                pageContext.setAttribute("paisesPagina", paisesPagina);
            pageContext.setAttribute("pagina", pagina);
            pageContext.setAttribute("totalPaginas", totalPaginas);
            pageContext.setAttribute("msjError", mensajeError);

        %>
        <h1>Lista de Paises</h1>
        <ul type="circle">
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="AgrEditPais.jsp">Agregar Pais</a></li>
            <li><a href="BuscarPais.jsp">Buscar Pais</a></li>
        </ul>
        <c:if test="${empty paisesPagina}">
            <table frame="border" width="60%" border="1" >
                <tr><th>Aviso</th></tr>
                <tr>
                    <td colspan="7">${msjError}</td>
                </tr>
            </table>
        </c:if>
        <c:if test="${!empty paisesPagina}">
            <table class="tablesorter" style="border-top-left-radius: 10px 10px; border-top-right-radius:10px 10px;">
            <tbody>
              <tr>
                <th>#</th>
                <th>Id</th>
                <th>Pais</th>
              </tr>
                <c:set var="contador" value="1" scope="page"/>
                <c:forEach var="item" items="${paisesPagina}">
                    <c:if test="${contador%2 == 0}"><tr bgcolor="silver"></c:if>
                    <c:if test="${contador%2 != 0}"><tr bgcolor="white"></c:if>
                        <td><a href="EliminarPais.jsp?idPais=${item.idPais}">Eliminar</a></td>
                        <td><a href="AgrEditPais.jsp?idPais=${item.idPais}">${item.idPais}</a></td>
                        <td> ${item.descriPais} </td>
                    </tr>
                    <c:set var="contador" value="${contador+1}" />
                </c:forEach>

            </tbody>
          </table>
          <c:if test="${pagina >0}">
                <a href="ListaPaises.jsp?pagina=0"> <b>[Inicio]</b> </a>
                <a href="ListaPaises.jsp?pagina=${pagina-1}"> <b>[Anterior]</b> </a>
          </c:if>
          <c:if test="${pagina < totalPaginas}">
                <a href="ListaPaises.jsp?pagina=${pagina +1}"> <b>[Siguiente]</b> </a>
                <a href="ListaPaises.jsp?pagina=${totalPaginas}"> <b>[Fin]</b> </a>
          </c:if>
        </c:if>



