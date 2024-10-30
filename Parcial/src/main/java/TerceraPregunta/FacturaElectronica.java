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
public class FacturaElectronica extends Factura{
    String numeroElectronico;
    
    public FacturaElectronica(String codigo, String total, Cliente cliente, String numeroElectronico) {
        super(codigo, total, cliente);
        this.numeroElectronico = numeroElectronico;
    }
    
}
