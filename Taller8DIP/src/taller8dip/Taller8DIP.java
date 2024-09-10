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
public class Taller8DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioEmail servicioEmaiGmaill = new EmailGmailimpl("", "", "", "");
        IServicioEmail servicioEmailYahoo = new EmailYahooImpl("", "", "", "");
        IServicioEmail servicioEmailOutlook = new EmailOutlookImpl( "", "", "");
        
        Sistema sistemaGmail = new Sistema(servicioEmaiGmaill);
        Sistema sistemaYahoo = new Sistema(servicioEmailYahoo);
        Sistema sistemOutlook = new Sistema(servicioEmailOutlook);
        
        sistemOutlook.sendEmail();
        sistemaGmail.sendEmail();
        sistemaYahoo.sendEmail();
    }
    
}
