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
public class ProcesarOrdenImplFedex implements IProcesarOrdenFedex{

    public ProcesarOrdenImplFedex() {
    }
    
    @Override
    public void enviarOrdenFedex(Orden orden) {
        System.out.println("Fedex\nDesde: "+ orden.getLugarOrigen()+" \nHasta: "+orden.getLugarDestino());
    }
    
}
