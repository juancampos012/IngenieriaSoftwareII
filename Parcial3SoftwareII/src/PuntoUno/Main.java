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
public class Main {
    public static void main(String[] args) {
        ServicioDeEnvioFactory expressFactory = new EnvioExpressFactory();
        ServicioDeEnvioFactory regularFactory = new EnvioRegularFactory();

        ServicioDeEnvio servicioExpress = expressFactory.crearServicioEnvio();
        ServicioDeEnvio servicioRegular = regularFactory.crearServicioEnvio();

        servicioExpress.enviar("Paquete 1");
        servicioRegular.enviar("Paquete 2");
    }
}
