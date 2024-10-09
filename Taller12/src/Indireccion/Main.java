/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indireccion;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicioGmail = new SevicioNotificacionesGmail();
        Usuario usuario1 = new Usuario("Juan", "123456", servicioGmail);
        usuario1.generarCorreo(); 

        ServicioNotificaciones servicioOutlook = new ServicioNotificacionesOutlook();
        Usuario usuario2 = new Usuario("María", "7891011", servicioOutlook);
        usuario2.generarCorreo(); 
    }
}