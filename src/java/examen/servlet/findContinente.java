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
public class findContinente extends HttpServlet {
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher view=null;
        ContinenteDao con = new ContinenteDao();
        Continente continente = new Continente();
        try{
            int idContinente = Integer.parseInt(request.getParameter("idContinente"));
            continente=(Continente) con.find(idContinente);
            request.setAttribute("Continente", continente);
            if(continente!=null){
                view = request.getRequestDispatcher("formulario.jsp");
                view.forward(request, response);
            }
            else{
                view = request.getRequestDispatcher("error.jsp");
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

} 


