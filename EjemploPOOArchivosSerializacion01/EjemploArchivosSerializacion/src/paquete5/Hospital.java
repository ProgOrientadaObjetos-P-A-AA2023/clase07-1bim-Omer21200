/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Ciudad ciudad;

    public Hospital(String nom, int num, double pre,Ciudad ciu) {
        nombre = nom;
       numeroCamas = num;
        presupuesto = pre;
        ciudad=ciu;
    }
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumeroCamas(int num) {
        numeroCamas = num;
    }

    public void establecerPresupuesto(double pre) {
        presupuesto = pre;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
}