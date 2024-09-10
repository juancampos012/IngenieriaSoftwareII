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
public class Gmail extends Email{
    private String image;

    public Gmail(String image, String to, String subject, String body) {
        super(to, subject, body);
        this.image = image;
    }
}
