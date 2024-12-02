/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoCuatro;

/**
 *
 * @author juancamposbetancourth
 */
public class Configuracion {
    private static Configuracion instancia;
    private String url;
    private String usuario;
    private String password;
    
    private Configuracion(String url, String usuario, String password){
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }
    
    public static Configuracion getInstancia(String url, String usuario, String password){
        if(instancia == null){
            instancia = new Configuracion(url, usuario, password);
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }  
    
}
