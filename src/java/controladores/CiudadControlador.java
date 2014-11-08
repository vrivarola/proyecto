/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Ciudad;
import entidadesDAO.CiudadDAO;
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
 * @author DELL
 */
public class CiudadControlador extends HttpServlet {

    boolean error = false;
    String mess = "";

    private void doAction(HttpServletRequest request, boolean guardar) {
        error = false;
        Ciudad ciudad = new Ciudad();
        CiudadDAO ciudadManager = new CiudadDAO();
        HttpSession session = request.getSession(true);

        if (request.getParameter("idCiudad") != null) {
            Integer id =  0;
            String param = request.getParameter("idCiudad");

            if (param.length() > 0) {
                id = Integer.parseInt(param);
            }
            if (id != 0) {
                ciudad.setIdCiudad(id);
            }
        }
        if (request.getParameter("ciudadNombre") != null) {
            ciudad.setDescriCiudad(request.getParameter("ciudadNombre"));
        }
        if (guardar) {
            if (ciudadManager.insertar(ciudad)) {
                if (session.getAttribute("listaCiudades") != null) {
                    session.setAttribute("listaCiudades", null);
                }
                List<Ciudad> listaCiudades = ciudadManager.list();

                if (listaCiudades!=null) {
                    session.setAttribute("listaCiudades", listaCiudades);
                }
            } else {
                error = true;
               // mess = ciudadManager.mess;
            }
        } else //Buscar
        {
            if (session.getAttribute("listaCiudades") != null) {
                session.setAttribute("listaCiudades", null);
            }
            List<Ciudad> listaCiudades;
            try{
                    listaCiudades= ciudadManager.buscar(ciudad.getDescriCiudad());


                    session.setAttribute("listaCiudades", listaCiudades);

            }catch(Exception e){
                error = true;

                mess = "Error2";
            }

        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = "ListaCiudades.jsp";

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getParameter("saveCiudad") != null) {
            address = "ListaCiudades.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditCiudad.jsp?error=1";
            }
        } else if (request.getParameter("saveAddCiudad") != null) {
            address = "AgrEditCiudad.jsp";
            doAction(request, true);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "AgrEditCiudad.jsp?error=1";
            }
        } else if (request.getParameter("deleteCiudad") != null) {
            address = "ListaCiudades.jsp";
            if (request.getParameter("idCiudad") != null) {
                Integer id = Integer.parseInt(request.getParameter("idCiudad"));
                CiudadDAO em = new CiudadDAO();
                Ciudad ciudad = em.buscarPorID(id);
                try {
                    HttpSession session = request.getSession();
                    if (!em.eliminar(ciudad.getIdCiudad())) {
                        session.setAttribute("mess", mess);
                        address = "EliminarCiudad.jsp?error=1";
                    }
                    if (session.getAttribute("listaCiudades") != null) {
                        session.setAttribute("listaCiudades", null);
                    }
                    List<Ciudad> listaCiudades = em.list();

                    if (listaCiudades.size() > 0) {
                        session.setAttribute("listaCiudades", listaCiudades);
                    }
                } catch (Exception ex) {
                    String msg = ex.getLocalizedMessage();
                    HttpSession session = request.getSession();
                    session.setAttribute("mensajeError", msg);
                    address = "Error.jsp";
                }
            }
        } else if (request.getParameter("searchCiudades") != null) {
            address = "ListaCiudades.jsp";
            doAction(request, false);
            if (error) {
                HttpSession session = request.getSession();
                session.setAttribute("mess", mess);
                address = "ListaCiudades.jsp?norecords=1";
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);

        dispatcher.forward(request, response);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
