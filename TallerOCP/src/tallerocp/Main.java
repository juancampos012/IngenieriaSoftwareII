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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService();
        
        Shipping standardShipping = new StandardShipping();
        Shipping expressShipping = new ExpressShipping();
        Shipping internationalShipping = new InternationalShipping();
        
        double standardCost = shippingService.calculateShippingCost(standardShipping, 10);
        double expressCost = shippingService.calculateShippingCost(expressShipping, 10);
        double internationalCost = shippingService.calculateShippingCost(internationalShipping, 10);
        
        System.out.println("Envio estandar: " + standardCost);
        System.out.println("Envio express: " + expressCost);
        System.out.println("Envio internacional: " + internationalCost);
    }
    
}
