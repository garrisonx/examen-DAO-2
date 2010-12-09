/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.servlet;

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
public class eliminarContinente extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher view=null;
        ContinenteDao con = new ContinenteDao();
        try{
            int idContinente = Integer.parseInt(request.getParameter("idContinente"));
            boolean res = con.delete(idContinente);

            if(res){
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

    
}
