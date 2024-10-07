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
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Transporte coche = new Coche("Toyota");
        coche.acelerar();
        garage.estacionar(coche);

        Transporte avion = new Avion("Boeing 747");
        avion.acelerar();
        garage.estacionar(avion);

        Transporte bicicleta = new Bicicleta("Montaña");
        bicicleta.acelerar();
        garage.estacionar(bicicleta);
    }
}
