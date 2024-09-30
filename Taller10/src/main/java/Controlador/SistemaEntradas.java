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
import java.util.ArrayList;
import java.util.List;

public class SistemaEntradas {
    private List<Entrada> entradas;

    public SistemaEntradas() {
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void comprarEntrada(String tipo) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equals(tipo) && entrada.isDisponible()) {
                entrada.comprarEntrada(tipo);
                return; // Salir después de la compra
            }
        }
        System.out.println("NO HAY ENTRADAS DISPONIBLES PARA EL TIPO: " + tipo);
    }

    public void mostrarEntradas() {
        for (Entrada entrada : entradas) {
            System.out.println("Código: " + entrada.getCodigo() + ", Tipo: " + entrada.getTipo() + 
                               ", Precio: $" + entrada.getPrecio() + ", Disponible: " + entrada.isDisponible());
        }
    }
}
