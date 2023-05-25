/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "hospitales.data";
        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Zamora", "Zamora");
        Ciudad c3 = new Ciudad("Quito", "Pichincha");
        Ciudad c4 = new Ciudad("Machala", "El Oro");
        Ciudad c5 = new Ciudad("Manabi", "Manta");
        Hospital h1 = new Hospital("Hospital Zamora", 20, 3000, c2);
        Hospital h2 = new Hospital("Hospital Loja", 10, 5000, c1);
        Hospital h3 = new Hospital("Hospital Quito", 30, 15000, c3);
        Hospital h4 = new Hospital("Hospital Manabi", 15, 8000, c5);
        Hospital h5 = new Hospital("Hospital Machala", 50, 25000, c4);
        Hospital[] hospi = {h1, h2, h3, h4, h5};
        paquete5.EscrituraArchivoSecuencial archivo = new paquete5.EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < hospi.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(hospi[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        paquete5.LecturaArchivoSecuencial lectura = new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
