/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallertlsp;

/**
 *
 * @author juancamposbetancourth
 */
public class TallertLsp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct("Celular", 800000, 5, 2);
        Product digitalProduct = new DigitalProduct("Libro digital", 30000, 2, 15);
        MixedProduct mixedProduct = new MixedProduct("Juego", 15000, 4, 2, 12);

        System.out.println("Costo de producto fisico: " + physicalProduct.calculateCost());
        System.out.println("Costo de producto digital: " + digitalProduct.calculateCost());
        System.out.println("Costo de producto mixto: " + mixedProduct.calculateCost());

        physicalProduct.sendByMail();
        mixedProduct.sendByMail();
    }
    
}
