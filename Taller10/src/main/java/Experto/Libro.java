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
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int cantidad;

    public Libro(String titulo, String autor, String isbn, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularPrecioTotal(int cantidadComprada) {
        return precio * cantidadComprada;
    }
}
