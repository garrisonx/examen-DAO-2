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
public class modificarContinente extends HttpServlet {
   
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher view=null;
        ContinenteDao con = new ContinenteDao();
        Continente continente=null;
        int idContinente = Integer.parseInt(request.getParameter("idContinente"));
        String nombre= request.getParameter("nombre");
        int totalPaises = Integer.parseInt(request.getParameter("totalPaises"));
        String heroeHistorico = request.getParameter("heroeHistorico");
        continente = new Continente(idContinente,nombre,totalPaises,heroeHistorico);
        try{

            if(con.update(continente, idContinente)){
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
