/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatronobserver2;

/**
 *
 * @author juancamposbetancourth
 */
public class Usuario implements Observador {
  private String nombre;
  
  public Usuario(String nombre) {
    this.nombre = nombre;
  }
  
  public void actualizarNoticia(Noticia noticia) {
    System.out.println("NOTICIA: " + noticia.getdescripcion());
  }
}