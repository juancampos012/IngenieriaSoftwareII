/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoUno;

/**
 *
 * @author juancamposbetancourth
 */
public class EnvioRegular implements ServicioDeEnvio {
    @Override
    public void enviar(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA REGULAR: " + paquete);
    }
}