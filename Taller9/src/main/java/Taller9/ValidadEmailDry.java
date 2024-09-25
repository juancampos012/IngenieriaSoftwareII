/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller9;

/**
 *
 * @author juancamposbetancourth
 */
public class ValidadEmailDry {

    public ValidadEmailDry() {
    }
    
    public static void validarEmail(String email) {
        if (email.contains("@") || email.contains(".")) {
            System.out.println("Email inválido");
        }
    }
}
