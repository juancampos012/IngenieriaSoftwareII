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
public class SaveService {
    public void saveInvoice(Invoice invoice) {
        System.out.println("Factura guardada en la base de datos correctamente: " + invoice.getDescription());
    }

    public void saveClient(Client client) {
        System.out.println("Cliente guardad0 en la base de datos correctamente: " + client.getName());
    }
}
