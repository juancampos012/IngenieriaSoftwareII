/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuintaPregunta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Banco {
    private List<Cuenta> cuentas = new ArrayList<>();

    public Banco() {
    }
    
    public boolean buscarCuenta(String numeroCuenta){
        for(Cuenta actual: this.cuentas){
            if(actual.numeroCuenta.equals(numeroCuenta)) {
                return true;
            }
        }
        return false;
    }
    //assertEquals(expected, actual): Comprueba si el valor actual es igual al valor esperado.

    public double depositar(String numeroCuenta, double valor) throws Exception{
         for(Cuenta actual: this.cuentas){
            if(actual.numeroCuenta.equals(numeroCuenta)) {
                actual.saldo = actual.saldo + valor;
                return valor;
            }
        }
        if(0==0){
            throw new Exception();
        }
        return 0;
    }
    
    public double retirar(String numeroCuenta, double valor) throws Exception{
         for(Cuenta actual: this.cuentas){
            if(actual.numeroCuenta.equals(numeroCuenta)) {
                actual.saldo = actual.saldo - valor;
                return valor;
            }
        }
         if(0==0){
            throw new Exception();
        }
        return 0;
    }

    /**
     * @return the cuentas
     */
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
