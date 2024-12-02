/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoTres;

/**
 *
 * @author juancamposbetancourth
 */
public class SistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public SistemaPago(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }
    
    public void cerrarSesion(){
        System.out.println("Cerrando la sesion a: "+ this.correo);
    }
    
    public void validarCorreo(){
        System.out.println("Validando correo: "+this.correo);
    }
    
    public void validarAutorizacion(){
        System.out.println("Validando autorizacion");
    }
    
    public void realizarPago(){
        System.out.println("Realizando pago.");
    }
}
