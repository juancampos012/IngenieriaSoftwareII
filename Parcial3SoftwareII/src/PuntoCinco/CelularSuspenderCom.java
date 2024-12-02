/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoCinco;

/**
 *
 * @author juancamposbetancourth
 */
public class CelularSuspenderCom implements Comando{
    private Celular celular;

    public CelularSuspenderCom(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.suspender();
    }
}