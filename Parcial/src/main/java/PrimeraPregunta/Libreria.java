/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraPregunta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public Libreria() {
    }
    
    public Libro crearLibro(String titulo, String autor, double precio, int año){
        Libro libro = new Libro(titulo, autor, precio, año);
        libros.add(libro);
        return libro;
    }
    
    public Libro buscarNombre(String titulo){
        for(Libro actual:this.libros){
            if(actual.getTitulo().equals(titulo)){
                return actual;
            }
        }
        return null;
    }
    
    public Libro buscarAutor(String autor){
        for(Libro actual:this.libros){
            if(actual.getAutor().equals(autor)){
                return actual;
            }
        }
        return null;
    }
    
    public Libro buscarAño(int año){
        for(Libro actual:this.libros){
            if(actual.getAño() == año){
                return actual;
            }
        }
        return null;
    }
    
    public List<Libro> buscarPrecio(double precioMinimo, double precioMaximo){
        List<Libro> resultado = new ArrayList<>();
        for(Libro actual:this.libros){
            if(actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo){
                resultado.add(actual);
            }
        }
        return resultado;
    }
    
    
} 
