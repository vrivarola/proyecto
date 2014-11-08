/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Autor;
import entidades.Pais;
import entidadesDAO.AutorDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author home
 */
public class AutorControlador extends HttpServlet {
    boolean error = false;
    String mess = "";

    private void doAction(HttpServletRequest request, boolean guardar){
        error = false;
        Autor autor = new Autor();
        Pais pais = new Pais();
        AutorDAO autorManager = new AutorDAO();
        HttpSession session = request.getSession(true);

        if (request.getParameter("idAutor") != null) {
            Integer id =  0;
            String param = request.getParameter("idAutor");

            if (param.length() > 0) {
                id = Integer.parseInt(param);
            }
            if (id != 0) {
                autor.setIdAutor(id);
            }
        }
        if (request.getParameter("autorNombre") != null) {
            autor.setNombreAutor(request.getParameter("autorNombre"));
        }
        if (request.getParameter("autorApellido")!= null){
            autor.setDescriAutor(request.getParameter("autorApellido"));
        }
        //TODO: CORREGIR
        if (request.getParameter("autorPais") != null){
            autor.setPais(pais);
        }
        if (guardar) {
            if (autorManager.insertar(autor)) {
                if (session.getAttribute("listaAutores") != null) {
                    session.setAttribute("listaAutores", null);
                }
                List<Autor> listaAutores = autorManager.list();

                if (listaAutores!=null) {
                    session.setAttribute("listaAutores", listaAutores);
                }
            } else {
                error = true;
               // mess = ciudadManager.mess;
            }
        } else {
            if (session.getAttribute("listaAutores") != null) {
                session.setAttribute("listaAutores", null);
            }
            List<Autor> listaAutores;
            try{
                    listaAutores= autorManager.buscar(autor.getDescriAutor());


                    session.setAttribute("listaAutores", listaAutores);

            }catch(Exception e){
                error = true;

                mess = "Error2";
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
        String address = "ListaAutores.jsp";

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getParameter("saveAutor") != null) {
            address = "ListaAutores.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditAutor.jsp?error=1";
            }
        } else if (request.getParameter("saveAddAutor") != null) {
            address = "AgrEditAutor.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditAutor.jsp?error=1";
            }
        } else if (request.getParameter("deleteAutor") != null) {
            address = "ListaAutor.jsp";
            if (request.getParameter("idAutor") != null) {
                Integer id = Integer.parseInt(request.getParameter("idAutor"));
                AutorDAO em = new AutorDAO();
                Autor autor = em.buscarPorID(id);
                try {
                    HttpSession session = request.getSession();
                    if (!em.eliminar(autor.getIdAutor())) {
                        session.setAttribute("mess", mess);
                        address = "EliminarAutor.jsp?error=1";
                    }
                    if (session.getAttribute("listaAutores") != null) {
                        session.setAttribute("listaAutores", null);
                    }
                    List<Autor> listaAutores = em.list();

                    if (listaAutores.size() > 0) {
                        session.setAttribute("listaAutores", listaAutores);
                    }
                } catch (Exception ex) {
                    String msg = ex.getLocalizedMessage();
                    HttpSession session = request.getSession();
                    session.setAttribute("mensajeError", msg);
                    address = "Error.jsp";
                }
            }
        } else if (request.getParameter("searchAutores") != null) {
            address = "ListaAutores.jsp";
            doAction(request, false);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "ListaAutores.jsp?norecords=1";
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
