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
public class Main {
    public static void main(String[] args) {
        CalcularImpuesto calcularImpuestoC = new CalcularImpuestoColombia();
        CalcularImpuesto calcularImpuestoE = new CalcularImpuestoEEUU();
        CalcularImpuesto calcularImpuestoF = new CalcularImpuestoFrancia();
        ControladorImpuestos controlador1 = new ControladorImpuestos(calcularImpuestoC);
        ControladorImpuestos controlador2 = new ControladorImpuestos(calcularImpuestoE);
        ControladorImpuestos controlador3 = new ControladorImpuestos(calcularImpuestoF);
       
        controlador1.calcularImpuestos(1);
        controlador2.calcularImpuestos(1);
        controlador3.calcularImpuestos(1);
    }
}