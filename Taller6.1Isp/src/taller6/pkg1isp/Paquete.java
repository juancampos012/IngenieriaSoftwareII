/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6.pkg1isp;

/**
 *
 * @author juancamposbetancourth
 */
public abstract class Paquete {
    protected double peso;
    protected double dimensiones;

    public Paquete(double peso, double dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
}
