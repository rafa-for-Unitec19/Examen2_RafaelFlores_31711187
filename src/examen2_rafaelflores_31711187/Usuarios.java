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
public class Usuarios implements Serializable{
    String nombre, correo, usuario, contraseña;
    int edad;
    Canales canal;
    ArrayList<Canales> suscripciones;
    Playlist favoritos;

    public Usuarios(String nombre, String correo, String usuario, String contraseña, int edad, Canales canal, Playlist favoritos) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.canal = canal;
        this.suscripciones = new ArrayList();
        this.favoritos = favoritos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCanal(Canales canal) {
        this.canal = canal;
    }

    public void setSuscripciones(ArrayList<Canales> suscripciones) {
        this.suscripciones = suscripciones;
    }

    public void setFavoritos(Playlist favoritos) {
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public Canales getCanal() {
        return canal;
    }

    public ArrayList<Canales> getSuscripciones() {
        return suscripciones;
    }

    public Playlist getFavoritos() {
        return favoritos;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
