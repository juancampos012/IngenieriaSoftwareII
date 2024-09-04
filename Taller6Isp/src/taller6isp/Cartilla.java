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
public class Cartilla implements LibreriaCartilla{
    private String nombre;
    private int numeroHojas;

    public Cartilla(String nombre, int numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void prestar() {
        System.out.println("Cartilla "+this.nombre+" prestada.");
    }

    @Override
    public void devolver() {
        System.out.println("Cartilla "+this.nombre+" devuelta.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Se ha realizado el mantenimiento de la cartilla "+this.nombre+" con exito");
    }
}
