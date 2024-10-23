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
public class PagoConTarjeta implements MetodoDePago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando el pago de $" + cantidad + " con tarjeta.");
    }
}
