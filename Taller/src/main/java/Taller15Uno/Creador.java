/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller15Uno;

/**
 *
 * @author juancamposbetancourth
 */
public abstract class Creador {
    public abstract MetodoDePago crearMetodoDePago();

    public void procesar(double cantidad) {
        MetodoDePago metodoDePago = crearMetodoDePago();
        metodoDePago.procesarPago(cantidad);
    }
}
