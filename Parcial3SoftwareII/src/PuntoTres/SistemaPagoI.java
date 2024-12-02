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
public interface SistemaPagoI {
    void cerrarSesion();
    void validarCorreo();
    void validarAutorizacion();
    void realizarPago();    
}
