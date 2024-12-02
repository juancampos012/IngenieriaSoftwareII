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
public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        
        Comando celularApagar = new CelularApagarCom(celular);
        Comando celularEncender = new CelularEncenderCom(celular);
        Comando celularSuspender = new CelularSuspenderCom(celular);
        Comando celularReiniciar = new CelularReiniciarCom(celular);
        celularApagar.ejecutar();
        celularEncender.ejecutar();
        celularSuspender.ejecutar();
        celularReiniciar.ejecutar();
        
        Computador computador = new Computador();
        
        Comando computadorApagar = new ComputadorApagarCom(computador);
        Comando computadorEncender = new ComputadorEncenderCom(computador);
        Comando computadorSuspender = new ComputadorSuspenderCom(computador);
        Comando computadorReiniciar = new ComputadorReiniciarCom(computador);
        computadorApagar.ejecutar();
        computadorEncender.ejecutar();
        computadorSuspender.ejecutar();
        computadorReiniciar.ejecutar();
    }
}
