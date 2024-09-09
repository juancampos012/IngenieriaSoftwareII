/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7dip;

/**
 *
 * @author juancamposbetancourth
 */
public class SistemaEnviosDHL {
    IProcesarOrdenDHL procesarOrdenDHL;

    public SistemaEnviosDHL(IProcesarOrdenDHL procesarOrdenDHL) {
        this.procesarOrdenDHL = procesarOrdenDHL;
    }
        
     public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
     }
}
