/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlaCohesionBajoAcoplamiento;

/**
 *
 * @author juancamposbetancourth
 */
public class CalculadorDescuentoSimple implements CalculadorDescuento {
    @Override
    public double aplicarDescuento(double total, double descuento) {
        return total - (total * descuento / 100);
    }
}