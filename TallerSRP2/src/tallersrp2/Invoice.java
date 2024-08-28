/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersrp2;

/**
 *
 * @author juancamposbetancourth
 */
public class Invoice {
    private String description;
    private double amount;
    private Client client;

    public Invoice(String description, double amount, Client client) {
        this.description = description;
        this.amount = amount;
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Client getClient() {
        return client;
    }
}
