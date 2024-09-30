/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        // Crear el sistema de entradas
        SistemaEntradas sistema = new SistemaEntradas();

        // Agregar algunas entradas
        sistema.agregarEntrada(new Entrada("E001", "general", 50.0, true));
        sistema.agregarEntrada(new Entrada("E002", "VIP", 100.0, true));
        sistema.agregarEntrada(new Entrada("E003", "general", 50.0, false)); // No disponible

        // Mostrar entradas disponibles
        System.out.println("Entradas disponibles:");
        sistema.mostrarEntradas();

        // Comprar una entrada
        sistema.comprarEntrada("general");
        sistema.comprarEntrada("VIP");

        // Mostrar entradas después de la compra
        System.out.println("\nEntradas después de la compra:");
        sistema.mostrarEntradas();
    }
}
