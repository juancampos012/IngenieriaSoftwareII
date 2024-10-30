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
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new   Notificacion("hola");
        EnviarNotificacion notificacionW = new EnviarNotificacionWhastApp();
        EnviarNotificacion notificacionM = new EnviarNotificacionSMS();
        notificacionM.enviarNotificacion(notificacion);
        notificacionW.enviarNotificacion(notificacion);
        
        Tarea tarea = new Tarea("uno");
        ServicioTareas servicioTarea = new ServicioTareas(tarea);
        servicioTarea.insertarTarea(tarea);
        servicioTarea.leerTarea();
    }
}
    
