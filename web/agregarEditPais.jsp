<%-- 
    Document   : agregarEditPais
    Created on : 10/08/2014, 10:11:46 PM
    Author     : home
--%>

<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileUploadException"%>
<%@page import="java.util.LinkedList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Book Store Template, Free CSS Template, TemplateMo.com</title>
        <meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com" />
        <meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com" />
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="templatemo_container">
            <div id="templatemo_menu">
                <ul>
                    <li><a href="index.jsp">Pagina Principal</a></li>
                    <li></li>
                    <li><a href="carrito.html">Ver Carrito</a></li>            
                    <li><a href="index.html">Novedades</a></li>  
                    <li><a href="#">Sobre Nosostros</a></li> 
                    <li><a href="#">Contacto</a></li>
                </ul>
            </div> <!-- end of menu -->

            <div id="templatemo_header">
                <div id="templatemo_special_offers">
                    <p>
                        <span>Bienvenido</span>
                    </p>
                    <a href="#" style="margin-left: 50px;">Read more...</a>
                </div>


                <div id="templatemo_new_books">
                    <ul>
                        <li>Novedades</li>
                    </ul>
                    <a href="#" style="margin-left: 50px;">Read more...</a>
                </div>
            </div> <!-- end of header -->

            <div id="templatemo_content">

                <div id="templatemo_content_left">
                    <div class="templatemo_content_left_section">
                        <h1>Categories</h1>
                        <ul>
                            <li><a href="subpage.html">Antropología</a></li>
                            <li><a href="subpage.html"> Arte</a></li>
                            <li><a href="#">Autoayuda &amp; Espiritualidad</a></li>
                            <li><a href="#">Comunicacion</a></li>
                            <li><a href="#">Derecho</a></li>
                            <li><a href="#">Filosofía</a></li>
                            <li><a href="#">Informática</a></li>
                            <li><a href="#">Literatura</a></li>
                            <li><a href="#">Psicologia</a></li>
                            <li></li>
                        </ul>
                    </div>
                    <div class="templatemo_content_left_section">
                        <h1>Busqueda</h1>
                        <form action="procesador_datos.php" method="get">
                            <ul>
                                <li> <span class="busqueda">Autor: </span>
                                    <input name="autor" type="text"/>
                                </li>
                                <li> <span class= "busqueda">Libro: </span>
                                    <input name="libro" type="text"/>
                                </li>
                                <li> <span class= "busqueda">Editorial: </span>
                                    <input name= "editorial" type="text"/>
                                </li>
                                <li>
                                    <input name="buscar" type="button" id="buscar" value="      Buscar      " calss="busqueda"/>
                                </li>
                            </ul>
                        </form>
                    </div>
                    <div class="templatemo_content_left_section"></div>
                </div> <!-- end of content left -->

                <div id="templatemo_content_right">
                    <center>	
                        <%-- <h1>Victor Rivarola<span></span></h1> --%>

                    </center>
                    <div id="templatemo_content_right">
                        <div id="tablesorter">
                            <jsp:include page="AgrEditPais.jsp" flush="true" />

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

