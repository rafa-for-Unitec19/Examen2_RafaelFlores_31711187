/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_rafaelflores_31711187;

import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Faith
 */
public class Reproduccion extends Thread{
    private JLabel titulo, subtitulo, telemetria;
    private JProgressBar progreso;
    private Date fechaI;
    private int duracion;
    private boolean vive, avanza;
    private Videos videoA;

    public Reproduccion(JLabel titulo, JLabel subtitulo, JLabel telemetria, JProgressBar progreso, Videos video) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.telemetria = telemetria;
        this.progreso = progreso;
        this.videoA = video;
        this.duracion = videoA.getDuracion();
        this.fechaI = new Date();
        this.vive = true;
        this.avanza = true;
    }
    
    
    
    @Override
    public void run(){
        int min = 0;
        this.titulo.setText(videoA.getNombre());
        this.progreso.setMaximum(duracion);
        while(vive){
            if (avanza) {
                Date fechaA = new Date();
                long diferencia = fechaA.getTime() - fechaI.getTime();
                diferencia = diferencia / 1000;
                this.progreso.setValue((int) diferencia);
                this.telemetria.setText(diferencia+" Seg.");
                if (diferencia >= duracion) {
                    avanza = false;
                }
            }else{
                vive = false;
            }
            try {
                Reproduccion.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
