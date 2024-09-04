/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6.pkg1isp;

/**
 *
 * @author juancamposbetancourth
 */
public class PaquetePequeño extends Paquete implements IPaquetePequeño{
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        double precio = (peso*valorDeclarado)*0.50;
        System.out.println("El costo del envio pequeño es: "+precio);
    }
}
