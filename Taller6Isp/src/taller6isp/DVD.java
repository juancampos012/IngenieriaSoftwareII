/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6isp;

/**
 *
 * @author juancamposbetancourth
 */
public class DVD implements LibreriaDVD{
    private String nombre;
    private String archivo;
    private int stock;

    public DVD(String nombre, String archivo, int stock) {
        this.nombre = nombre;
        this.archivo = archivo;
        this.stock = stock;
    }

    @Override
    public void prestar() {
        System.out.println("DVd "+this.nombre+" prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("DVd "+this.nombre+" devuelto.");
    }
}
