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
public abstract class Calculation {
    protected String product;
    protected int quantity;
    protected double price;

    public Calculation(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract double calculate();
}