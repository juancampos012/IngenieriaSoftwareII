/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceraPregunta;


/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("", "", "");
        Factura factura1 = new FacturaElectronica("", "", cliente, "");
        Factura factura2 = new FacturaFisica("", "", cliente);
    }
}
    