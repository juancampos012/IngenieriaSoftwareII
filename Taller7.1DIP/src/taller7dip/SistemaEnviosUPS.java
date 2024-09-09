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
public class SistemaEnviosUPS {
    IProcesarOrdenUPS procesarOrdenUPS;

    public SistemaEnviosUPS(IProcesarOrdenUPS procesarOrdenUPS) {
        this.procesarOrdenUPS = procesarOrdenUPS;
    }
    
     public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
