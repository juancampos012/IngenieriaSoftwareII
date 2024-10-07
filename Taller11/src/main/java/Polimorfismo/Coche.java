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
public class Coche implements Transporte {
    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println(marca + " está acelerando. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0;
        System.out.println(marca + " está frenando. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche marca " + marca + " con velocidad actual de " + velocidad + " km/h");
    }
}
