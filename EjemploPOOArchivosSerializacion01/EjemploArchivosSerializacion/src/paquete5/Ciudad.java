/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author omerb
 */
public class Ciudad implements Serializable{
    private String nombre;
    private String provincia;

    public Ciudad(String nom, String pro) {
        nombre = nom;
        provincia = pro;
    }
    

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerProvincia(String pro) {
        provincia = pro;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }
    
}
