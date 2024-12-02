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
public class EnvioRegularFactory implements ServicioDeEnvioFactory {
    @Override
    public ServicioDeEnvio crearServicioEnvio() {
        return new EnvioRegular();
    }
}
