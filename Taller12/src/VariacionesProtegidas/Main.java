/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariacionesProtegidas;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("Alerta", "Este es un mensaje importante");

        Notificadot notificador = new Notificadot(new CanalCorreoElectronico());
        notificador.enviarNotificacion(notificacion);

        notificador.setCanal(new CanalSMS());
        notificador.enviarNotificacion(notificacion);

        notificador.setCanal(new CanalWhatsApp());
        notificador.enviarNotificacion(notificacion);
    }
}
