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
public class Videos implements Serializable{
    private static final Long SeriaVersionUID = 777L;
    
    private String nombre;
    private int duracion, numLikes, numDislikes;
    private ArrayList<String> comentarios, subtitulos;

    public Videos(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.numLikes = numLikes;
        this.numDislikes = numDislikes;
        this.comentarios = new ArrayList();
        this.subtitulos = new ArrayList();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public void setNumDislikes(int numDislikes) {
        this.numDislikes = numDislikes;
    }

    public void setComentarios(String comentarios) {
        this.comentarios.add(comentarios);
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos.add(subtitulos);
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public int getNumDislikes() {
        return numDislikes;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    @Override
    public String toString() {
        return "Titulo: "+nombre + " - Duracion: " + duracion;
    }
    
    
}
