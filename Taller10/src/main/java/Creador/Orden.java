/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Orden {
    private List<Computadora> computadoras;

    public Orden() {
        this.computadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    public double calcularTotal() {
        // Este ejemplo asume un precio ficticio basado en la RAM
        double total = 0;
        for (Computadora computadora : computadoras) {
            total += calcularPrecio(computadora);
        }
        return total;
    }

    private double calcularPrecio(Computadora computadora) {
        // Supongamos un precio base de $300 por cada GB de RAM
        return computadora.getRam() * 300;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }
}
