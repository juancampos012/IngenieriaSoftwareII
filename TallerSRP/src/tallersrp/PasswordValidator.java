/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersrp;

/**
 *
 * @author juancamposbetancourth
 */
public class PasswordValidator {

    public PasswordValidator() {
    }
    
    public boolean validate(String password, String passwordV) {
        return password.equals(passwordV);
    }
}
