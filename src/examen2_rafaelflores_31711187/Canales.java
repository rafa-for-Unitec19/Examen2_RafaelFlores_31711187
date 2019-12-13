/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_rafaelflores_31711187;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Faith
 */
public class Canales implements Serializable{
    private static final Long SeriaVersionUID = 776L;
    
    int numeroSuscriptores, numVideos, cantLikes;
    String nombre, Categoria;
    ArrayList<Videos> vidPropios;

    public Canales(String nombre, String categoria) {
        this.vidPropios = new ArrayList();
        this.nombre = nombre;
        this.Categoria = categoria;
    }
    
    

    public Canales(int numeroSuscriptores, int numVideos, int cantLikes, String nombre, String Categoria) {
        this.numeroSuscriptores = numeroSuscriptores;
        this.numVideos = numVideos;
        this.cantLikes = cantLikes;
        this.nombre = nombre;
        this.Categoria = Categoria;
        this.vidPropios = new ArrayList();
    }

    public void setNumeroSuscriptores(int numeroSuscriptores) {
        this.numeroSuscriptores = numeroSuscriptores;
    }

    public void setNumVideos(int numVideos) {
        this.numVideos = numVideos;
    }

    public void setCantLikes(int cantLikes) {
        this.cantLikes = cantLikes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setVidPropios(ArrayList<Videos> vidPropios) {
        this.vidPropios = vidPropios;
    }

    public int getNumeroSuscriptores() {
        return numeroSuscriptores;
    }

    public int getNumVideos() {
        return numVideos;
    }

    public int getCantLikes() {
        return cantLikes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public ArrayList<Videos> getVidPropios() {
        return vidPropios;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
