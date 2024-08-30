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
public class MixedProduct extends Product implements emailService{
    private double weight;
    private double fileSize;

    public MixedProduct(String name, double price, int quantity, double weight, double fileSize) {
        super(name, price, quantity);
        this.weight = weight;
        this.fileSize = fileSize;
    }

    @Override
    public double calculateCost() {
        return price * quantity + (weight * 400) + (fileSize * 200);    
    }

    @Override
    public void sendByMail() {
        System.out.println("Producto mixto enviado por correo.");
    }
    
}
