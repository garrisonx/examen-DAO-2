/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.dao;

import examen.bean.Bean;
import java.util.ArrayList;

/**
 *
 * @author Garrison
 */
public interface OperacionesBD {

    ArrayList select();
    Bean find(int id);
    boolean update(Bean bean,int id);
    int insert(Bean bean);
    boolean delete(int id);

}
