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
public class Builder {
    public String tipoTomate;
    public String tipoCarne;
    public String tipoPan;
    public String tipoQueso;

    public Builder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }

    public Builder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }
    
    public Builder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }
    
   public Builder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    
    public Hamburguesa build(){
        return new Hamburguesa(this);
    }
}
