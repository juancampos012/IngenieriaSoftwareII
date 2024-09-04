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
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso{
    private String etiquetaDePeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(String etiquetaDePeligro, boolean embalajeEspecial, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.etiquetaDePeligro = etiquetaDePeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("El contenido peligroso se ha verificado exitosamente.");
    }

    @Override
    public void asegurarContenidoPeligroso() {
        System.out.println("El contenido peligroso se aseguro");
    }
}
