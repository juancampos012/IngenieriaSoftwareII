/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Producto productoOriginal = new Producto("Laptop", 1500.00, "Electrónica");

        Producto productoClon = productoOriginal.clone();

        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clon: " + productoClon);

        productoClon.setNombre("Laptop - Modelo 2");
        productoClon.setPrecio(1600.00);

        System.out.println("Producto Original después de modificar el clon: " + productoOriginal);
        System.out.println("Producto Clon modificado: " + productoClon);
    }
}
