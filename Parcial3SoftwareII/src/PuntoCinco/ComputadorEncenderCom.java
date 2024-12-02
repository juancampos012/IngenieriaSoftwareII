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
public class ComputadorEncenderCom implements Comando{
    private Computador computador;

    public ComputadorEncenderCom(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.encender();
    }
}