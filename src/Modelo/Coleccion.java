/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ruben
 */
public class Coleccion {

    private int idColeccion;
    private String nombre;
    private String sinopsis;
    private String editorial;

    public Coleccion(int idColeccion, String nombre, String sinopsis, String editorial) {
        this.idColeccion = idColeccion;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.editorial = editorial;
    }

    public Coleccion(String nombre, String sinopsis, String editorial) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.editorial = editorial;
    }

    public int getIdColeccion() {
        return idColeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void setIdColeccion(int idColeccion) {
        this.idColeccion = idColeccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
}
