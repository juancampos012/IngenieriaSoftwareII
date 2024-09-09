/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7dip;

/**
 *
 * @author juancamposbetancourth
 */
public class ServicioDeNotificacionesImpl  implements IServicioDeNotificaciones{
    
    @Override
    public void enviarCorreo() {
        System.out.println("Esoy enviando el correo.");
    }
    
}
