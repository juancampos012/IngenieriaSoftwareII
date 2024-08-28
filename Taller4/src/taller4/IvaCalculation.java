/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

/**
 *
 * @author juancamposbetancourth
 */
public class IvaCalculation extends Calculation {
    private final double IVA_RATE = 0.19;

    public IvaCalculation(String product, int quantity, double price) {
        super(product, quantity, price);
    }

    @Override
    public double calculate() {
        return price * quantity * IVA_RATE;
    }
}