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
public class ImpresoraInkJetAdapter implements Impresora {
    private ImpresoraInkJet impresoraInkJet;
    
    public ImpresoraInkJetAdapter(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }
    
    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta();
    }
}