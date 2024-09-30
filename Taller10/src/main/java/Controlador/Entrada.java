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
public class Entrada {
    private String codigo;
    private String tipo;
    private double precio;
    private boolean disponible;

    public Entrada(String codigo, String tipo, double precio, boolean disponible) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void comprarEntrada(String tipo) {
        if (this.tipo.equals(tipo)) {
            if (this.disponible) {
                this.disponible = false; 
                System.out.println("ENTRADA COMPRADA. Código: " + codigo);
            } else {
                System.out.println("ENTRADA NO DISPONIBLE");
            }
        } else {
            System.out.println("TIPO DE ENTRADA NO COINCIDE");
        }
    }
}
