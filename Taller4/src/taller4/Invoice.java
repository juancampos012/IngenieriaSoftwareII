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
public class Invoice {
    public double calculateTotal(Calculation calculation) {
        return calculation.calculate();
    }
}
