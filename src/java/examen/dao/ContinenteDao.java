/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.dao;

import examen.bean.Bean;
import examen.bean.Continente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Garrison
 */
public class ContinenteDao {

     public ArrayList select() {
       Continente uni = null;
       Connection conexion = null;
       PreparedStatement ps = null;
       ResultSet rs =null;
       ArrayList continentes = new ArrayList();

       try{
            conexion = DaoFactory.getConexion();
            ps = conexion.prepareStatement(SQL.selectContinente);
            rs = ps.executeQuery();
            uni = new Continente();
            while(rs.next())
                continentes.add(new Continente(rs.getInt("ID_CONTINENTE"),rs.getString("NOMBRE"),rs.getInt("TOTAL_PAISES"),rs.getString("HEROE_HISTORICO")));

       }
       catch(Exception ex){
            ex.printStackTrace();
        }
       finally{
        try{
            if(rs!=null){
                rs.close();
                rs =null;
            }
            if(ps!=null){
                ps.close();
                ps =null;
            }
            if(conexion!=null){
                DaoFactory.closeConexion(conexion);
                conexion = null;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       }
       return continentes;
    }

     public Bean find(int id){
        Continente continente =  null;
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs =null;
        try{
            conexion = DaoFactory.getConexion();
            ps = conexion.prepareStatement(SQL.findContinente);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while(rs.next())
                continente = new Continente(rs.getInt("ID_CONTINENTE"),rs.getString("NOMBRE"),rs.getInt("TOTAL_PAISES"),rs.getString("HEROE_HISTORICO"));
        }catch(Exception ex){
        ex.printStackTrace();
        }
        finally{
        try{
            if(rs!=null){
                rs.close();
                rs =null;
            }
            if(ps!=null){
                ps.close();
                ps =null;
            }
            if(conexion!=null){
                DaoFactory.closeConexion(conexion);
                conexion = null;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       }

        return continente;
    }

     public boolean update(Bean bean, int id) {
       boolean resultado = false;
       Connection conexion = null;
       PreparedStatement ps = null;
       ResultSet rs =null;
        try{
            conexion = DaoFactory.getConexion();
            ps = conexion.prepareStatement(SQL.updateContinente);
            Continente con = (Continente) bean;
            ps.setInt(1, con.getIdContinente());
            ps.setString(2,con.getNombre());
            ps.setInt(3,con.getTotalPaises());
            ps.setString(4,con.getHeroeHistorico());
            ps.setInt(5, id);
            ps.executeUpdate();
            return true;


        }
       catch(Exception ex){
        ex.printStackTrace();
       }
       finally{
        try{
            if(rs!=null){
                rs.close();
                rs =null;
            }
            if(ps!=null){
                ps.close();
                ps =null;
            }
            if(conexion!=null){
                DaoFactory.closeConexion(conexion);
                conexion = null;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       }

       return resultado;
    }

     public int insert(Bean bean) {
        int resultado =0;
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs =null;

        try{
            conexion = DaoFactory.getConexion();
            ps = conexion.prepareStatement(SQL.insertContinente);
            Continente con = (Continente) bean;
            ps.setString(1, con.getNombre());
            ps.setInt(2, con.getTotalPaises() );
            ps.setString(3, con.getHeroeHistorico());
            resultado = ps.executeUpdate();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
        try{

            if(rs!=null){
                rs.close();
                rs =null;
            }
            if(ps!=null){
                ps.close();
                ps =null;
            }
            if(conexion!=null){
                DaoFactory.closeConexion(conexion);
                conexion = null;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       }

        return resultado;
    }

     public boolean delete(int id) {
        boolean result = false;
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs =null;
        try{
            conexion = DaoFactory.getConexion();
            ps = conexion.prepareStatement(SQL.deleteContinente);
            ps.setInt(1, id);
            int rows_updated = ps.executeUpdate();
            return true;


        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
        try{

            if(rs!=null){
                rs.close();
                rs =null;
            }
            if(ps!=null){
                ps.close();
                ps =null;
            }
            if(conexion!=null){
                DaoFactory.closeConexion(conexion);
                conexion = null;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

       }


        return result;
    }

}
