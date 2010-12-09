/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.servlet;

import examen.bean.Continente;
import examen.dao.ContinenteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Garrison
 */
public class crearContinente extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet crearContinente</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet crearContinente at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher view=null;
        ContinenteDao con = new ContinenteDao();
        Continente continente=null;
        String nombre= request.getParameter("nombre");
        int totalPaises = Integer.parseInt(request.getParameter("totalPaises"));
        String heroeHistorico = request.getParameter("heroeHistorico");
        continente = new Continente(nombre,totalPaises,heroeHistorico);
        try{
            
            if(con.insert(continente)>0){
                view = request.getRequestDispatcher("success.jsp");
                view.forward(request, response);
            }
            else{
                view = request.getRequestDispatcher("error.jsp");
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
