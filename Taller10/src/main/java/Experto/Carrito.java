/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Carrito {
    private List<Libro> libros;

    public Carrito() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.calcularPrecioTotal(libro.getCantidad());
        }
        return total;
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
