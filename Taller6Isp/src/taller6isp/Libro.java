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
public class Libro implements LibreriaLibro{
    private String nombre;
    private int numeroHojas;
    private String imagen;
    private String serial;

    public Libro(String nombre, int numeroHojas, String imagen, String serial) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.imagen = imagen;
        this.serial = serial;
    }

    @Override
    public void prestar() {
        System.out.println("Libro "+this.nombre+" prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Libro "+this.nombre+"  devuelto.");
    }

    @Override
    public void renovarPortada() {
        System.out.println("Portada del libro "+this.nombre+" renovada.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Mantenimiento de hojas del libro  "+this.nombre+"  realizado.");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Nueva version del libro  "+this.nombre+"  solicitada.");
    }
}
