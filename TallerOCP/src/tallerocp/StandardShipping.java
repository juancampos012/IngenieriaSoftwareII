/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerocp;

/**
 *
 * @author juancamposbetancourth
 */
public class StandardShipping implements Shipping{
    @Override
    public double calculateCost(double weight) {
        return weight * 2000; 
    }
}
