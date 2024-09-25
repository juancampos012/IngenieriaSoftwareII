/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller9;

/**
 *
 * @author juancamposbetancourth
 */
public class Libro {
        private String titulo;
        private String autor;
        private int añoPublicacion;

        // Constructor
        public Libro(String titulo, String autor, int añoPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.añoPublicacion = añoPublicacion;
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAñoPublicacion() {
            return añoPublicacion;
        }

        // Setters
        public void setAñoPublicacion(int añoPublicacion) {
            this.añoPublicacion = añoPublicacion;
        }
}
