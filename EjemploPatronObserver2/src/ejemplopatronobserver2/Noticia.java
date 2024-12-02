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
public class Noticia {
  private String descripcion;
  
  public Noticia(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public String getdescripcion() {
    return descripcion;
  }
}