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
public class Taller7Dip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioDeNotificaciones servicioDeNotificaciones = new ServicioDeNotificacionesImpl();
        UsuarioFuncionalidad usuarioFuncionalidad = new UsuarioFuncionalidad(servicioDeNotificaciones);
        usuarioFuncionalidad.enviarNotificacion();
    }
    
}
