/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_rafaelflores_31711187;

import java.util.ArrayList;

/**
 *
 * @author Faith
 */
public class Playlist {
    ArrayList<Videos> videos;
    int duracionTot;

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
