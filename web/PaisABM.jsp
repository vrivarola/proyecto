<%-- 
    Document   : PaisABM
    Created on : 15/10/2014, 11:52:23 PM
    Author     : home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<!--  Free CSS Templates from www.templatemo.com -->
<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="#" class="current">Search</a></li>
            <li><a href="index.html">Books</a></li>            
            <li><a href="index.html">New Releases</a></li>  
            <li><a href="#">Company</a></li> 
            <li><a href="#">Contact</a></li>
    	</ul>
    </div> <!-- end of menu -->
    
    <div id="templatemo_header">
    	<div id="templatemo_special_offers">
        	<p>
                <span>25%</span> discounts for
        purchase over $ 40
        	</p>
			<a href="#" style="margin-left: 50px;">Read more...</a>
        </div>
        
        
        <div id="templatemo_new_books">
        	<ul>
                <li>Suspen disse</li>
                <li>Maece nas metus</li>
                <li>In sed risus ac feli</li>
            </ul>
            <a href="#" style="margin-left: 50px;">Read more...</a>
        </div>
    </div> <!-- end of header -->
    
    <div id="templatemo_content">
    	
        <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">
            	<h1>Administracion</h1>
                <ul>
                    <li><a href="subpage.html">UsuarioABM</a></li>
                    <li><a href="subpage.html"> CategoriaABM</a></li>
                    <li><a href="#">LibroABM</a></li>
                    <li><a href="AgrEditAutor,jsp">AutorABM</a></li>
                    <li><a href="#">EditorialABM</a></li>
                    <li><a href="AgrEditPais.jsp">PaisABM</a></li>
                    <li><a href="AgrEditCiudad">CiudadABM</a></li>
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
        	<div class="templatemo_content_left_section">                
                <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
			</div>
        </div> <!-- end of content left -->
        
        <div id="templatemo_content_right">

            <h1>ABM Paises<span></span></h1>
            <div id="templatemo_content_right">
                <div id="tablesorter">
                    <jsp:include page="ListaPaises.jsp" flush="true" />
                </div>
            </div>
        </div> 
        <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
	       <a href="index.html">Home</a> | <a href="index.html">Search</a> | <a href="index.html">Books</a> | <a href="#">New Releases</a> | <a href="#">FAQs</a> | <a href="#">Contact Us</a><br />
        Copyright © 2048 <a href="#"><strong>Your Company Name</strong></a> | <a href="http://www.iwebsitetemplate.com" target="_parent">Website Templates</a> by <a href="http://www.templatemo.com" target="_parent">Free CSS Templates</a>
	</div> <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div>
</body>
</html>
