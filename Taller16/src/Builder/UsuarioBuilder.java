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
public class UsuarioBuilder {
    protected String nombre;
    protected int edad;
    protected String correo;
    protected Set<String> intereses;

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder setIntereses(Set<String> intereses) {
        this.intereses = intereses;
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }
}