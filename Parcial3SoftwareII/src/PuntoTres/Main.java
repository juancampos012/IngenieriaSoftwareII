/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoTres;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
     public static void main(String[] args) {
        SistemaPago sistemaPago = new SistemaPago("ContaNova", "11113322", "juanj.camposb@gmail.com");
        SistemaPagoI sistema = new SistemaPagoAdapter(sistemaPago);
        sistema.cerrarSesion();
        sistema.validarAutorizacion();
        sistema.validarCorreo();
        sistema.realizarPago();
    }
}
