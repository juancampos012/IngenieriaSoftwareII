/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.Set;

/**
 *
 * @author juancamposbetancourth
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;

    Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = builder.intereses;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", intereses=" + intereses +
                '}';
    }
}