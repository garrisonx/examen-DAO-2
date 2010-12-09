/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.dao;

/**
 *
 * @author Garrison
 */
public class SQL {

    public static String findContinente="Select * from continente WHERE ID_CONTINENTE=?";
    public static String selectContinente="SELECT ID_CONTINENTE,NOMBRE,TOTAL_PAISES,HEROE_HISTORICO from continente ";
    public static String updateContinente="UPDATE continente SET ID_CONTINENTE=?,NOMBRE=?, TOTAL_PAISES=?, HEROE_HISTORICO=? WHERE ID_CONTINENTE=?";
    public static String insertContinente="INSERT INTO continente(NOMBRE,TOTAL_PAISES,HEROE_HISTORICO) VALUES(?,?,?)";
    public static String deleteContinente="DELETE FROM continente WHERE ID_CONTINENTE=?";

}
