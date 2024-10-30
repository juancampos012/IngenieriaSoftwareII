/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class EnviarNotificacionWhastApp extends EnviarNotificacion{

    public EnviarNotificacionWhastApp() {
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificacion por WhatsApp");
    }
}