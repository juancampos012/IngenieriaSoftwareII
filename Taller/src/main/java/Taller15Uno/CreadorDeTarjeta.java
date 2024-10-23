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
public class CreadorDeTarjeta extends Creador {
    @Override
    public MetodoDePago crearMetodoDePago() {
        return new PagoConTarjeta();
    }
}

