package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entidades.Autor;
import entidadesDAO.AutorDAO;
import java.util.*;

public final class ListaAutores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/cabecera.jsp");
    _jspx_dependants.add("/pie.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Book Store Template, Free CSS Template, TemplateMo.com</title>\n");
      out.write("        <meta name=\"keywords\" content=\"Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com\" />\n");
      out.write("        <meta name=\"description\" content=\"Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com\" />\n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Lista de Autores</title>\n");
      out.write("    </head>\n");
      out.write("    ");
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
      out.write("        ");

            int porPagina = 0;
            int pagina = 0;
            int totalAutores = 0;
            int totalPaginas = 0;
            String mensajeError = "No se encontraron Autores para visualizar";
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

            List<Autor> listaAutores = (List<Autor>) session.getAttribute("listaAutores");
            if((listaAutores == null) && !norecords)
            {
                AutorDAO cm = new AutorDAO();
                listaAutores = cm.list();

                if(listaAutores.size()>0)
                {
                    session.setAttribute("listaAutores", listaAutores);
                }
            }
            if(!norecords)
            {
                totalAutores = listaAutores.size();
                if(porPagina == 0) {
                    porPagina = totalAutores;
                    verTodos = true;
                }
                totalPaginas = (int) (totalAutores / porPagina) - 1;

                if(totalAutores % porPagina > 0)
                    totalPaginas = totalPaginas + 1;
            }

            int hasta = (pagina + 1)*porPagina;
            int desde = pagina * porPagina;

            if(totalAutores <= hasta)
                hasta = totalAutores;

            List<Autor> autoresPagina = listaAutores.subList(desde, hasta);

            if(hasta==totalAutores)
                pageContext.setAttribute("autoresPagina", listaAutores);
            else
                pageContext.setAttribute("autoresPagina", autoresPagina);
            pageContext.setAttribute("pagina", pagina);
            pageContext.setAttribute("totalPaginas", totalPaginas);
            pageContext.setAttribute("msjError", mensajeError);

        
      out.write("\n");
      out.write("        <h1>Lista de Autores</h1>\n");
      out.write("        <ul type=\"circle\">\n");
      out.write("            <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("            <li><a href=\"AgrEditAutor.jsp\">Agregar Autor</a></li>\n");
      out.write("            <li><a href=\"BuscarAutor.jsp\">Buscar Autor</a></li>\n");
      out.write("        </ul>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty autoresPagina}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <table frame=\"border\" width=\"60%\" border=\"1\" >\n");
        out.write("                <tr><th>Aviso</th></tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td colspan=\"7\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msjError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty autoresPagina}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <table class=\"tablesorter\" style=\"border-top-left-radius: 10px 10px; border-top-right-radius:10px 10px;\">\n");
        out.write("            <tbody>\n");
        out.write("              <tr>\n");
        out.write("                <th>#</th>\n");
        out.write("                <th>Id</th>\n");
        out.write("                <th>Nombre</th>\n");
        out.write("                <th>Apellido</th>\n");
        out.write("              </tr>\n");
        out.write("                ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("            </tbody>\n");
        out.write("          </table>\n");
        out.write("          ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_0.setVar("contador");
    _jspx_th_c_set_0.setValue(new String("1"));
    _jspx_th_c_set_0.setScope("page");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autoresPagina}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        <td><a href=\"EliminarAutor.jsp?idAutor=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.idAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Eliminar</a></td>\n");
          out.write("                        <td><a href=\"AgrEditAutor.jsp?idAutor=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.idAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.idAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("                        <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.descriAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                        <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.nombreAutor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador%2 == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<tr bgcolor=\"silver\">");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador%2 != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<tr bgcolor=\"white\">");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("contador");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagina >0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a href=\"ListaAutores.jsp?pagina=0\"> <b>[Inicio]</b> </a>\n");
        out.write("                <a href=\"ListaAutores.jsp?pagina=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagina-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> <b>[Anterior]</b> </a>\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagina < totalPaginas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a href=\"ListaAutores.jsp?pagina=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagina +1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> <b>[Siguiente]</b> </a>\n");
        out.write("                <a href=\"ListaAutores.jsp?pagina=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPaginas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> <b>[Fin]</b> </a>\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
