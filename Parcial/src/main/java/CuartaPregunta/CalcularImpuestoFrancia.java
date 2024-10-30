/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuartaPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class CalcularImpuestoFrancia implements CalcularImpuesto{

    public CalcularImpuestoFrancia() {
    }
     
    @Override
    public void calcularImpuesto(double valor) {
        System.out.println("Calculando para Francia.");
    }
}
