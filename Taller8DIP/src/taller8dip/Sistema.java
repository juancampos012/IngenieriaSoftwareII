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
public class Sistema {
    private IServicioEmail serviceEmail;

    public Sistema(IServicioEmail serviceEmail) {
        this.serviceEmail = serviceEmail;
    }
    
    public void sendEmail(){
        serviceEmail.sendEmail();
    }
}
