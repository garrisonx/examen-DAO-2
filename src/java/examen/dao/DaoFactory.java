/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Garrison
 */
public class DaoFactory {

    private static String cadenaConexion = "jdbc:mysql://localhost:8889/examen";
    private static String usuario = "root";
    private static String password = "root";

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conexion = DriverManager.getConnection(cadenaConexion,usuario,password);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }


    return conexion;
    }

    public static Connection closeConexion(Connection conexion){
        try {
            if (conexion != null) {
                conexion.close();
                conexion=null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }

    public static void main(String[] args) {

        Connection con = null;
        DaoFactory daoFactory = new DaoFactory();
        con = daoFactory.getConexion();
        if(con!= null)
            System.out.println("Conexion exitosa");
        else
            System.out.println("Conexion fallida");


         con = daoFactory.closeConexion(con);
         if(con==null){
             System.out.println("Conexion cerrada");
         }
         else
             System.out.println("Conexion sin cerrar");

    }


}
