/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Pais;
import entidadesDAO.PaisDAO;
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
public class PaisControlador extends HttpServlet {

    boolean error = false;
    String mess = "";

    private void doAction(HttpServletRequest request, boolean guardar) {
        error = false;
        Pais pais = new Pais();
        PaisDAO paisManager = new PaisDAO();
        HttpSession session = request.getSession(true);

        if (request.getParameter("idPais") != null) {
            Integer id = 0;
            String param = request.getParameter("idPais");

            if (param.length() > 0) {
                id = Integer.parseInt(param);
            }
            if (id != 0) {
                pais.setIdPais(id);
            }
        }
        if (request.getParameter("paisNombre") != null) {
            pais.setDescriPais(request.getParameter("paisNombre"));
        }
        if (guardar) {
            if (paisManager.insertar(pais)) {
                if (session.getAttribute("listaPaises") != null) {
                    session.setAttribute("listaPaises", null);
                }
                List<Pais> listaPaises = paisManager.list();

                if (listaPaises != null) {
                    session.setAttribute("listaPaises", listaPaises);
                }
            } else {
                error = true;
                // mess = ciudadManager.mess;
            }
        } else //Buscar
        {
            if (session.getAttribute("listaPaises") != null) {
                session.setAttribute("listaPaises", null);
            }
            List<Pais> listaPaises;
            try {
                listaPaises = paisManager.buscar(pais.getDescriPais());


                session.setAttribute("listaPaises", listaPaises);

            } catch (Exception e) {
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
        String address = "ListaPaises.jsp";

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getParameter("savePais") != null) {
            address = "ListaPaises.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditPais.jsp?error=1";
            }
        } else if (request.getParameter("saveAddPais") != null) {
            address = "AgrEditPais.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditPais.jsp?error=1";
            }
        } else if (request.getParameter("deletePais") != null) {
            address = "ListaPaises.jsp";
            if (request.getParameter("idPais") != null) {
                Integer id = Integer.parseInt(request.getParameter("idPais"));
                PaisDAO em = new PaisDAO();
                Pais pais = em.buscarPorID(id);
                try {
                    HttpSession session = request.getSession();
                    if (!em.eliminar(pais.getIdPais())) {
                        session.setAttribute("mess", mess);
                        address = "EliminarPais.jsp?error=1";
                    }
                    if (session.getAttribute("listaPaises") != null) {
                        session.setAttribute("listaPaises", null);
                    }
                    List<Pais> listaPaises = em.list();

                    if (listaPaises.size() > 0) {
                        session.setAttribute("listaPaises", listaPaises);
                    }
                } catch (Exception ex) {
                    String msg = ex.getLocalizedMessage();
                    HttpSession session = request.getSession();
                    session.setAttribute("mensajeError", msg);
                    address = "Error.jsp";
                }
            }
        } else if (request.getParameter("searchPaises") != null) {
            address = "ListaPaises.jsp";
            doAction(request, false);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "ListaPaises.jsp?norecords=1";
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
