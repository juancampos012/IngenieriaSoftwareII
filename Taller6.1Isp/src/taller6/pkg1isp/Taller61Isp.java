/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6.pkg1isp;

/**
 *
 * @author juancamposbetancourth
 */
public class Taller61Isp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteGrande paqueteGrande = new PaqueteGrande(30.0, "Terrestre", 10.0, 50.0);
        paqueteGrande.calcularCostoEnvioGrande();

        PaquetePeligroso paquetePeligroso = new PaquetePeligroso("Inflamable", true, 5.0, 20.0);
        paquetePeligroso.verificarContenidoPeligroso();
        paquetePeligroso.asegurarContenidoPeligroso();

        PaquetePequeño paquetePequeño = new PaquetePequeño(100000, 3.0, 10.0);
        paquetePequeño.calcularCostoEnvioPequeño();
    }
    
}
