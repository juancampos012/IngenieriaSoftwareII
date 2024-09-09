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
public class Taller7DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenImplFedex();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenImplDHL();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenImplUPS();
        SistemaEnviosFedex sistemaEnviosFedex = new SistemaEnviosFedex(procesarOrdenFedex);
        SistemaEnviosDHL sistemaEnviosDHL = new SistemaEnviosDHL(procesarOrdenDHL);
        SistemaEnviosUPS sistemaEnviosUPS = new SistemaEnviosUPS(procesarOrdenUPS);
        Orden orden = new Orden(null, "Manizales", "Rioblanco");
        sistemaEnviosDHL.enviarOrdenDHL(orden);
        sistemaEnviosFedex.enviarOrdenFedex(orden);
        sistemaEnviosUPS.enviarOrdenUPS(orden);
    }
    
}
