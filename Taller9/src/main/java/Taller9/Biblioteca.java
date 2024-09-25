/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
}