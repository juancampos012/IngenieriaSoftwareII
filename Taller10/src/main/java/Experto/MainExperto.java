/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experto;

/**
 *
 * @author juancamposbetancourth
 */
public class MainExperto {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789", 10.50, 2);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321", 15.00, 1);

        Carrito carrito = new Carrito();
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total del pedido es: $" + total);
    }
}
