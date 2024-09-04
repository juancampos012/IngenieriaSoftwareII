/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6isp;

/**
 *
 * @author juancamposbetancourth
 */
public class Taller6Isp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cartilla cartilla = new Cartilla("Nacho", 46);
        Libro libro = new Libro("Habitos atomicos", 243, "..", "1233423");
        DVD dvd = new DVD("Rapidos y furiosos", "MP4", 2);
       
        cartilla.prestar();
        cartilla.devolver();
        cartilla.mantenimientoHojas();
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        libro.prestar();
        libro.devolver();
        libro.renovarPortada();
        libro.solicitarNuevaVersion();
        libro.mantenimientoHojas();
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        dvd.prestar();
        dvd.devolver();
    }
    
}
