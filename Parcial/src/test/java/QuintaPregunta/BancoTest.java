/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuintaPregunta;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author juancamposbetancourth
 */
public class BancoTest {
    Banco banco = new Banco();
    
    public BancoTest() {
    }
    
    @BeforeAll
    public static void Crear() {
        List<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuenta1 = new Cuenta("11", 0);
        Cuenta cuenta2 = new Cuenta("11", 0);
        Cuenta cuenta3 = new Cuenta("11", 0);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
    }
    
    /**
     * Test of buscarCuenta method, of class Banco.
     */
    @Test
    public void testBuscarCuenta() {
        System.out.println("buscarCuenta");
        String numeroCuenta = "10";
        Banco instance = new Banco();
        boolean expResult = false;
        boolean result = instance.buscarCuenta(numeroCuenta);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class Banco.
     */
    @Test
    public void testDepositar() throws Exception {
        System.out.println("depositar");
        String numeroCuenta = "10";
        double valor = 0.0;
        Banco instance = new Banco();
        double expResult = 0.0;
        double result = instance.depositar(numeroCuenta, valor);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class Banco.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        String numeroCuenta = "";
        double valor = 0.0;
        Banco instance = new Banco();
        double expResult = 0.0;
        double result = instance.retirar(numeroCuenta, valor);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
}
