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
public class ComputadorApagarCom implements Comando{
    private Computador computador;

    public ComputadorApagarCom(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.apagar();
    }
}
