/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller9;

import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class Taller9 {
        public static void main(String[] args) {
            System.out.println("Probando DRY :");
            ValidadEmailDry validarEmail = new ValidadEmailDry();
            validarEmail.validarEmail("correo_invalido");
            validarEmail.validarEmail("valido@correo.com"); 

            System.out.println("\nProbando KISS:");
            String cadena = "Hola Mundo";
            System.out.println("Cadena original: " + cadena);
            System.out.println("Cadena invertida: " + PrincipioKiss.invertirCadena(cadena));

            int[] numeros = {10, 50, 20, 80, 30};
            System.out.println("Número mayor: " + PrincipioKiss.encontrarMayor(numeros));

            System.out.println("\nProbando YAGNI:");
            Biblioteca biblioteca = new Biblioteca();
            Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
            Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);

            List<Libro> libros = biblioteca.getLibros();
            for (Libro libro : libros) {
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año de Publicación: " + libro.getAñoPublicacion());
            }
            System.out.println("\n");
        }
}
