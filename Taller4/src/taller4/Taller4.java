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
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculation ivaCalculation = new IvaCalculation("Detodito", 1, 3000); 
        Calculation icaCalculation = new IcaCalculation("Detodito", 5, 3000);
        Calculation healthyCalculation = new IvaHealthyCalculate("Detodito", 3, 3000);

        Invoice invoice = new Invoice();

        // Calculate and display the tax for each type
        System.out.println("IVA: " + invoice.calculateTotal(ivaCalculation));
        System.out.println("ICA: " + invoice.calculateTotal(icaCalculation));
        System.out.println("Healthy: " + invoice.calculateTotal(healthyCalculation));
    }
    
}
