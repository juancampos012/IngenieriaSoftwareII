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
public class ControladorImpuestos {
    private CalcularImpuesto calcularImpuesto;

    public ControladorImpuestos(CalcularImpuesto calcularImpuesto) {
        this.calcularImpuesto = calcularImpuesto;
    }

    public void calcularImpuestos(double valor) {
        calcularImpuesto.calcularImpuesto(valor);
    }
}
