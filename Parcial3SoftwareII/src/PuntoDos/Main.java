/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoDos;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder().setTipoCarne("Lomo").setTipoPan("Artesanal").setTipoQueso("Mozarella").setTipoTomate("Rojo");
        
        Hamburguesa hamburguesa = builder.build();
        System.out.println(hamburguesa.toString());
    }
}
