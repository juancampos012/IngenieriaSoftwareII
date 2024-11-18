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
public class Main {
    public static void main(String[] args) {
        ImpresoraLaser laserPrinter = new ImpresoraLaser();
        ImpresoraInkJet inkJetPrinter = new ImpresoraInkJet();
        
        Impresora laserAdapter = new ImpresoraLaserAdapter(laserPrinter);
        Impresora inkJetAdapter = new ImpresoraInkJetAdapter(inkJetPrinter);
        
        laserAdapter.imprimir();   
        inkJetAdapter.imprimir();  
    }
}