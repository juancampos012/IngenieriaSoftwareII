/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author juancamposbetancourth
 */
public class Avion implements Transporte {
    private String modelo;
    private int altitud;

    public Avion(String modelo) {
        this.modelo = modelo;
        this.altitud = 0;
    }

    @Override
    public void acelerar() {
        altitud += 1000;
        System.out.println(modelo + " está ascendiendo. Altitud actual: " + altitud + " metros");
    }

    @Override
    public void frenar() {
        altitud -= 500;
        if (altitud < 0) altitud = 0;
        System.out.println(modelo + " está descendiendo. Altitud actual: " + altitud + " metros");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión modelo " + modelo + " con altitud actual de " + altitud + " metros");
    }
}
