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
public class ProcesarOrdenImplDHL implements IProcesarOrdenDHL{

    public ProcesarOrdenImplDHL() {
    }
   
    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println("DHL\nDesde: "+ orden.getLugarOrigen()+" \nHasta: "+orden.getLugarDestino());
    }
    
}
