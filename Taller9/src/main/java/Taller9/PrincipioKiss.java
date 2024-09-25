/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller9;
import java.util.Arrays;

/**
 *
 * @author juancamposbetancourth
 */
public class PrincipioKiss {

    public PrincipioKiss() {
    }
    
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static int encontrarMayor(int[] numeros) {
        return Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);
    }   
}
