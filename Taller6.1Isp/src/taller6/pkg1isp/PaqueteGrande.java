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
public class PaqueteGrande extends Paquete implements IPaqueteGrande{
    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double volumen, String medioTransporte, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }    

    @Override
    public void calcularCostoEnvioGrande() {
        double precio = (peso*volumen)*0.50;
        System.out.println("El costo del envio grande es: "+precio);
    }
}
