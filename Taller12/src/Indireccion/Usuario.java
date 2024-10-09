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
public class Usuario {
    private String nombre;
    private String identificacion;
    private ServicioNotificaciones servicioNotificaciones;

    public Usuario(String nombre, String identificacion, ServicioNotificaciones servicioNotificaciones) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioNotificaciones = servicioNotificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificaciones.crear(this);
    }
}
