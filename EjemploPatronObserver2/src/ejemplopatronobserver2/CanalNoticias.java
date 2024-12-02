/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatronobserver2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class CanalNoticias {
  private static List<Observador> observadores = new ArrayList<>();

    public CanalNoticias() {
        observadores = new ArrayList<>();
    }
  
  
  public static void notificarSuscriptores(Noticia noticia) {
    for(Observador o : observadores) {
      o.actualizarNoticia(noticia);
    }
  }
  
  public static void agregarSuscriptor(Observador usuario) {
    observadores.add(usuario);
  }
  
  public static void eliminarSuscriptor(Observador usuario) {
    observadores.remove(usuario);
  }
}