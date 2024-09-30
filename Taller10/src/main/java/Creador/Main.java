/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunas computadoras
        Computadora comp1 = Computadora.crearComputadora("Intel i5", "NVIDIA GTX 1650", 8);
        Computadora comp2 = Computadora.crearComputadora("AMD Ryzen 5", "NVIDIA RTX 3060", 16);

        // Crear una orden y agregar computadoras
        Orden orden = new Orden();
        orden.agregarComputadora(comp1);
        orden.agregarComputadora(comp2);

        // Calcular el total de la orden
        double total = orden.calcularTotal();
        System.out.println("El total de la orden es: $" + total);
    }
}

