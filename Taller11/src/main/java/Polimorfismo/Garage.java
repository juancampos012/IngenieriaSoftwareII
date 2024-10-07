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
public class Garage {
    public void estacionar(Transporte transporte) {
        System.out.println("Estacionando vehículo...");
        transporte.mostrarInformacion();
        transporte.frenar();
        System.out.println("Vehículo estacionado.\n");
    }
}
