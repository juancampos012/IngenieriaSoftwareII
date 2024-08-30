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
public class PhysicalProduct extends Product implements emailService{
    private double weight;
    
    public PhysicalProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double calculateCost() {
        return price * quantity + (weight * 400);    
    }

    @Override
    public void sendByMail() {
        System.out.println("Producto fisico enviado por correo.");    
    }
    
}
