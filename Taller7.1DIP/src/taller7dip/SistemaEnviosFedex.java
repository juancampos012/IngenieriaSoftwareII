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
public class SistemaEnviosFedex {
    IProcesarOrdenFedex procesarOrdenFedex;

    public SistemaEnviosFedex(IProcesarOrdenFedex procesarOrden) {
        this.procesarOrdenFedex = procesarOrden;
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
}
