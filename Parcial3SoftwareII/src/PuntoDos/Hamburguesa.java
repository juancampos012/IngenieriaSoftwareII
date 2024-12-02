/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoDos;

/**
 *
 * @author juancamposbetancourth
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoPan;
    private String tipoQueso;
    
    public Hamburguesa(Builder builder){
       this.tipoTomate = builder.tipoTomate;
       this.tipoCarne = builder.tipoCarne;
       this.tipoQueso = builder.tipoQueso;
       this.tipoPan = builder.tipoPan;    
    }

    @Override
    public String toString() {
        return tipoTomate + ", " + tipoCarne+ ", " +tipoQueso+", "+tipoPan;
    }
}
