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
public class UsuarioFuncionalidad {
    private IServicioDeNotificaciones servicioDeNotificaciones;

    public UsuarioFuncionalidad(IServicioDeNotificaciones servicioDeNotificaciones) {
        this.servicioDeNotificaciones = servicioDeNotificaciones;
    }
    
    public void enviarNotificacion(){
        servicioDeNotificaciones.enviarCorreo();
    }
}
