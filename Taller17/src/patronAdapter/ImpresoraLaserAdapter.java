/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronAdapter;

/**
 *
 * @author juancamposbetancourth
 */
public class ImpresoraLaserAdapter implements Impresora {
    private ImpresoraLaser impresoraLaser;
    
    public ImpresoraLaserAdapter(ImpresoraLaser impresoraLaser) {
        this.impresoraLaser = impresoraLaser;
    }
    
    @Override
    public void imprimir() {
        impresoraLaser.imprimirConLaser();
    }
}