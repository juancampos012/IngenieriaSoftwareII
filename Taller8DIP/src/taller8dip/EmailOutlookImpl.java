/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8dip;

/**
 *
 * @author juancamposbetancourth
 */
public class EmailOutlookImpl extends Outlook implements IServicioEmail{
    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }
    
    @Override
    public void sendEmail() {
        System.out.println("Enviando email a outlook.");
    }
  
}
