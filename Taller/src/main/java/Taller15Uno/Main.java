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
public class Main {
    public static void main(String[] args) {
        Creador creadorDeTarjeta = new CreadorDeTarjeta();
        Creador creadorDePaypal = new CreadorDePaypal();
        
        creadorDeTarjeta.procesar(100.0);
        creadorDePaypal.procesar(200.0);
    }
}
