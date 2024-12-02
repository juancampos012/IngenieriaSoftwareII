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
public class SistemaPagoAdapter implements SistemaPagoI{
    private SistemaPago sistemaPago;

    public SistemaPagoAdapter(SistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }
    
    @Override
    public void cerrarSesion() {
        sistemaPago.cerrarSesion();
    }

    @Override
    public void validarCorreo() {
        sistemaPago.validarCorreo();
    }

    @Override
    public void validarAutorizacion() {
        sistemaPago.validarAutorizacion();
    }

    @Override
    public void realizarPago() {
        sistemaPago.realizarPago();
    }
}
