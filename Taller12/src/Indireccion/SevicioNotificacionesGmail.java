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
public class SevicioNotificacionesGmail implements ServicioNotificaciones {
    @Override
    public Correo crear(Usuario usuario) {
        return new Correo(usuario.getNombre(), usuario.getIdentificacion(), "Gmail");
    }
}