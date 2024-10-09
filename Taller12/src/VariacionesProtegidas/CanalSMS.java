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
public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviar(Notificacion notificacion) {
        System.out.println("Enviando por SMS:");
        System.out.println(notificacion);
    }
}
