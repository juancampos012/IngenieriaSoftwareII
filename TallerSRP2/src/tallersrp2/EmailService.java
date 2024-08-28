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
public class EmailService {
    public void sendInvoiceEmail(Client client, Invoice invoice) {
        System.out.println("Email enviado a " + client.getEmail() + " la factura de : " + invoice.getDescription());
    }

    public void sendInvoiceToDian(Invoice invoice) {
        System.out.println("Email enviado a la Dian: " + invoice.getDescription());
    }
}
