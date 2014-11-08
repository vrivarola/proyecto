
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, CSS Website Layout</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!--  Free CSS Templates from www.templatemo.com -->
<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="index.html" class="current">Pagina Principal</a></li>
            <li><a href="carrito.html">Ver Carrito</a></li>
            <li><a href="AgrEditLibro.html">Libros</a></li>            
            <li><a href="AgrEditAutor">Autores</a></li>  
            <li><a href="#">Ayuda</a></li> 
            <%--<li><a href="#">Contacto</a></li>--%>
    	</ul>
    </div> <!-- end of menu -->
    
    <div id="templatemo_header">
        <%--        <% Usuario u = (Usuario) request.getAttribute("Usuario");%>--%>
   	  <div id="templatemo_special_offers">
       	<p>
                <span>Login</span></p>
       	<form  name="form2" method="post" action="/Login">
       	  <Label>Usuario: </label> <input type="text" name="login" />
       	 <label> Password:</label> <input type="password" name="Password" />
     <input type="submit" value="Ingresar" />
       	</form>
       	<p>&nbsp;</p>
   	  </div>
               <div id="templatemo_new_books">
        	<ul>
                <li>Todavia no esta Registrado?</li>
          </ul>
                <%-- <%
                    LinkedList<Usuario> usuario = (LinkedList<Usuario>) request.getAttribute("Usuario");
%>--%>
            <a href="./UsuarioServlet?op=nuevo" style="margin-left: 50px;">REGISTRESE...</a>
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
            	</ul>
            </div>
			<div class="templatemo_content_left_section">
           	  <h1>Busqueda</h1>
		      <form action="procesador_datos.php" method="get"><ul>
              	<li>
		        <span class="busqueda">Autor:   </span>
		        <input name="autor" type="text" value="Paulo Cohelo"/>
                </li>
              	<li>
		        <span class= "busqueda">Libro:  </span>
  				  <input name="libro" type="text" value="El Alquimista"/>
                </li>
                <li>
                <span class= "busqueda">Editorial: </span>
                <input name= "editorial" type="text" value="Mc Hill"/></li>
                  <li><input name="buscar" type="button" id="buscar" value="      Buscar      " calss="busqueda"/></li>
		      </ul>
		      </form>
		  </div>
            
            <div class="templatemo_content_left_section"></div>
        </div> <!-- end of content left -->
        
      <div id="templatemo_content_right">
        	<div class="templatemo_product_box">
            	<h1>Java 2 Manual de Programacion  <span>(Jorge Luis Joyanes)</span></h1>
   	      <img src="images/java_2.jpg" alt="image" width="100" height="150" />Manual de Programacion JAVA2
   	      <div class="product_info">
       	    <h3>$55</h3>
                    <div class="buy_now_button"><a href="subpage.html">Buy Now</a></div>
                    <div class="detail_button"><a href="libro.html">Detail</a></div>
              </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_width">&nbsp;</div>
            
          <div class="templatemo_product_box">
            	<h1>Piense y Hagáse Rico <span> <br />
           	    (Napoleon Hill)</span></h1>
       	    <img src="images/portada_libro1.jpg" alt="image" width="100" height="150" />Piense y Hágase Rico.                  
       	    <div class="product_info">
       	      <h3>$35</h3>
                    <div class="buy_now_button"><a href="subpage.html">Buy Now</a></div>
                    <div class="detail_button"><a href="subpage.html">Detail</a></div>
            </div>
                <div class="cleaner">&nbsp;</div>
          </div>
            
            <div class="cleaner_with_height">&nbsp;</div>
            
            <div class="templatemo_product_box">
            	<h1>Python<br />
           	    <span>(Raúl González Duque)</span></h1>
   	      <img src="images/portada_libro_3.jpg" alt="image" width="101" height="150" />
                <div class="product_info">
               	  <p>Python para todos .</p>
                    <h3>$65</h3>
                    <div class="buy_now_button"><a href="subpage.html">Buy Now</a></div>
                    <div class="detail_button"><a href="subpage.html">Detail</a></div>
              </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_width">&nbsp;</div>
            
            <div class="templatemo_product_box">
            	<h1>Programming Languages<br />
           	    <span>(Robert W. Sebesta)</span></h1>
            	<img src="images/portada_libro_4.jpg" alt="image" width="100" height="150" />
                <div class="product_info">
               	  <p>Conceptos de los lengau</p>
                    <h3>$45</h3>
                    <div class="buy_now_button"><a href="subpage.html">Buy Now</a></div>
                    <div class="detail_button"><a href="subpage.html">Detail</a></div>
                </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
        <div class="cleaner_with_height">&nbsp;</div>
        </div> 
        <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
    
	       <a href="subpage.html">Pagina Principal</a> | <a href="subpage.html">Buscar</a> | <a href="subpage.html">Libros</a> | <a href="#">Novedades</a> | <a href="#">FAQs</a> | <a href="#">Contacto </a><br />
        Copyright © 2048 <a href="#"><strong>Librerisoft</strong></a> | <a href="http://www.iwebsitetemplate.com" target="_parent">	</div> 
    <!-- end of footer -->
</div> <!-- end of container -->
    </body>
</html>