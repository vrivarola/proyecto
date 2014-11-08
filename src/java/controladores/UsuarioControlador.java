/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Usuario;
import entidadesDAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Victor Rivarola
 */
public class UsuarioControlador extends HttpServlet {

    boolean error = false;
    String mess = "";

    private void doAction(HttpServletRequest request, boolean guardar) {
        error = false;
        Usuario usuario = new Usuario();
        UsuarioDAO usuarioManager = new UsuarioDAO();
        HttpSession session = request.getSession(true);

        if (request.getParameter("usuarioId") != null) {
            Integer id = 0;
            String param = request.getParameter("usuarioId");

            if (param.length() > 0) {
                id = Integer.parseInt(param);
            }
            if (id != 0) {
                usuario.setIdUsuario(id);
            }
        }
        if (request.getParameter("usuarioNombre") != null) {
            usuario.setNombreUsu(request.getParameter("usuarioNombre"));
        }
        if (guardar) {
            if (usuarioManager.insertar(usuario)) {
                if (session.getAttribute("listaUsuarios") != null) {
                    session.setAttribute("listaUsuarios", null);
                }
                List<Usuario> listaUsuarios = usuarioManager.list();

                if (listaUsuarios != null) {
                    session.setAttribute("listaUsuarios", listaUsuarios);
                }
            } else {
                error = true;
            }
        } else { //buscar
            if (session.getAttribute("listaUsuarios") != null) {
                session.setAttribute("listaUsuarios", null);;
            } else {
                error = true;
                mess = "No se Encontraron Usuarios";
            }
        }

    }

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = "ListaUsuarios.jsp";
        
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        if(request.getParameter("saveUsuario") != null){
            address = "ListaUsuario.jsp";
            doAction(request, true);
            if(error){
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AdeEditUsuario.jsp?error=1";
            }
        } else if (request.getParameter("saveAddUsuario") != null){
            address = "AgrEditUsuario.jsp";
            doAction(request, true);
            if(error){
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditUsuario.jsp?error=1";
            }
        } else if(request.getParameter("deleteUsuario") != null){
            address = "ListaUsuario.jsp";
            if(request.getParameter("UsuarioId")!=null){
                Integer id = Integer.parseInt(request.getParameter("usuarioId"));
                UsuarioDAO em = new UsuarioDAO();
                Usuario usuario = em.buscarPorID(id);
         try {
                    HttpSession session = request.getSession();
                    if (!em.eliminar(usuario.getIdUsuario())) {
                        session.setAttribute("mess", mess);
                        address = "EliminarUsuarios.jsp?error=1";
                    }
                    if (session.getAttribute("listaUsuarios") != null) {
                        session.setAttribute("listaUsuarios", null);
                    }
                    List<Usuario> listaUsuarios = em.list();

                    if (listaUsuarios.size() > 0) {
                        session.setAttribute("listaUsuarios", listaUsuarios);
                    }
                } catch (Exception ex) {
                    String msg = ex.getLocalizedMessage();
                    HttpSession session = request.getSession();
                    session.setAttribute("mensajeError", msg);
                    address = "Error.jsp";
                }
            }
        } else if (request.getParameter("searchUsuarios") != null) {
            address = "ListaUsuarios.jsp";
            doAction(request, false);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "ListaUsuarios.jsp?norecords=1";
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);

        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
