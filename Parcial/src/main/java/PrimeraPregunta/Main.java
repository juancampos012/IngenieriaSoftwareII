/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class Main {
    public static void main(String[] args) {
        Orden orden = new Orden();
        System.out.println(orden.calcularTotalConImpuesto(1000));
        System.out.println(orden.calcularDescuentoTotal(1000, 500));    
        
        OrdenEstado ordenEstado = new OrdenEstado();
        System.out.println(ordenEstado.obtenerEstado(10));
        
        Libreria libreria = new Libreria();
        libreria.crearLibro("hola mundo", "juan", 15000, 2020);
        libreria.crearLibro("hola", "jose", 5000, 2010);
        libreria.crearLibro("mundo", "alejo", 25000, 2013);
        System.out.println(libreria.buscarAutor("juan").getTitulo());
        System.out.println(libreria.buscarAño(2010).getTitulo());
        System.out.println(libreria.buscarPrecio(0, 10000));
        System.out.println(libreria.buscarNombre("hola mundo").getTitulo());
    }
}