/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariacionesProtegidas;

/**
 *
 * @author juancamposbetancourth
 */
public class Notificacion {
    private String titulo;
    private String cuerpo;

    public Notificacion(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nCuerpo: " + cuerpo;
    }
}

