/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author juancamposbetancourth
 */
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> intereses = new HashSet<>();
        intereses.add("Musica");
        intereses.add("Ciclismo");

        Usuario usuario = new UsuarioBuilder()
                .setNombre("Juan")
                .setEdad(20)
                .setCorreo("juan@autonoma.edu.co")
                .setIntereses(intereses)
                .build();

        System.out.println(usuario);
    }
}