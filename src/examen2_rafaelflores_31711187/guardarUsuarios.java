/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_rafaelflores_31711187;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faith
 */
public class guardarUsuarios {
    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;

    public guardarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaPersonas() {
        return listaUsuarios;
    }

    public void setListaPersonas(ArrayList<Usuarios> listaPersonas) {
        this.listaUsuarios = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setPersona(Usuarios p) {
        this.listaUsuarios.add(p);
    }
    
    @Override
    public String toString() {
        return "listaPersonas=" + listaUsuarios;
    }
    
    public void cargarArchivo(){
        try {
            listaUsuarios = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios)objeto.readObject()) != null) {                        
                        listaUsuarios.add(temp);
                    }
                } catch (/*End of File Exception*/EOFException e) {
                    //Esta excepcion sismpre se lanza
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void EscribirBinario(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios p : listaUsuarios) {
                bw.writeObject(p);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception ex) {
                Logger.getLogger(guardarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
