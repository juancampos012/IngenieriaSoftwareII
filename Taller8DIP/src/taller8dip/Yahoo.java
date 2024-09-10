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
public class Yahoo extends Email{
    private String file;

    public Yahoo(String file, String to, String subject, String body) {
        super(to, subject, body);
        this.file = file;
    }
   
}
