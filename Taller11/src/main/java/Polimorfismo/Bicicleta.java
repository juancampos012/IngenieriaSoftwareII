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
public class Bicicleta implements Transporte {
    private String tipo;
    private int velocidad;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 5;
        System.out.println(tipo + " está acelerando. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 3;
        if (velocidad < 0) velocidad = 0;
        System.out.println(tipo + " está frenando. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta tipo " + tipo + " con velocidad actual de " + velocidad + " km/h");
    }
}
