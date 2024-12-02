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
public class EjemploPatronObserver2 {
  public static void main(String[] args) {
    CanalNoticias canal = new CanalNoticias();
    
    Observador usuario1 = new Usuario("CAMILO");
    Observador usuario2 = new Usuario("MARIA");
    Observador usuario3 = new Usuario("GUILLERMO");
    
    canal.agregarSuscriptor(usuario1);
    canal.agregarSuscriptor(usuario2);
    canal.agregarSuscriptor(usuario3);
    
    Noticia noticia = new Noticia("SE MURIO MARAPPE CON EL MADRID");
    CanalNoticias.notificarSuscriptores(noticia);
  }
}