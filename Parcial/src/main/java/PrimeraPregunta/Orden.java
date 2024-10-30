/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class Orden {

    public Orden() {
    }
    
    public double calcularTotalConImpuesto(double precio){
        return precio + calcularImpuesto(precio);
    }
    
    public double calcularDescuentoTotal(double precio, double descuento){
        double descuentoPrecio = precio - descuento;
        return descuentoPrecio + calcularImpuesto(precio);
    }
    
    public double calcularImpuesto(double precio){
        return precio * 0.1;
    }
}
