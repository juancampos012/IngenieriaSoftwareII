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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client("Juan Campos", "juanj.camposb@autonoma.edu.co");
        Invoice invoice = new Invoice("Compra de celulares", 10000000, client);

        SaveService dbManager = new SaveService();
        EmailService emailService = new EmailService();
        ReportService reportGenerator = new ReportService();

        dbManager.saveClient(client);
        dbManager.saveInvoice(invoice);

        emailService.sendInvoiceEmail(client, invoice);
        emailService.sendInvoiceToDian(invoice);

        reportGenerator.generateMonthlyInvoiceReport();
    }
    
}
    