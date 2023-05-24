/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Profesor2 {

    private String nombre;
    private String tipo;
    private int edad;

    public Profesor2(String n, String t, int e) {
        nombre = n;
        tipo = t;
        edad = e;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerEdad() {
        return edad;
    }

    @Override
    public String toString() {

        String cadena = String.format("Datos del Profesor\n"
                + "Nombre del Profesor: %s\n"
                + "Tipo del Profesor: %s\n"
                + "Edad del Profesor: %d",
                obtenerNombre(), obtenerTipo(), obtenerEdad());
        return cadena;
    }

}
