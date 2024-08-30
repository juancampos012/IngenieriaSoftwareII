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
public class DigitalProduct extends Product{
    private double fileSize;
    
    public DigitalProduct(String name, double price, int quantity, double fileSize) {
        super(name, price, quantity);
        this.fileSize = fileSize;
    }

    @Override
    public double calculateCost() {
        return (price * quantity) + (fileSize * 200);
    }
    
}
