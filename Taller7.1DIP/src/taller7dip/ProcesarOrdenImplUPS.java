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
public class ProcesarOrdenImplUPS implements IProcesarOrdenUPS{

    public ProcesarOrdenImplUPS() {
    }
   
    @Override
    public void enviarOrdenUPS(Orden orden) {
        System.out.println("UPS\nDesde: "+ orden.getLugarOrigen()+" \nHasta: "+orden.getLugarDestino());
    }
    
}