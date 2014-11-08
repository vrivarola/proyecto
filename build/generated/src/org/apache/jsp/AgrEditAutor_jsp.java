package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidadesDAO.AutorDAO;
import entidades.*;
import java.util.*;

public final class AgrEditAutor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/cabecera.jsp");
    _jspx_dependants.add("/pie.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Book Store Template, Free CSS Template, CSS Website Layout</title>\n");
      out.write("<meta name=\"keywords\" content=\"Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML\" />\n");
      out.write("<meta name=\"description\" content=\"Book Store Template, Free CSS Template, Download CSS Website\" />\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--  Free CSS Templates from www.templatemo.com -->\n");
      out.write("<div id=\"templatemo_container\">\n");
      out.write("\t<div id=\"templatemo_menu\">\n");
      out.write("    \t<ul>\n");
      out.write("            <li><a href=\"index.html\" class=\"current\">Pagina Principal</a></li>\n");
      out.write("            <li><a href=\"carrito.html\">Ver Carrito</a></li>\n");
      out.write("            <li><a href=\"subpage.html\">Libros</a></li>            \n");
      out.write("            <li><a href=\"subpage.html\">Novedades</a></li>  \n");
      out.write("            <li><a href=\"#\">Sobre Nosotros</a></li> \n");
      out.write("            <li><a href=\"#\">Contacto</a></li>\n");
      out.write("    \t</ul>\n");
      out.write("    </div> <!-- end of menu -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_header\">\n");
      out.write("        ");
      out.write("\n");
      out.write("   \t  <div id=\"templatemo_special_offers\">\n");
      out.write("       \t<p>\n");
      out.write("                <span>Login</span></p>\n");
      out.write("       \t<form  name=\"form2\" method=\"post\" action=\"/Login\">\n");
      out.write("       \t  <label>Usuario: </label> <input type=\"text\" name=\"login\" />\n");
      out.write("       \t <label> Password:</label> <input type=\"password\" name=\"Password\" />\n");
      out.write("     <input type=\"submit\" value=\"Ingresar\" />\n");
      out.write("       \t</form>\n");
      out.write("       \t<p>&nbsp;</p>\n");
      out.write("   \t  </div>\n");
      out.write("               <div id=\"templatemo_new_books\">\n");
      out.write("        \t<ul>\n");
      out.write("                <li>Todavia no esta Registrado?</li>\n");
      out.write("          </ul>\n");
      out.write("                ");
      out.write("\n");
      out.write("            <a href=\"./UsuarioServlet?op=nuevo\" style=\"margin-left: 50px;\">REGISTRESE...</a>\n");
      out.write("      </div>\n");
      out.write("    </div> <!-- end of header -->\n");
      out.write(" \n");
      out.write("    <div id=\"templatemo_content\">\n");
      out.write("    \t\n");
      out.write("        <div id=\"templatemo_content_left\">\n");
      out.write("        \t<div class=\"templatemo_content_left_section\">\n");
      out.write("            \t<h1>Tareas Admin</h1>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"subpage.html\">Antropologia</a></li>\n");
      out.write("                    <li><a href=\"subpage.html\"> Arte</a></li>\n");
      out.write("                    <li><a href=\"#\">Autoayuda &amp; Espiritualidad</a></li>\n");
      out.write("                    <li><a href=\"#\">Comunicacion</a></li>\n");
      out.write("                    <li><a href=\"#\">Derecho</a></li>\n");
      out.write("                    <li><a href=\"#\">Filosofia</a></li>\n");
      out.write("                    <li><a href=\"#\">Informatica</a></li>\n");
      out.write("                    <li><a href=\"#\">Literatura</a></li>\n");
      out.write("                    <li><a href=\"#\">Psicologia</a></li>\n");
      out.write("            \t</ul>\n");
      out.write("            </div>\n");
      out.write("\t\t\t<div class=\"templatemo_content_left_section\">\n");
      out.write("           \t  <h1>Busqueda</h1>\n");
      out.write("\t\t      <form action=\"procesador_datos.php\" method=\"get\"><ul>\n");
      out.write("              \t<li>\n");
      out.write("\t\t        <span class=\"busqueda\">Autor:   </span>\n");
      out.write("\t\t        <input name=\"autor\" type=\"text\" value=\"Paulo Cohelo\"/>\n");
      out.write("                </li>\n");
      out.write("              \t<li>\n");
      out.write("\t\t        <span class= \"busqueda\">Libro:  </span>\n");
      out.write("  \t\t\t\t  <input name=\"libro\" type=\"text\" value=\"El Alquimista\"/>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                <span class= \"busqueda\">Editorial: </span>\n");
      out.write("                <input name= \"editorial\" type=\"text\" value=\"Mc Hill\"/></li>\n");
      out.write("                  <li><input name=\"buscar\" type=\"button\" id=\"buscar\" value=\"      Buscar      \" calss=\"busqueda\"/></li>\n");
      out.write("\t\t      </ul>\n");
      out.write("\t\t      </form>\n");
      out.write("\t\t  </div>\n");
      out.write("            \n");
      out.write("            <div class=\"templatemo_content_left_section\"> </div>\n");
      out.write("        </div> <!-- end of content left -->\n");
      out.write("        \n");
      out.write("      <div id=\"templatemo_content_right\">\n");
      out.write("              <div id=\"tablesorter\">\n");
      out.write("\n");
      out.write("\t<!-- pegar aca los jsp -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");

            Integer id = 0;
            if (request.getParameter("id")!=null)
            {
                id = Integer.parseInt(request.getParameter("id"));
            }
            AutorDAO um = new AutorDAO();
            Autor autor = null;
            if(id > 0)
            {
                autor = um.buscarPorID(id);
            }
            else
            {
                autor = new Autor();
            }
            pageContext.setAttribute( "autor", autor );        
        
      out.write("\n");
      out.write("        <title> Agregar / Editar Autor</title>\n");
      out.write("        <form action=\"AutorControlador\" method=\"post\">\n");
      out.write("               <table frame=\"box\">\n");
      out.write("                  ");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <th>Nombre Autor:</th>\n");
      out.write("                      <td><input name=\"autorNombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.nombreAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <th>Apellido:</th>\n");
      out.write("                      <td><input name=\"autorApellido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.descriAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <!--<tr>\n");
      out.write("                      <th>Nacionalidad:</th>\n");
      out.write("                      <td><input name=\"autorPais\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.pais}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" /></td>\n");
      out.write("                  </tr>-->\n");
      out.write("              </table>\n");
      out.write("                  <input type=\"submit\" value=\"Guardar y volver\" name=\"saveAutor\" />\n");
      out.write("                  <input type=\"submit\" value=\"Guardar y agregar\" name=\"saveAddAutor\" />\n");
      out.write("          </form>\n");
      out.write("                      ");
      out.write("\n");
      out.write("</div> \n");
      out.write("</div> \n");
      out.write("        <!-- end of content right -->\n");
      out.write("    \n");
      out.write("    \t<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("    </div> <!-- end of content -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("    \n");
      out.write("\t       <a href=\"subpage.html\">Pagina Principal</a> | <a href=\"subpage.html\">Buscar</a> | <a href=\"subpage.html\">Libros</a> | <a href=\"#\">Novedades</a> | <a href=\"#\">FAQs</a> | <a href=\"#\">Contacto </a><br />\n");
      out.write("        Copyright ? 2048 <a href=\"#\"><strong>Librerisoft</strong></a> | <a href=\"http://www.iwebsitetemplate.com\" target=\"_parent\">\t</div> \n");
      out.write("    <!-- end of footer -->\n");
      out.write("</div> <!-- end of container -->\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("\n");
      out.write("                  \n");
      out.write("                  \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
