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
public class Playlist implements Serializable{
    private static final Long SeriaVersionUID = 778L;
    
    private ArrayList<Videos> videos;
    private int duracionTot;

    public Playlist() {
        this.videos = new ArrayList();
    }
    
    

    public Playlist(int duracionTot) {
        this.videos = new ArrayList();
        this.duracionTot = duracionTot;
    }

    public void setVideos(ArrayList<Videos> videos) {
        this.videos = videos;
    }

    public void setDuracionTot(int duracionTot) {
        this.duracionTot = duracionTot;
    }

    public ArrayList<Videos> getVideos() {
        return videos;
    }

    public int getDuracionTot() {
        return duracionTot;
    }

    @Override
    public String toString() {
        return "Duración Total" + duracionTot;
    }
    
    
}
