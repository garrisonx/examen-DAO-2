/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.bean;

/**
 *
 * @author Garrison
 */
public class Continente implements Bean {

    private int idContinente;
    private String nombre;
    private int totalPaises;
    private String heroeHistorico;

    public String getHeroeHistorico() {
        return heroeHistorico;
    }
    public void setHeroeHistorico(String heroeHistorico) {
        this.heroeHistorico = heroeHistorico;
    }
    public int getIdContinente() {
        return idContinente;
    }
    public void setIdContinente(int idContinente) {
        this.idContinente = idContinente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTotalPaises() {
        return totalPaises;
    }
    public void setTotalPaises(int totalPaises) {
        this.totalPaises = totalPaises;
    }

    public Continente() {
    }

    public Continente(String nombre, int totalPaises, String heroeHistorico) {
       setNombre(nombre);
        setTotalPaises(totalPaises);
        setHeroeHistorico(heroeHistorico);
    }

    public Continente(int idContinente, String nombre, int totalPaises, String heroeHistorico) {
        setIdContinente(idContinente);
        setNombre(nombre);
        setTotalPaises(totalPaises);
        setHeroeHistorico(heroeHistorico);
    }

    public boolean isEqual() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
