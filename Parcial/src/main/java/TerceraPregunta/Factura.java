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
public abstract class Factura {
    String codigo;
    String total;
    Cliente cliente;

    public Factura(String codigo, String total, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }
    
    
}