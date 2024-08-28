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
public class IvaHealthyCalculate  extends Calculation {
    private final double HEALTHY_RATE = 0.05;

    public IvaHealthyCalculate(String product, int quantity, double price) {
        super(product, quantity, price);
    }

    @Override
    public double calculate() {
        return price * quantity * HEALTHY_RATE;
    }
}