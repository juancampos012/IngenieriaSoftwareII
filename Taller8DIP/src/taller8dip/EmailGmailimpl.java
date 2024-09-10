package taller8dip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancamposbetancourth
 */
public class EmailGmailimpl extends Gmail implements IServicioEmail{
    
    public EmailGmailimpl(String image, String to, String subject, String body) {
        super(image, to, subject, body);
    }
    
    @Override
    public void sendEmail() {
        System.out.println("Enviando email a gmail.");
    }
    
}
